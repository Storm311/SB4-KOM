import dk.sdu.storm331.cbse.common.services.IEntityProcessingService;
import dk.sdu.storm331.cbse.common.services.IGamePluginService;

module Bullet {
    requires Common;
    requires CommonBullet;

    provides IGamePluginService with dk.sdu.storm331.cbse.bullet.BulletPlugin;
    provides IEntityProcessingService with dk.sdu.storm331.cbse.bullet.BulletControlSystem;
}