package jiraiyah.ultraio_command;

import jiraiyah.ultraio_command.MainCommand;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class DatagenCommand implements DataGeneratorEntrypoint
{
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
    {
        MainCommand.LOGGER.logDatagen();
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(CommandEnLanguageProvider::new);
    }
}