package jiraiyah.ultraio_machina;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;


public class MainMachina implements ModInitializer
{
    public static final String ModID = "ultraio_machina";
    public static final Logger LOGGER = new Logger(ModID);
    public static final ReferenceMachina REFERENCE = new ReferenceMachina(ModID);

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();
    }
}