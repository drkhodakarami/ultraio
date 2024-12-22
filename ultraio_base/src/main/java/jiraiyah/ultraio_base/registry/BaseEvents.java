package jiraiyah.ultraio_base.registry;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_base.event.BaseLootTableModifiers;

public class BaseEvents
{
    public BaseEvents()
    {
        throw new AssertionError("This class should not be instantiated");
    }

    public static void init()
    {
        MainBase.LOGGER.log("Registering Events");

        BaseLootTableModifiers.register();
    }
}