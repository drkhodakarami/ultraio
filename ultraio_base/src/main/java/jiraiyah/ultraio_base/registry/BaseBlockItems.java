package jiraiyah.ultraio_base.registry;

import jiraiyah.register.Registers;
import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_base.blockitem.AngelBlockItem;
import net.minecraft.item.BlockItem;

import static jiraiyah.register.Registers.BlockItem.register;

public class BaseBlockItems
{
    public static BlockItem CITRINE, RUBY, SAPPHIRE, RAW_CITRINE, RAW_ENDERITE, RAW_QUARTZ, RAW_RUBY, RAW_SAPPHIRE, ENDERITE,
            CARROT_BOX, POTATO_BOX, ANGEL, ELEVATOR;

    public BaseBlockItems()
    {
        throw new AssertionError("This class should not be instantiated");
    }

    public static void init()
    {
        MainBase.LOGGER.log("Registering Block Items");

        Registers.init(MainBase.ModID);

        CITRINE = register(BaseBlocks.CITRINE);
        RUBY = register(BaseBlocks.RUBY);
        SAPPHIRE = register(BaseBlocks.SAPPHIRE);
        RAW_CITRINE = register(BaseBlocks.RAW_CITRINE);
        RAW_ENDERITE = register(BaseBlocks.RAW_ENDERITE);
        RAW_QUARTZ = register(BaseBlocks.RAW_QUARTZ);
        RAW_RUBY = register(BaseBlocks.RAW_RUBY);
        RAW_SAPPHIRE = register(BaseBlocks.RAW_SAPPHIRE);
        ENDERITE = register(BaseBlocks.ENDERITE);
        CARROT_BOX = register(BaseBlocks.CARROT_BOX);
        POTATO_BOX = register(BaseBlocks.POTATO_BOX);
        ANGEL = register(BaseBlocks.ANGEL, AngelBlockItem::new);
        ELEVATOR = register(BaseBlocks.ELEVATOR);
    }
}