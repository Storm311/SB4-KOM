package dk.sdu.storm331.cbse.components;

import dk.sdu.storm331.cbse.common.data.GameData;
import dk.sdu.storm331.cbse.common.data.World;
import dk.sdu.storm331.cbse.common.services.IPostEntityProcessingService;
import dk.sdu.storm331.cbse.common.util.SPILocator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("postProcessorInjector")
public class PostProcessInjection implements IProcessor {
    @Override
    public void process(GameData gameData, World world) {
        List<IPostEntityProcessingService> processors = SPILocator.locateAll(IPostEntityProcessingService.class);
        processors.forEach((processor) -> processor.process(gameData, world));
    }
}