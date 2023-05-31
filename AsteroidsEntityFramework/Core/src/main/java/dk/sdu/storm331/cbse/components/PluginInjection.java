package dk.sdu.storm331.cbse.components;

import dk.sdu.storm331.cbse.common.data.GameData;
import dk.sdu.storm331.cbse.common.data.World;
import dk.sdu.storm331.cbse.common.services.IGamePluginService;
import dk.sdu.storm331.cbse.common.util.SPILocator;
import org.springframework.stereotype.Service;


import java.util.List;

@Service("pluginInjector")
public class PluginInjection {

    public void startPlugins(GameData gameData, World world) {
        List<IGamePluginService> plugins = SPILocator.locateAll(IGamePluginService.class);
        plugins.forEach((plugin) -> plugin.start(gameData, world));
    }
}