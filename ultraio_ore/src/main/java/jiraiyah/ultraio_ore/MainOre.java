package jiraiyah.ultraio_ore;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;


public class MainOre implements ModInitializer
{
    public static final String ModID = "ultraio_ore";
    public static final Logger LOGGER = new Logger(ModID);
    public static final ReferenceOre REFERENCE = new ReferenceOre(ModID);

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();
    }
}