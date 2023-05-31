import dk.sdu.storm331.cbse.common.services.IEntityProcessingService;
import dk.sdu.storm331.cbse.common.services.IGamePluginService;
import dk.sdu.storm331.cbse.common.util.SPILocator;
import dk.sdu.storm331.cbse.common.bullet.BulletSPI;


module Player {
    requires Common;
    requires CommonBullet;

    uses SPILocator;
    uses BulletSPI;

    provides IGamePluginService with dk.sdu.storm331.cbse.playersystem.PlayerPlugin;
    provides IEntityProcessingService with dk.sdu.storm331.cbse.playersystem.PlayerControlSystem;
}