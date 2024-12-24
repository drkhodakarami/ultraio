package jiraiyah.ultraio_decoration.datagen;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_decoration.MainDecoration;
import jiraiyah.ultraio_decoration.registry.DecorationBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class DecorationBlockTagProvider extends FabricTagProvider.BlockTagProvider
{
    public DecorationBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        MainDecoration.LOGGER.logG("Generating Block Tag Data");

        //TODO: Cheack if the blocks break properly with pickaxe or not
        //getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(DecorationBlocks.CITRINE_FENCE)
                .add(DecorationBlocks.ENDERITE_FENCE)
                .add(DecorationBlocks.RUBY_FENCE)
                .add(DecorationBlocks.SAPPHIRE_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(DecorationBlocks.CITRINE_FENCE_GATE)
                .add(DecorationBlocks.ENDERITE_FENCE_GATE)
                .add(DecorationBlocks.RUBY_FENCE_GATE)
                .add(DecorationBlocks.SAPPHIRE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(DecorationBlocks.CITRINE_WALL)
                .add(DecorationBlocks.ENDERITE_WALL)
                .add(DecorationBlocks.RUBY_WALL)
                .add(DecorationBlocks.SAPPHIRE_WALL);
    }
}