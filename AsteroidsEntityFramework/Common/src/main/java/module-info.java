import dk.sdu.storm331.cbse.common.services.IGamePluginService;
import dk.sdu.storm331.cbse.common.services.IPostEntityProcessingService;
import dk.sdu.storm331.cbse.common.services.IEntityProcessingService;


module Common {


    exports dk.sdu.storm331.cbse.common.services;
    exports dk.sdu.storm331.cbse.common.data;
    exports dk.sdu.storm331.cbse.common.data.entityparts;
    exports dk.sdu.storm331.cbse.common.util;
    exports dk.sdu.storm331.cbse.common.events;

    uses IGamePluginService;
    uses IEntityProcessingService;
    uses IPostEntityProcessingService;
}