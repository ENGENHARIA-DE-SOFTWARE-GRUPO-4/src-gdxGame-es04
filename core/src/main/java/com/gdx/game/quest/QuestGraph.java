package com.gdx.game.quest;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Json;
import com.gdx.game.entities.Entity;
import com.gdx.game.entities.EntityConfig;
import com.gdx.game.map.MapManager;
import com.gdx.game.profile.ProfileManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class QuestGraph {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestGraph.class);

    private Hashtable<String, QuestTask> questTasks;

    private Hashtable<String, ArrayList<String>> questTaskDependencies;

    private String questTitle;

    private String questID;

    private boolean isQuestComplete;

    private int goldReward;

    private int xpReward;

    public QuestGraph() {
        this.questTasks = new Hashtable<>();
        this.questTaskDependencies = new Hashtable<>();
    }

    public int getGoldReward() {
        return goldReward;
    }

    public void setGoldReward(int goldReward) {
        this.goldReward = goldReward;
    }

    public int getXpReward() {
        return xpReward;
    }

    public void setXpReward(int xpReward) {
        this.xpReward = xpReward;
    }

    public boolean isQuestComplete() {
        return isQuestComplete;
    }

    public void setQuestComplete(boolean isQuestComplete) {
        this.isQuestComplete = isQuestComplete;
    }

    public String getQuestID() {
        return questID;
    }

    public void setQuestID(String questID) {
        this.questID = questID;
    }

    public String getQuestTitle() {
        return questTitle;
    }

    public void setTasks(Hashtable<String, QuestTask> questTasks) {

        this.questTasks = questTasks;
        this.questTaskDependencies = new Hashtable<>(questTasks.size());

        for(QuestTask questTask: questTasks.values()) {
            questTaskDependencies.put(questTask.getId(), new ArrayList<>());
        }
    }

    public ArrayList<QuestTask> getAllQuestTasks() {
        Enumeration<QuestTask> enumeration = questTasks.elements();
        return Collections.list(enumeration);
    }

    public boolean isValid(String taskID) {
        QuestTask questTask = questTasks.get(taskID);
        return questTask != null;
    }

    public boolean isReachable(String sourceID, String sinkID) {
        Set<String> reachableNodes = new HashSet<>();
        return isReachable(sourceID, sinkID, reachableNodes);
    }

    private boolean isReachable(String sourceId, String targetId, Set<String> reachableNodes) {
        if (sourceId.equals(targetId))
            return true;

        reachableNodes.add(sourceId);
        List<String> dependencies = questTaskDependencies.computeIfAbsent(sourceId, k -> new ArrayList<>());
        for (String depId : dependencies) {
            if (!reachableNodes.contains(depId) && isReachable(depId, targetId, reachableNodes))
                return true;
        }

        return false;
    }

    public QuestTask getQuestTaskByID(String id) {
        return (isValid(id)) ? questTasks.get(id) : null;
    }

    public void addDependency(String sourceId, String destinationId) {
        ArrayList<String> list = questTaskDependencies.computeIfAbsent(sourceId, k -> new ArrayList<>());
        list.add(destinationId);
    }

    public boolean doesQuestTaskHaveDependencies(String id) {
        QuestTask task = getQuestTaskByID(id);
        if (task == null) {
            return false;
        }
        ArrayList<String> list = questTaskDependencies.get(id);
        return !list.isEmpty();
    }

    public boolean updateQuestForReturn() {
        ArrayList<QuestTask> tasks = getAllQuestTasks();
        QuestTask readyTask = null;

        //First, see if all tasks are available, meaning no blocking dependencies
        for(QuestTask task : tasks) {
            if (!isQuestTaskAvailable(task.getId())) {
                return false;
            }
            if (!task.isTaskComplete()) {
                if (task.getQuestType().equals(QuestTask.QuestType.RETURN)) {
                    readyTask = task;
                } else {
                    return false;
                }
            }
        }
        if (readyTask == null) {
            return false;
        }
        readyTask.setTaskComplete();
        return true;
    }

    public boolean isQuestTaskAvailable(String id) {
        QuestTask task = getQuestTaskByID(id);
        if (task == null) {
            return false;
        }
        ArrayList<String> list = questTaskDependencies.get(id);

        for(String depId: list) {
            QuestTask depTask = getQuestTaskByID(depId);
            if (depTask == null || depTask.isTaskComplete()) {
                continue;
            }
            if (depId.equalsIgnoreCase(id)) {
                return false;
            }
        }
        return true;
    }

    public void setQuestTaskComplete(String id) {
        QuestTask task = getQuestTaskByID(id);
        if (task == null) {
            return;
        }
        task.setTaskComplete();
    }

    public void update(MapManager mapMgr) {
        ArrayList<QuestTask> allQuestTasks = getAllQuestTasks();
        for(QuestTask questTask: allQuestTasks) {

            if (questTask.isTaskComplete()) {
                continue;
            }

            //We first want to make sure the task is available and is relevant to current location
            if (!isQuestTaskAvailable(questTask.getId())) {
                continue;
            }

            String taskLocation = questTask.getPropertyValue(QuestTask.QuestTaskPropertyType.TARGET_LOCATION.toString());
            if (taskLocation == null || taskLocation.isEmpty() || !taskLocation.equalsIgnoreCase(mapMgr.getCurrentMapType().toString())) {
                continue;
            }

            switch(questTask.getQuestType()) {
                case FETCH:
                    String taskConfig = questTask.getPropertyValue(QuestTask.QuestTaskPropertyType.TARGET_TYPE.toString());
                    if (taskConfig == null || taskConfig.isEmpty()) {
                        break;
                    }
                    EntityConfig config = Entity.getEntityConfig(taskConfig);

                    Array<Vector2> questItemPositions = ProfileManager.getInstance().getProperty(config.getEntityID(), Array.class);
                    if (questItemPositions == null) {
                        break;
                    }

                    //Case where all the items have been picked up
                    if (questItemPositions.size == 0) {
                        questTask.setTaskComplete();
                        LOGGER.debug("TASK : {} is complete of Quest: {}", questTask.getId(), questID);
                        LOGGER.debug("INFO : {}", QuestTask.QuestTaskPropertyType.TARGET_TYPE);
                    }
                    break;
                case KILL:
                    break;
                case DELIVERY:
                    break;
                case GUARD:
                    break;
                case ESCORT:
                    break;
                case RETURN:
                    break;
                case DISCOVER:
                    break;
            }
        }
    }

    public void init(MapManager mapMgr) {
        ArrayList<QuestTask> allQuestTasks = getAllQuestTasks();
        for(QuestTask questTask: allQuestTasks) {

            if (questTask.isTaskComplete()) {
                continue;
            }

            //We first want to make sure the task is available and is relevant to current location
            if (!isQuestTaskAvailable(questTask.getId())) {
                continue;
            }

            String taskLocation = questTask.getPropertyValue(QuestTask.QuestTaskPropertyType.TARGET_LOCATION.toString());
            if (taskLocation == null || taskLocation.isEmpty() || !taskLocation.equalsIgnoreCase(mapMgr.getCurrentMapType().toString())) {
                continue;
            }

            switch(questTask.getQuestType()) {
                case FETCH:
                    Array<Entity> questEntities = new Array<>();
                    Array<Vector2> positions = mapMgr.getQuestItemSpawnPositions(questID, questTask.getId());
                    String taskConfig = questTask.getPropertyValue(QuestTask.QuestTaskPropertyType.TARGET_TYPE.toString());
                    if (taskConfig == null || taskConfig.isEmpty()) {
                        break;
                    }
                    EntityConfig config = Entity.getEntityConfig(taskConfig);

                    Array<Vector2> questItemPositions = ProfileManager.getInstance().getProperty(config.getEntityID(), Array.class);

                    if (questItemPositions == null) {
                        questItemPositions = new Array<>();
                        for(Vector2 position: positions) {
                            questItemPositions.add(position);
                            Entity entity = Entity.initEntity(config, position);
                            entity.getEntityConfig().setCurrentQuestID(questID);
                            questEntities.add(entity);
                        }
                    } else {
                        for(Vector2 questItemPosition: questItemPositions) {
                            Entity entity = Entity.initEntity(config, questItemPosition);
                            entity.getEntityConfig().setCurrentQuestID(questID);
                            questEntities.add(entity);
                        }
                    }

                    mapMgr.addMapQuestEntities(questEntities);
                    ProfileManager.getInstance().setProperty(config.getEntityID(), questItemPositions);
                    break;
                case KILL:
                    break;
                case DELIVERY:
                    break;
                case GUARD:
                    break;
                case ESCORT:
                    break;
                case RETURN:
                    break;
                case DISCOVER:
                    break;
            }
        }
    }

    public String toString() {
        return questTitle;
    }

    public String toJson() {
        Json json = new Json();
        return json.prettyPrint(this);
    }

}
