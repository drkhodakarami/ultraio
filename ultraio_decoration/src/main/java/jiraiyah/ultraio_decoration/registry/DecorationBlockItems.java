package jiraiyah.ultraio_decoration.registry;

import jiraiyah.register.Registers;
import jiraiyah.ultraio_decoration.MainDecoration;
import net.minecraft.item.BlockItem;

import static jiraiyah.register.Registers.BlockItem.register;

public class DecorationBlockItems
{
    public static BlockItem
            CITRINE_STAIRS, ENDERITE_STAIRS, RUBY_STAIRS, SAPPHIRE_STAIRS,
            CITRINE_SLAB, ENDERITE_SLAB, RUBY_SLAB, SAPPHIRE_SLAB,
            CITRINE_BUTTON, ENDERITE_BUTTON, RUBY_BUTTON, SAPPHIRE_BUTTON,
            CITRINE_PRESSURE_PLATE, ENDERITE_PRESSURE_PLATE, RUBY_PRESSURE_PLATE, SAPPHIRE_PRESSURE_PLATE,
            CITRINE_FENCE, ENDERITE_FENCE, RUBY_FENCE, SAPPHIRE_FENCE,
            CITRINE_FENCE_GATE, ENDERITE_FENCE_GATE, RUBY_FENCE_GATE, SAPPHIRE_FENCE_GATE,
            CITRINE_WALL, ENDERITE_WALL, RUBY_WALL, SAPPHIRE_WALL,
            CITRINE_DOOR, ENDERITE_DOOR, RUBY_DOOR, SAPPHIRE_DOOR,
            CITRINE_TRAP_DOOR, ENDERITE_TRAP_DOOR, RUBY_TRAP_DOOR, SAPPHIRE_TRAP_DOOR;

    public DecorationBlockItems()
    {
        throw new AssertionError("This class should not be instantiated");
    }

    public static void init()
    {
        MainDecoration.LOGGER.log("Registering Block Items");

        Registers.init(MainDecoration.ModID);

        CITRINE_STAIRS = register(DecorationBlocks.CITRINE_STAIRS);
        ENDERITE_STAIRS = register(DecorationBlocks.ENDERITE_STAIRS);
        RUBY_STAIRS = register(DecorationBlocks.RUBY_STAIRS);
        SAPPHIRE_STAIRS = register(DecorationBlocks.SAPPHIRE_STAIRS);

        CITRINE_SLAB = register(DecorationBlocks.CITRINE_SLAB);
        ENDERITE_SLAB = register(DecorationBlocks.ENDERITE_SLAB);
        RUBY_SLAB = register(DecorationBlocks.RUBY_SLAB);
        SAPPHIRE_SLAB = register(DecorationBlocks.SAPPHIRE_SLAB);

        CITRINE_BUTTON = register(DecorationBlocks.CITRINE_BUTTON);
        ENDERITE_BUTTON = register(DecorationBlocks.ENDERITE_BUTTON);
        RUBY_BUTTON = register(DecorationBlocks.RUBY_BUTTON);
        SAPPHIRE_BUTTON = register(DecorationBlocks.SAPPHIRE_BUTTON);

        CITRINE_PRESSURE_PLATE = register(DecorationBlocks.CITRINE_PRESSURE_PLATE);
        ENDERITE_PRESSURE_PLATE = register(DecorationBlocks.ENDERITE_PRESSURE_PLATE);
        RUBY_PRESSURE_PLATE = register(DecorationBlocks.RUBY_PRESSURE_PLATE);
        SAPPHIRE_PRESSURE_PLATE = register(DecorationBlocks.SAPPHIRE_PRESSURE_PLATE);

        CITRINE_FENCE = register(DecorationBlocks.CITRINE_FENCE);
        ENDERITE_FENCE = register(DecorationBlocks.ENDERITE_FENCE);
        RUBY_FENCE = register(DecorationBlocks.RUBY_FENCE);
        SAPPHIRE_FENCE = register(DecorationBlocks.SAPPHIRE_FENCE);

        CITRINE_FENCE_GATE = register(DecorationBlocks.CITRINE_FENCE_GATE);
        ENDERITE_FENCE_GATE = register(DecorationBlocks.ENDERITE_FENCE_GATE);
        RUBY_FENCE_GATE = register(DecorationBlocks.RUBY_FENCE_GATE);
        SAPPHIRE_FENCE_GATE = register(DecorationBlocks.SAPPHIRE_FENCE_GATE);

        CITRINE_WALL = register(DecorationBlocks.CITRINE_WALL);
        ENDERITE_WALL = register(DecorationBlocks.ENDERITE_WALL);
        RUBY_WALL = register(DecorationBlocks.RUBY_WALL);
        SAPPHIRE_WALL = register(DecorationBlocks.SAPPHIRE_WALL);

        CITRINE_DOOR = register(DecorationBlocks.CITRINE_DOOR);
        ENDERITE_DOOR = register(DecorationBlocks.ENDERITE_DOOR);
        RUBY_DOOR = register(DecorationBlocks.RUBY_DOOR);
        SAPPHIRE_DOOR = register(DecorationBlocks.SAPPHIRE_DOOR);

        CITRINE_TRAP_DOOR = register(DecorationBlocks.CITRINE_TRAP_DOOR);
        ENDERITE_TRAP_DOOR = register(DecorationBlocks.ENDERITE_TRAP_DOOR);
        RUBY_TRAP_DOOR = register(DecorationBlocks.RUBY_TRAP_DOOR);
        SAPPHIRE_TRAP_DOOR = register(DecorationBlocks.SAPPHIRE_TRAP_DOOR);
    }
}