package com.gdx.game.quest;

@FunctionalInterface
public interface QuestTaskHandler {

    void handleUpdate(QuestTask questTask, String questID);

}
