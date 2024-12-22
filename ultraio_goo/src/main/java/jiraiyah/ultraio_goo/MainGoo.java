package jiraiyah.ultraio_goo;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;


public class MainGoo implements ModInitializer
{
    public static final String ModID = "ultraio_goo";
    public static final Logger LOGGER = new Logger(ModID);
    public static final ReferenceGoo REFERENCE = new ReferenceGoo(ModID);

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();
    }
}