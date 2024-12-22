package jiraiyah.ultraio_base.datagen;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_base.registry.BaseBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BaseBlockTagProvider extends FabricTagProvider.BlockTagProvider
{
    public BaseBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        MainBase.LOGGER.logG("Generating Block Tag Data");

        getOrCreateTagBuilder(MainBase.REFERENCE.INCORRECT_FOR_ENDERITE_TOOL);

        getOrCreateTagBuilder(MainBase.REFERENCE.HAMMER_BLACKLIST)
                .add(BaseBlocks.ANGEL)
                .add(BaseBlocks.ELEVATOR);

        getOrCreateTagBuilder(MainBase.REFERENCE.EXCAVATOR_BLACKLIST)
                .add(BaseBlocks.ELEVATOR)
                .add(BaseBlocks.ANGEL);

        getOrCreateTagBuilder(MainBase.REFERENCE.GEM_BLOCKS);

        getOrCreateTagBuilder(MainBase.REFERENCE.IS_MACHINE)
                .add(BaseBlocks.ELEVATOR)
                .add(BaseBlocks.ANGEL);
    }
}