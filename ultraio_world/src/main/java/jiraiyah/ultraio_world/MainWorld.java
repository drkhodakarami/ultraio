package jiraiyah.ultraio_world;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;


public class MainWorld implements ModInitializer
{
    public static final String ModID = "ultraio_world";
    public static final Logger LOGGER = new Logger(ModID);
    public static final ReferenceWorld REFERENCE = new ReferenceWorld(ModID);

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();
    }
}