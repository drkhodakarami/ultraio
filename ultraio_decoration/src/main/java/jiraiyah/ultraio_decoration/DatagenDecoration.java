package jiraiyah.ultraio_decoration;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_base.datagen.*;
import jiraiyah.ultraio_decoration.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DatagenDecoration implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
    {
        MainDecoration.LOGGER.logDatagen();

        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(DecorationBlockTagProvider::new);
        pack.addProvider(DecorationLootTableProvider::new);
        pack.addProvider(DecorationModelProvider::new);
        pack.addProvider(DecorationRecipeProvider::new);
        pack.addProvider(DecorationEnLanguageProvider::new);
    }
}