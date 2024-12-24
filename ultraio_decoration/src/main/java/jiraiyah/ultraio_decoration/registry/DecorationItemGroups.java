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
        ItemGroupEvents.modifyEntriesEvent(BaseItemGroups.BLOCKS.registryKey()).register(
                entries ->
                {
                    entries.add(DecorationBlocks.CITRINE_FENCE);
                    entries.add(DecorationBlocks.ENDERITE_FENCE);
                    entries.add(DecorationBlocks.RUBY_FENCE);
                    entries.add(DecorationBlocks.SAPPHIRE_FENCE);

                    entries.add(DecorationBlocks.CITRINE_BUTTON);
                    entries.add(DecorationBlocks.ENDERITE_BUTTON);
                    entries.add(DecorationBlocks.RUBY_BUTTON);
                    entries.add(DecorationBlocks.SAPPHIRE_BUTTON);

                    entries.add(DecorationBlocks.CITRINE_PRESSURE_PLATE);
                    entries.add(DecorationBlocks.ENDERITE_PRESSURE_PLATE);
                    entries.add(DecorationBlocks.RUBY_PRESSURE_PLATE);
                    entries.add(DecorationBlocks.SAPPHIRE_PRESSURE_PLATE);

                    entries.add(DecorationBlocks.CITRINE_DOOR);
                    entries.add(DecorationBlocks.ENDERITE_DOOR);
                    entries.add(DecorationBlocks.RUBY_DOOR);
                    entries.add(DecorationBlocks.SAPPHIRE_DOOR);

                    entries.add(DecorationBlocks.CITRINE_TRAP_DOOR);
                    entries.add(DecorationBlocks.ENDERITE_TRAP_DOOR);
                    entries.add(DecorationBlocks.RUBY_TRAP_DOOR);
                    entries.add(DecorationBlocks.SAPPHIRE_TRAP_DOOR);

                    entries.add(DecorationBlocks.CITRINE_FENCE);
                    entries.add(DecorationBlocks.ENDERITE_FENCE);
                    entries.add(DecorationBlocks.RUBY_FENCE);
                    entries.add(DecorationBlocks.SAPPHIRE_FENCE);

                    entries.add(DecorationBlocks.CITRINE_FENCE_GATE);
                    entries.add(DecorationBlocks.ENDERITE_FENCE_GATE);
                    entries.add(DecorationBlocks.RUBY_FENCE_GATE);
                    entries.add(DecorationBlocks.SAPPHIRE_FENCE_GATE);

                    entries.add(DecorationBlocks.CITRINE_WALL);
                    entries.add(DecorationBlocks.ENDERITE_WALL);
                    entries.add(DecorationBlocks.RUBY_WALL);
                    entries.add(DecorationBlocks.SAPPHIRE_WALL);

                    entries.add(DecorationBlocks.CITRINE_SLAB);
                    entries.add(DecorationBlocks.ENDERITE_SLAB);
                    entries.add(DecorationBlocks.RUBY_SLAB);
                    entries.add(DecorationBlocks.SAPPHIRE_SLAB);

                    entries.add(DecorationBlocks.CITRINE_STAIRS);
                    entries.add(DecorationBlocks.ENDERITE_STAIRS);
                    entries.add(DecorationBlocks.RUBY_STAIRS);
                    entries.add(DecorationBlocks.SAPPHIRE_STAIRS);
                });
    }
}