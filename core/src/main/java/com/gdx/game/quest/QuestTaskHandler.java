package com.gdx.game.quest;

@FunctionalInterface
public interface QuestTaskHandler {

    void handle(QuestTask questTask, String questID);

}
