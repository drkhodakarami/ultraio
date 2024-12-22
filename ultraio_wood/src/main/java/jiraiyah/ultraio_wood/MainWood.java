package jiraiyah.ultraio_wood;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;


public class MainWood implements ModInitializer
{
    public static final String ModID = "ultraio_wood";
    public static final Logger LOGGER = new Logger(ModID);
    public static final ReferenceWood REFERENCE = new ReferenceWood(ModID);

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();
    }
}