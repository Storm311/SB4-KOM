package dk.sdu.storm331.cbse.common.services;

import dk.sdu.storm331.cbse.common.data.GameData;
import dk.sdu.storm331.cbse.common.data.World;

public interface IEntityProcessingService {

    void process(GameData gameData, World world);
}
