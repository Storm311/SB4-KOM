package dk.sdu.storm331.cbse.enemy;

import dk.sdu.storm331.cbse.common.data.Entity;
import dk.sdu.storm331.cbse.common.data.GameData;
import dk.sdu.storm331.cbse.common.data.World;
import dk.sdu.storm331.cbse.common.data.entityparts.LifePart;
import dk.sdu.storm331.cbse.common.data.entityparts.MovingPart;
import dk.sdu.storm331.cbse.common.data.entityparts.PositionPart;
import dk.sdu.storm331.cbse.common.services.IEntityProcessingService;

import java.util.Random;


public class EnemyControlSystem implements IEntityProcessingService {


    @Override
    public void process(GameData gameData, World world) {
        for (Entity enemy : world.getEntities(Enemy.class)){
            PositionPart pos = enemy.getPart(PositionPart.class);
            MovingPart mov = enemy.getPart(MovingPart.class);
            LifePart lifePart = enemy.getPart(LifePart.class);

            Random rand = new Random();

            float rng = rand.nextFloat();

            if (rng > 0.1f && rng < 0.9f) {
                mov.setUp(true);
            }

            if (rng < 0.2f) {
                mov.setLeft(true);
            }

            if (rng > 0.8f) {
                mov.setRight(true);
            }

            mov.process(gameData, enemy);
            pos.process(gameData, enemy);
            lifePart.process(gameData, enemy);



            updateShape(enemy);

            mov.setRight(false);
            mov.setLeft(false);
            mov.setUp(false);
        }
    }
    private void updateShape(Entity entity) {
        float[] shapex = entity.getShapeX();
        float[] shapey = entity.getShapeY();
        PositionPart positionPart = entity.getPart(PositionPart.class);
        float x = positionPart.getX();
        float y = positionPart.getY();
        float radians = positionPart.getRadians();

        shapex[0] = (float) (x + Math.cos(radians) * 8);
        shapey[0] = (float) (y + Math.sin(radians) * 8);

        shapex[1] = (float) (x + Math.cos(radians - 4 * 3.1415f / 5) * 8);
        shapey[1] = (float) (y + Math.sin(radians - 4 * 3.1145f / 5) * 8);

        shapex[2] = (float) (x + Math.cos(radians + 3.1415f) * 5);
        shapey[2] = (float) (y + Math.sin(radians + 3.1415f) * 5);

        shapex[3] = (float) (x + Math.cos(radians + 4 * 3.1415f / 5) * 8);
        shapey[3] = (float) (y + Math.sin(radians + 4 * 3.1415f / 5) * 8);

        entity.setShapeX(shapex);
        entity.setShapeY(shapey);
    }

}
