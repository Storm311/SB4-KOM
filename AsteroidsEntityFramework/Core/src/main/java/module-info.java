import dk.sdu.storm331.cbse.common.services.IEntityProcessingService;
import dk.sdu.storm331.cbse.common.services.IGamePluginService;
import dk.sdu.storm331.cbse.common.services.IPostEntityProcessingService;

module Core {
    requires Common;
    requires java.desktop;
    requires com.badlogic.gdx;
    requires spring.context;



    uses IGamePluginService;
    uses IEntityProcessingService;
    uses IPostEntityProcessingService;

    exports dk.sdu.storm331.cbse.components;
    exports dk.sdu.storm331.cbse.main;
}