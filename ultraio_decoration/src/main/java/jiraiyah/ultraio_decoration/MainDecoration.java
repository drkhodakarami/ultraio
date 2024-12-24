package jiraiyah.ultraio_decoration;

import jiraiyah.logger.Logger;
import jiraiyah.ultraio_decoration.registry.DecorationBlockItems;
import jiraiyah.ultraio_decoration.registry.DecorationBlocks;
import jiraiyah.ultraio_decoration.registry.DecorationItemGroups;
import net.fabricmc.api.ModInitializer;


public class MainDecoration implements ModInitializer
{
    public static final String ModID = "ultraio_decoration";
    public static final Logger LOGGER = new Logger(ModID);

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();

        DecorationBlocks.init();
        DecorationBlockItems.init();
        DecorationItemGroups.init();
    }
}