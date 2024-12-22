package jiraiyah.ultraio_base.registry;

import jiraiyah.register.Registers;
import jiraiyah.ultraio_base.MainBase;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;

public class BaseFuels
{
    public BaseFuels()
    {
        throw new AssertionError("This class should not be instantiated");
    }

    public static void init()
    {
        MainBase.LOGGER.log("Registering Fuel");

        Registers.init(MainBase.ModID);

        FuelRegistryEvents.BUILD.register((builder, context) ->
                                          {
                                              builder.add(BaseItems.HOT_COAL, context.baseSmeltTime() * 32); //6400
                                          });
    }
}