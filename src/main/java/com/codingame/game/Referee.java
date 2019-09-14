package com.codingame.game;
import java.util.List;

import com.codingame.gameengine.core.AbstractPlayer.TimeoutException;
import com.codingame.gameengine.core.AbstractReferee;
import com.codingame.gameengine.core.MultiplayerGameManager;
import com.codingame.gameengine.module.entities.GraphicEntityModule;
import com.codingame.gameengine.module.toggle.ToggleModule;
import com.codingame.view.AnimatedEventModule;
import com.codingame.view.ViewerEvent;
import com.google.inject.Inject;

public class Referee extends AbstractReferee {
    // Uncomment the line below and comment the line under it to create a Solo Game
    // @Inject private SoloGameManager<Player> gameManager;
    @Inject private MultiplayerGameManager<Player> gameManager;
    @Inject private GraphicEntityModule graphicEntityModule;
    @Inject private AnimatedEventModule animatedEventModule;
    @Inject private ToggleModule toggleModule;

    @Override
    public void init() {
        graphicEntityModule.createText("Click the gear in the bottom right corner\nto toggle the sound.\n\nThis won't affect already playing sound\nbut only new sound events").setFillColor(0xbbbbbb)
        .setX(100).setY(100).setFontSize(40);
    }

    @Override
    public void gameTurn(int turn) {
        ViewerEvent soundEvent = animatedEventModule.createAnimationEvent("Sound", 0.0);
        soundEvent.params.put("path", "sounds/death.wav");
        soundEvent.params.put("toggle", "soundToggle");

        for (Player player : gameManager.getActivePlayers()) {
            player.sendInputLine("input");
            player.execute();
        }

        for (Player player : gameManager.getActivePlayers()) {
            try {
                List<String> outputs = player.getOutputs();
                // Check validity of the player output and compute the new game state
            } catch (TimeoutException e) {
                player.deactivate(String.format("$%d timeout!", player.getIndex()));
            }
        }        
    }
}
