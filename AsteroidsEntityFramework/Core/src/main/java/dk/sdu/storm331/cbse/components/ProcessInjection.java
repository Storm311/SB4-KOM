package dk.sdu.storm331.cbse.components;

import dk.sdu.storm331.cbse.common.data.GameData;
import dk.sdu.storm331.cbse.common.data.World;
import dk.sdu.storm331.cbse.common.services.IEntityProcessingService;
import dk.sdu.storm331.cbse.common.util.SPILocator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("processorInjector")
public class ProcessInjection implements IProcessor {
    @Override
    public void process(GameData gameData, World world) {
        List<IEntityProcessingService> processors = SPILocator.locateAll(IEntityProcessingService.class);
        processors.forEach((processor) -> processor.process(gameData, world));
    }
}