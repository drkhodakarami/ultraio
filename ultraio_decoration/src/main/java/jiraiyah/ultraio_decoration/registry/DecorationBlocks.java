package jiraiyah.ultraio_decoration.registry;

import jiraiyah.register.Registers;
import jiraiyah.ultraio_base.registry.BaseBlocks;
import jiraiyah.ultraio_decoration.MainDecoration;
import net.minecraft.block.*;

import static jiraiyah.register.Registers.Block.*;
import static jiraiyah.register.Registers.Block.registerSlab;

public class DecorationBlocks
{
    public static FenceBlock CITRINE_FENCE, ENDERITE_FENCE, RUBY_FENCE, SAPPHIRE_FENCE;
    public static StairsBlock CITRINE_STAIRS, ENDERITE_STAIRS, RUBY_STAIRS, SAPPHIRE_STAIRS;
    public static SlabBlock CITRINE_SLAB, ENDERITE_SLAB, RUBY_SLAB, SAPPHIRE_SLAB;
    public static ButtonBlock CITRINE_BUTTON, ENDERITE_BUTTON, RUBY_BUTTON, SAPPHIRE_BUTTON;
    public static PressurePlateBlock CITRINE_PRESSURE_PLATE, ENDERITE_PRESSURE_PLATE, RUBY_PRESSURE_PLATE, SAPPHIRE_PRESSURE_PLATE;
    public static FenceGateBlock CITRINE_FENCE_GATE, ENDERITE_FENCE_GATE, RUBY_FENCE_GATE, SAPPHIRE_FENCE_GATE;
    public static WallBlock CITRINE_WALL, ENDERITE_WALL, RUBY_WALL, SAPPHIRE_WALL;
    public static DoorBlock CITRINE_DOOR, ENDERITE_DOOR, RUBY_DOOR, SAPPHIRE_DOOR;
    public static TrapdoorBlock CITRINE_TRAP_DOOR, ENDERITE_TRAP_DOOR, RUBY_TRAP_DOOR, SAPPHIRE_TRAP_DOOR;

    public DecorationBlocks()
    {
        throw new AssertionError("This class should not be instantiated");
    }

    public static void init()
    {
        MainDecoration.LOGGER.log("Registering Blocks");

        Registers.init(MainDecoration.ModID);

        CITRINE_STAIRS = registerStair("block_citrine_stairs", BaseBlocks.CITRINE, Blocks.AMETHYST_BLOCK);
        ENDERITE_STAIRS = registerStair("block_enderite_stairs", BaseBlocks.ENDERITE, Blocks.IRON_BLOCK);
        RUBY_STAIRS = registerStair("block_ruby_stairs", BaseBlocks.RUBY, Blocks.AMETHYST_BLOCK);
        SAPPHIRE_STAIRS = registerStair("block_sapphire_stairs", BaseBlocks.SAPPHIRE, Blocks.AMETHYST_BLOCK);

        CITRINE_SLAB = registerSlab("block_citrine_slab", Blocks.AMETHYST_BLOCK);
        ENDERITE_SLAB = registerSlab("block_enderite_slab", Blocks.IRON_BLOCK);
        RUBY_SLAB = registerSlab("block_ruby_slab", Blocks.AMETHYST_BLOCK);
        SAPPHIRE_SLAB = registerSlab("block_sapphire_slab", Blocks.AMETHYST_BLOCK);

        CITRINE_BUTTON = registerButton("block_citrine_button", BlockSetType.IRON, 40, Blocks.AMETHYST_BLOCK);
        ENDERITE_BUTTON = registerButton("block_enderite_button", BlockSetType.IRON, 40, Blocks.IRON_BLOCK);
        RUBY_BUTTON = registerButton("block_ruby_button", BlockSetType.IRON, 40, Blocks.AMETHYST_BLOCK);
        SAPPHIRE_BUTTON = registerButton("block_sapphire_button", BlockSetType.IRON, 40, Blocks.AMETHYST_BLOCK);

        CITRINE_PRESSURE_PLATE = registerPressurePlate("block_citrine_pressure_plate", BlockSetType.IRON, Blocks.AMETHYST_BLOCK);
        ENDERITE_PRESSURE_PLATE = registerPressurePlate("block_enderite_pressure_plate", BlockSetType.IRON, Blocks.IRON_BLOCK);
        RUBY_PRESSURE_PLATE = registerPressurePlate("block_ruby_pressure_plate", BlockSetType.IRON, Blocks.AMETHYST_BLOCK);
        SAPPHIRE_PRESSURE_PLATE = registerPressurePlate("block_sapphire_pressure_plate", BlockSetType.IRON, Blocks.AMETHYST_BLOCK);

        CITRINE_FENCE = registerFence("block_citrine_fence", Blocks.AMETHYST_BLOCK);
        ENDERITE_FENCE = registerFence("block_enderite_fence", Blocks.IRON_BLOCK);
        RUBY_FENCE = registerFence("block_ruby_fence", Blocks.AMETHYST_BLOCK);
        SAPPHIRE_FENCE = registerFence("block_sapphire_fence", Blocks.AMETHYST_BLOCK);

        CITRINE_FENCE_GATE = registerFenceGate("block_citrine_fence_gate", WoodType.OAK, Blocks.AMETHYST_BLOCK);
        ENDERITE_FENCE_GATE = registerFenceGate("block_enderite_fence_gate", WoodType.OAK, Blocks.IRON_BLOCK);
        RUBY_FENCE_GATE = registerFenceGate("block_ruby_fence_gate", WoodType.OAK, Blocks.AMETHYST_BLOCK);
        SAPPHIRE_FENCE_GATE = registerFenceGate("block_sapphire_fence_gate", WoodType.OAK, Blocks.AMETHYST_BLOCK);

        CITRINE_WALL = registerWall("block_citrine_wall", Blocks.AMETHYST_BLOCK);
        ENDERITE_WALL = registerWall("block_enderite_wall", Blocks.IRON_BLOCK);
        RUBY_WALL = registerWall("block_ruby_wall", Blocks.AMETHYST_BLOCK);
        SAPPHIRE_WALL = registerWall("block_sapphire_wall", Blocks.AMETHYST_BLOCK);

        CITRINE_DOOR = registerDoor("block_citrine_door", BlockSetType.IRON, Blocks.IRON_DOOR);
        ENDERITE_DOOR = registerDoor("block_enderite_door", BlockSetType.IRON, Blocks.IRON_DOOR);
        RUBY_DOOR = registerDoor("block_ruby_door", BlockSetType.IRON, Blocks.IRON_DOOR);
        SAPPHIRE_DOOR = registerDoor("block_sapphire_door", BlockSetType.IRON, Blocks.IRON_DOOR);

        CITRINE_TRAP_DOOR = registerTrapdoor("block_citrine_trap_door", BlockSetType.IRON, Blocks.IRON_DOOR);
        ENDERITE_TRAP_DOOR = registerTrapdoor("block_enderite_trap_door", BlockSetType.IRON, Blocks.IRON_DOOR);
        RUBY_TRAP_DOOR = registerTrapdoor("block_ruby_trap_door", BlockSetType.IRON, Blocks.IRON_DOOR);
        SAPPHIRE_TRAP_DOOR = registerTrapdoor("block_sapphire_trap_door", BlockSetType.IRON, Blocks.IRON_DOOR);
    }
}