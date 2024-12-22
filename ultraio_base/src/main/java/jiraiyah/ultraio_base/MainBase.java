package jiraiyah.ultraio_base;

import jiraiyah.logger.Logger;
import jiraiyah.ultraio_base.registry.*;
import net.fabricmc.api.ModInitializer;


public class MainBase implements ModInitializer
{
	public static final String ModID = "ultraio_base";
    public static final String MainModID = "ultraio";

	public static final Logger LOGGER = new Logger(ModID);
    public static final ReferenceBase REFERENCE = new ReferenceBase(MainModID);

	@Override
	public void onInitialize()
	{
		LOGGER.logMain();

        BaseEvents.init();
        BaseItems.init();
        BaseBlocks.init();
        BaseBlockItems.init();
        BaseItemGroups.init();
        BaseFuels.init();
	}
}