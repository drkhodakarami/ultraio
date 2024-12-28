package jiraiyah.ultraio_base;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DatagenBase implements DataGeneratorEntrypoint {
	@Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
    {
        MainBase.LOGGER.logDatagen();

        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
	}
}