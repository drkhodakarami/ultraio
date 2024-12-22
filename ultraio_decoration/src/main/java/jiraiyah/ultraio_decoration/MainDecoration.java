package jiraiyah.ultraio_decoration;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;


public class MainDecoration implements ModInitializer
{
    public static final String ModID = "ultraio_decoration";
    public static final Logger LOGGER = new Logger(ModID);
    public static final ReferenceDecoration REFERENCE = new ReferenceDecoration(ModID);

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();
    }
}