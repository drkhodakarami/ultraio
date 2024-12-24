package jiraiyah.ultraio_effect;

import jiraiyah.ultraio_effect.datagen.EffectEnLanguageProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DatagenEffect implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
    {
        MainEffect.LOGGER.logDatagen();
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(EffectEnLanguageProvider::new);
    }
}