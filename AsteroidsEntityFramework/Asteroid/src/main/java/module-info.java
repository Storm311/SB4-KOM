import dk.sdu.storm331.cbse.common.services.IEntityProcessingService;
import dk.sdu.storm331.cbse.common.services.IGamePluginService;

module Asteroid {
    requires Common;
    requires CommonAsteroid;

    provides IGamePluginService with dk.sdu.storm331.cbse.asteroid.AsteroidPlugin;
    provides IEntityProcessingService with dk.sdu.storm331.cbse.asteroid.AsteroidProcessor;
}