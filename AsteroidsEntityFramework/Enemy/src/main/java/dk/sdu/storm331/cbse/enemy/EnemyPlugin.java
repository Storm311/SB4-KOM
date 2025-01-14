package dk.sdu.storm331.cbse.enemy;

import dk.sdu.storm331.cbse.common.data.Entity;
import dk.sdu.storm331.cbse.common.data.GameData;
import dk.sdu.storm331.cbse.common.data.World;
import dk.sdu.storm331.cbse.common.data.entityparts.LifePart;
import dk.sdu.storm331.cbse.common.data.entityparts.MovingPart;
import dk.sdu.storm331.cbse.common.data.entityparts.PositionPart;
import dk.sdu.storm331.cbse.common.services.IGamePluginService;

public class EnemyPlugin implements IGamePluginService {
    private Entity enemy;

    public EnemyPlugin(){
    }


    @Override
    public void start(GameData gameData, World world) {
        enemy = createEnemyShip(gameData);
        world.addEntity(enemy);
    }

    private Entity createEnemyShip(GameData gameData) {

        float deacceleration = 10;
        float acceleration = 200;
        float maxSpeed = 300;
        float rotationSpeed = 5;
        float x =  100; // gameData.getDisplayWidth() / 2;
        float y = 100; //gameData.getDisplayHeight() / 2;
        float radians = 3.1415f / 2;

        Entity enemyShip = new Enemy();
        enemyShip.add(new MovingPart(deacceleration, acceleration, maxSpeed, rotationSpeed));
        enemyShip.add(new PositionPart(x, y, radians));
        enemyShip.add(new LifePart(10));

        return enemyShip;
    }

    @Override
    public void stop(GameData gameData, World world) {

    }
}
