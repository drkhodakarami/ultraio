package jiraiyah.ultraio_effect;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;


public class MainEffect implements ModInitializer
{
    public static final String ModID = "ultraio_effect";
    public static final Logger LOGGER = new Logger(ModID);
    public static final ReferenceEffect REFERENCE = new ReferenceEffect(ModID);

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();
    }
}