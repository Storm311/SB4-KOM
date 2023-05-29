import dk.sdu.storm331.cbse.common.services.IEntityProcessingService;
import dk.sdu.storm331.cbse.common.services.IGamePluginService;
import dk.sdu.storm331.cbse.common.util.SPILocator;

module Enemy {
    requires Common;

    uses SPILocator;

    provides IGamePluginService with dk.sdu.storm331.cbse.enemy.EnemyPlugin;
    provides IEntityProcessingService with dk.sdu.storm331.cbse.enemy.EnemyControlSystem;
}