package jiraiyah.ultraio_command;

import jiraiyah.logger.Logger;
import jiraiyah.ultraio_command.command.DclrCommand;
import net.fabricmc.api.ModInitializer;


public class MainCommand implements ModInitializer
{
    public static final String ModID = "ultraio_command";
    public static final Logger LOGGER = new Logger(ModID);
    public static final ReferenceCommand REFERENCE = new ReferenceCommand(ModID);

    public static Configs CONFIG = new Configs(ModID);

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();

        CONFIG.load();

        DclrCommand.register();
    }
}