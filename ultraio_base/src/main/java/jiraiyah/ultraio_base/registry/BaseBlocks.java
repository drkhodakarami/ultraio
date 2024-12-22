package jiraiyah.ultraio_base.registry;

import jiraiyah.register.Registers;
import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_base.block.AngelBlock;
import jiraiyah.ultraio_base.block.Elevator;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import static jiraiyah.register.Registers.Block.register;

public class BaseBlocks
{
    public static Block CARROT_BOX, POTATO_BOX, ENDERITE, CITRINE, RUBY, SAPPHIRE, RAW_CITRINE, RAW_ENDERITE, RAW_QUARTZ, RAW_RUBY, RAW_SAPPHIRE;
    public static Elevator ELEVATOR;
    public static AngelBlock ANGEL;

    public BaseBlocks()
    {
        throw new AssertionError("This class should not be instantiated");
    }

    public static void init()
    {
        MainBase.LOGGER.log("Registering Blocks");

        Registers.init(MainBase.ModID);

        ENDERITE = register("block_enderite", Blocks.NETHERITE_BLOCK);
        CITRINE = register("block_citrine", Blocks.AMETHYST_BLOCK);
        RUBY = register("block_ruby", Blocks.AMETHYST_BLOCK);
        SAPPHIRE = register("block_sapphire", Blocks.AMETHYST_BLOCK);

        RAW_CITRINE = register("block_raw_citrine", Blocks.STONE);
        RAW_ENDERITE = register("block_raw_enderite", Blocks.STONE);
        RAW_QUARTZ = register("block_raw_quartz", Blocks.STONE);
        RAW_RUBY = register("block_raw_ruby", Blocks.STONE);
        RAW_SAPPHIRE = register("block_raw_sapphire", Blocks.STONE);

        CARROT_BOX = register("carrot_box", Blocks.OAK_PLANKS);
        POTATO_BOX = register("potato_box", Blocks.OAK_PLANKS);
        ELEVATOR = register("elevator", Blocks.GRAY_WOOL, Elevator::new);
        ANGEL = register("block_angel",
                         AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).strength(0.1f, 5000.0f),
                         AngelBlock::new);
    }
}