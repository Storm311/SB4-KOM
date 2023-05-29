import dk.sdu.storm331.cbse.common.services.IPostEntityProcessingService;

module Collision {
    requires Common;

    provides IPostEntityProcessingService with dk.sdu.storm331.cbse.collisionsystem.CollisionDetection;
}