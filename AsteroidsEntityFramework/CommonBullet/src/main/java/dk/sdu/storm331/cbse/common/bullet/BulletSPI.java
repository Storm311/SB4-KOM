package dk.sdu.storm331.cbse.common.bullet;

import dk.sdu.storm331.cbse.common.data.Entity;
import dk.sdu.storm331.cbse.common.data.GameData;

public interface BulletSPI {
    Entity createBullet(Entity e, GameData gameData);
}