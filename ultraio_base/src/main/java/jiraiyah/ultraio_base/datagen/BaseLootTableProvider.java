package jiraiyah.ultraio_base.datagen;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_base.registry.BaseBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class BaseLootTableProvider extends FabricBlockLootTableProvider
{
    public BaseLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {
        MainBase.LOGGER.logG("Generating Loot Table Data");

        addDrop(BaseBlocks.CITRINE);
        addDrop(BaseBlocks.ENDERITE);
        addDrop(BaseBlocks.RUBY);
        addDrop(BaseBlocks.SAPPHIRE);

        addDrop(BaseBlocks.RAW_CITRINE);
        addDrop(BaseBlocks.RAW_ENDERITE);
        addDrop(BaseBlocks.RAW_QUARTZ);
        addDrop(BaseBlocks.RAW_RUBY);
        addDrop(BaseBlocks.RAW_SAPPHIRE);

        addDrop(BaseBlocks.CARROT_BOX);
        addDrop(BaseBlocks.POTATO_BOX);
        addDrop(BaseBlocks.ELEVATOR);
    }
}