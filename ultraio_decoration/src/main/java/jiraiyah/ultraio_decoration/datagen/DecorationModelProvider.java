package jiraiyah.ultraio_decoration.datagen;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_base.datagen.BaseModelProvider;
import jiraiyah.ultraio_decoration.MainDecoration;
import jiraiyah.ultraio_decoration.registry.DecorationBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class DecorationModelProvider extends FabricModelProvider
{
    public DecorationModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    //region SPECIAL BLOCK MODEL HELPER METHODS
    private static void generateWalls()
    {
        BaseModelProvider.CITRINE_TEXTURE_POOL.wall(DecorationBlocks.CITRINE_WALL);
        BaseModelProvider.ENDERITE_TEXTURE_POOL.wall(DecorationBlocks.ENDERITE_WALL);
        BaseModelProvider.RUBY_TEXTURE_POOL.wall(DecorationBlocks.RUBY_WALL);
        BaseModelProvider.SAPPHIRE_TEXTURE_POOL.wall(DecorationBlocks.SAPPHIRE_WALL);
    }

    private static void generateFenceGates()
    {
        BaseModelProvider.CITRINE_TEXTURE_POOL.fenceGate(DecorationBlocks.CITRINE_FENCE_GATE);
        BaseModelProvider.ENDERITE_TEXTURE_POOL.fenceGate(DecorationBlocks.ENDERITE_FENCE_GATE);
        BaseModelProvider.RUBY_TEXTURE_POOL.fenceGate(DecorationBlocks.RUBY_FENCE_GATE);
        BaseModelProvider.SAPPHIRE_TEXTURE_POOL.fenceGate(DecorationBlocks.SAPPHIRE_FENCE_GATE);
    }

    private static void generateFences()
    {
        BaseModelProvider.CITRINE_TEXTURE_POOL.fence(DecorationBlocks.CITRINE_FENCE);
        BaseModelProvider.ENDERITE_TEXTURE_POOL.fence(DecorationBlocks.ENDERITE_FENCE);
        BaseModelProvider.RUBY_TEXTURE_POOL.fence(DecorationBlocks.RUBY_FENCE);
        BaseModelProvider.SAPPHIRE_TEXTURE_POOL.fence(DecorationBlocks.SAPPHIRE_FENCE);
    }

    private static void generatePressurePlates()
    {
        BaseModelProvider.CITRINE_TEXTURE_POOL.pressurePlate(DecorationBlocks.CITRINE_PRESSURE_PLATE);
        BaseModelProvider.ENDERITE_TEXTURE_POOL.pressurePlate(DecorationBlocks.ENDERITE_PRESSURE_PLATE);
        BaseModelProvider.RUBY_TEXTURE_POOL.pressurePlate(DecorationBlocks.RUBY_PRESSURE_PLATE);
        BaseModelProvider.SAPPHIRE_TEXTURE_POOL.pressurePlate(DecorationBlocks.SAPPHIRE_PRESSURE_PLATE);
    }

    private static void generateButtons()
    {
        BaseModelProvider.CITRINE_TEXTURE_POOL.button(DecorationBlocks.CITRINE_BUTTON);
        BaseModelProvider.ENDERITE_TEXTURE_POOL.button(DecorationBlocks.ENDERITE_BUTTON);
        BaseModelProvider.RUBY_TEXTURE_POOL.button(DecorationBlocks.RUBY_BUTTON);
        BaseModelProvider.SAPPHIRE_TEXTURE_POOL.button(DecorationBlocks.SAPPHIRE_BUTTON);
    }

    private static void generateSlabs()
    {
        BaseModelProvider.CITRINE_TEXTURE_POOL.slab(DecorationBlocks.CITRINE_SLAB);
        BaseModelProvider.ENDERITE_TEXTURE_POOL.slab(DecorationBlocks.ENDERITE_SLAB);
        BaseModelProvider.RUBY_TEXTURE_POOL.slab(DecorationBlocks.RUBY_SLAB);
        BaseModelProvider.SAPPHIRE_TEXTURE_POOL.slab(DecorationBlocks.SAPPHIRE_SLAB);
    }

    private static void generateStairs()
    {
        BaseModelProvider.CITRINE_TEXTURE_POOL.stairs(DecorationBlocks.CITRINE_STAIRS);
        BaseModelProvider.ENDERITE_TEXTURE_POOL.stairs(DecorationBlocks.ENDERITE_STAIRS);
        BaseModelProvider.RUBY_TEXTURE_POOL.stairs(DecorationBlocks.RUBY_STAIRS);
        BaseModelProvider.SAPPHIRE_TEXTURE_POOL.stairs(DecorationBlocks.SAPPHIRE_STAIRS);
    }

    private static void generateTrapDoors(BlockStateModelGenerator generator)
    {
        generator.registerTrapdoor(DecorationBlocks.CITRINE_TRAP_DOOR);
        generator.registerTrapdoor(DecorationBlocks.ENDERITE_TRAP_DOOR);
        generator.registerTrapdoor(DecorationBlocks.RUBY_TRAP_DOOR);
        generator.registerTrapdoor(DecorationBlocks.SAPPHIRE_TRAP_DOOR);
    }

    private static void generateDoors(BlockStateModelGenerator generator)
    {
        generator.registerDoor(DecorationBlocks.CITRINE_DOOR);
        generator.registerDoor(DecorationBlocks.ENDERITE_DOOR);
        generator.registerDoor(DecorationBlocks.RUBY_DOOR);
        generator.registerDoor(DecorationBlocks.SAPPHIRE_DOOR);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator)
    {
        MainDecoration.LOGGER.logG("Generating Block Model Data");

        generateDoors(generator);
        generateTrapDoors(generator);
        generateStairs();
        generateSlabs();
        generateButtons();
        generatePressurePlates();
        generateFences();
        generateFenceGates();
        generateWalls();
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
        MainDecoration.LOGGER.logG("Generating Item Model Data");
    }
    //endregion
}