package jiraiyah.ultraio_cable;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;


public class MainCable implements ModInitializer
{
    public static final String ModID = "ultraio_cable";
    public static final Logger LOGGER = new Logger(ModID);
    public static final ReferenceCable REFERENCE = new ReferenceCable(ModID);

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();
    }
}