package jiraiyah.ultraio_decoration.registry;

import jiraiyah.ultraio_base.registry.BaseItemGroups;
import jiraiyah.ultraio_base.registry.BaseItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class DecorationItemGroups
{
    public DecorationItemGroups()
    {
        throw new AssertionError("This class should not be instantiated");
    }

    public static void init()
    {
        ItemGroupEvents.modifyEntriesEvent(BaseItemGroups.INGREDIENTS.registryKey()).register(
                entries ->
                {
                    entries.add(DecorationBlocks.CITRINE_FENCE);
                    entries.add(DecorationBlocks.ENDERITE_FENCE);
                    entries.add(DecorationBlocks.RUBY_FENCE);
                    entries.add(DecorationBlocks.SAPPHIRE_FENCE);
                });
    }
}