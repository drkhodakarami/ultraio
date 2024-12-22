package jiraiyah.ultraio_base;

import jiraiyah.ultraio_base.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DatagenBase implements DataGeneratorEntrypoint {
	@Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
    {
        MainBase.LOGGER.logDatagen();

        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(BaseBlockTagProvider::new);
        pack.addProvider(BaseItemTagProvider::new);
        pack.addProvider(BaseEntityTagProvider::new);
        pack.addProvider(BaseLootTableProvider::new);
        pack.addProvider(BaseModelProvider::new);
        pack.addProvider(BaseRecipeProvider::new);
        pack.addProvider(BaseEnLanguageProvider::new);
	}
}