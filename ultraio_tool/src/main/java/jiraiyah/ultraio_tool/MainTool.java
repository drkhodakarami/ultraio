package jiraiyah.ultraio_tool;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;


public class MainTool implements ModInitializer
{
    public static final String ModID = "ultraio_tool";
    public static final Logger LOGGER = new Logger(ModID);
    public static final ReferenceTool REFERENCE = new ReferenceTool(ModID);

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();
    }
}