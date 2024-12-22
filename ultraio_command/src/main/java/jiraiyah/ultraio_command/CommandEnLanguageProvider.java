package jiraiyah.ultraio_command;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CommandEnLanguageProvider extends FabricLanguageProvider
{
    protected CommandEnLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder builder)
    {
        builder.add(MainCommand.REFERENCE.identifier(MainCommand.REFERENCE.DCLR_ERROR_ID_NAME), "Wrong Type, it should be one of the choices: ore, block, fluid, all");
        builder.add(MainCommand.REFERENCE.identifier(MainCommand.REFERENCE.DCLR_START_ID_NAME), "Starting to Clean");
        builder.add(MainCommand.REFERENCE.identifier(MainCommand.REFERENCE.DCLR_END_ID_NAME), "Finished Cleaning");
    }
}