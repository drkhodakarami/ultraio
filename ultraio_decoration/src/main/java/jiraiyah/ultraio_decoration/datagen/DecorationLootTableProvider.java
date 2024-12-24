package jiraiyah.ultraio_decoration.datagen;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_decoration.MainDecoration;
import jiraiyah.ultraio_decoration.registry.DecorationBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class DecorationLootTableProvider extends FabricBlockLootTableProvider
{
    public DecorationLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate()
    {
        MainDecoration.LOGGER.logG("Generating Loot Table Data");

        addDrop(DecorationBlocks.CITRINE_STAIRS);
        addDrop(DecorationBlocks.ENDERITE_STAIRS);
        addDrop(DecorationBlocks.RUBY_STAIRS);
        addDrop(DecorationBlocks.SAPPHIRE_STAIRS);

        addDrop(DecorationBlocks.CITRINE_SLAB, slabDrops(DecorationBlocks.CITRINE_SLAB));
        addDrop(DecorationBlocks.ENDERITE_SLAB, slabDrops(DecorationBlocks.CITRINE_SLAB));
        addDrop(DecorationBlocks.RUBY_SLAB, slabDrops(DecorationBlocks.CITRINE_SLAB));
        addDrop(DecorationBlocks.SAPPHIRE_SLAB, slabDrops(DecorationBlocks.CITRINE_SLAB));

        addDrop(DecorationBlocks.CITRINE_BUTTON);
        addDrop(DecorationBlocks.ENDERITE_BUTTON);
        addDrop(DecorationBlocks.RUBY_BUTTON);
        addDrop(DecorationBlocks.SAPPHIRE_BUTTON);

        addDrop(DecorationBlocks.CITRINE_PRESSURE_PLATE);
        addDrop(DecorationBlocks.ENDERITE_PRESSURE_PLATE);
        addDrop(DecorationBlocks.RUBY_PRESSURE_PLATE);
        addDrop(DecorationBlocks.SAPPHIRE_PRESSURE_PLATE);

        addDrop(DecorationBlocks.CITRINE_FENCE);
        addDrop(DecorationBlocks.ENDERITE_FENCE);
        addDrop(DecorationBlocks.RUBY_FENCE);
        addDrop(DecorationBlocks.SAPPHIRE_FENCE);

        addDrop(DecorationBlocks.CITRINE_FENCE_GATE);
        addDrop(DecorationBlocks.ENDERITE_FENCE_GATE);
        addDrop(DecorationBlocks.RUBY_FENCE_GATE);
        addDrop(DecorationBlocks.SAPPHIRE_FENCE_GATE);

        addDrop(DecorationBlocks.CITRINE_WALL);
        addDrop(DecorationBlocks.ENDERITE_WALL);
        addDrop(DecorationBlocks.RUBY_WALL);
        addDrop(DecorationBlocks.SAPPHIRE_WALL);

        addDrop(DecorationBlocks.CITRINE_DOOR, doorDrops(DecorationBlocks.CITRINE_DOOR));
        addDrop(DecorationBlocks.ENDERITE_DOOR, doorDrops(DecorationBlocks.CITRINE_DOOR));
        addDrop(DecorationBlocks.RUBY_DOOR, doorDrops(DecorationBlocks.CITRINE_DOOR));
        addDrop(DecorationBlocks.SAPPHIRE_DOOR, doorDrops(DecorationBlocks.CITRINE_DOOR));

        addDrop(DecorationBlocks.CITRINE_TRAP_DOOR);
        addDrop(DecorationBlocks.ENDERITE_TRAP_DOOR);
        addDrop(DecorationBlocks.RUBY_TRAP_DOOR);
        addDrop(DecorationBlocks.SAPPHIRE_TRAP_DOOR);
    }
}