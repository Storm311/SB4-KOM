package dk.sdu.storm331.cbse.components;

import dk.sdu.storm331.cbse.common.data.GameData;
import dk.sdu.storm331.cbse.common.data.World;

public interface IProcessor {
    /**
     * Process system
     *
     * @param gameData Data for the game
     * @param world World of the game
     *
     * @see GameData
     * @see World
     */
    void process(GameData gameData, World world);
}