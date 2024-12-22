package jiraiyah.ultraio_base.registry;

import jiraiyah.ultraio_base.MainBase;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

public class BaseItemGroups
{
    public static RegistryEntry.Reference<ItemGroup> BLOCKS, INGREDIENTS, MISC;

    public BaseItemGroups()
    {
        throw new AssertionError("This class should not be instantiated");
    }

    public static void init()
    {
        MainBase.LOGGER.log("Registering Item Groups");

        BLOCKS = Registry.registerReference(Registries.ITEM_GROUP,
                                            MainBase.REFERENCE.identifier(MainBase.ModID + MainBase.REFERENCE.BLOCK_ITEM_GROUP_NAME),
                                            FabricItemGroup.builder().displayName(MainBase.REFERENCE.BLOCKS_TITLE)
                                                           .icon(BaseBlocks.ANGEL.asItem()::getDefaultStack)
                                                           .entries((displayContext, entries) ->
                                                                    {
                                                                        entries.add(BaseBlocks.CITRINE);
                                                                        entries.add(BaseBlocks.ENDERITE);
                                                                        entries.add(BaseBlocks.RUBY);
                                                                        entries.add(BaseBlocks.SAPPHIRE);
                                                                        entries.add(BaseBlocks.ANGEL);
                                                                        entries.add(BaseBlocks.ELEVATOR);
                                                                        entries.add(BaseBlocks.CARROT_BOX);
                                                                        entries.add(BaseBlocks.POTATO_BOX);
                                                                        entries.add(BaseBlocks.RAW_CITRINE);
                                                                        entries.add(BaseBlocks.RAW_ENDERITE);
                                                                        entries.add(BaseBlocks.RAW_QUARTZ);
                                                                        entries.add(BaseBlocks.RAW_RUBY);
                                                                        entries.add(BaseBlocks.RAW_SAPPHIRE);
                                                                    }).build());

        INGREDIENTS = Registry.registerReference(Registries.ITEM_GROUP,
                                                 MainBase.REFERENCE.identifier(MainBase.ModID + MainBase.REFERENCE.INGREDIENT_ITEM_GROUP_NAME),
                                                 FabricItemGroup.builder().displayName(MainBase.REFERENCE.INGREDIENT_TITLE)
                                                                .icon(BaseItems.HOT_COAL::getDefaultStack)
                                                                .entries((displayContext, entries) ->
                                                                         {
                                                                             entries.add(BaseItems.GEM_CITRINE);
                                                                             entries.add(BaseItems.GEM_RUBY);
                                                                             entries.add(BaseItems.GEM_SAPPHIRE);

                                                                             entries.add(BaseItems.COOKED_EGG);
                                                                             entries.add(BaseItems.EGG_AND_BREAD);

                                                                             entries.add(BaseItems.HOT_COAL);

                                                                             entries.add(BaseItems.BINDING_STRING);
                                                                             entries.add(BaseItems.RUBBER);

                                                                             entries.add(BaseItems.UNSTABLE_GOO);
                                                                             entries.add(BaseItems.COMBUSTION_CORE);
                                                                             entries.add(BaseItems.THERMAL_CORE);

                                                                             entries.add(BaseItems.VOID_PLATE_ACTIVATOR);
                                                                             entries.add(BaseItems.VOID_PLATE_BASE);

                                                                             entries.add(BaseItems.ENDER_CHARM);
                                                                             entries.add(BaseItems.ENDERMAN_EYE);
                                                                             entries.add(BaseItems.ENDERMAN_HEART);
                                                                             entries.add(BaseItems.ENDERMAN_GLAND);

                                                                             entries.add(BaseItems.RAW_CITRINE);
                                                                             entries.add(BaseItems.RAW_ENDERITE);
                                                                             entries.add(BaseItems.RAW_QUARTZ);
                                                                             entries.add(BaseItems.RAW_RUBY);
                                                                             entries.add(BaseItems.RAW_SAPPHIRE);
                                                                             entries.add(BaseItems.RAW_RUBBER);

                                                                             entries.add(BaseItems.INGOT_ENDERITE);

                                                                             entries.add(BaseItems.CRUSHED_SHULKER);
                                                                             entries.add(BaseItems.DUST_CONDUCTIVE);
                                                                             entries.add(BaseItems.DUST_COPPER);
                                                                             entries.add(BaseItems.DUST_ENDERITE);
                                                                             entries.add(BaseItems.DUST_ENERGETIC);
                                                                             entries.add(BaseItems.DUST_GOLD);
                                                                             entries.add(BaseItems.DUST_IRON);
                                                                             entries.add(BaseItems.DUST_OBSIDIAN);
                                                                             entries.add(BaseItems.DUST_PULSATING);
                                                                             entries.add(BaseItems.DUST_RED_ALLOY);
                                                                             entries.add(BaseItems.DUST_SOUL);
                                                                             entries.add(BaseItems.DUST_VIBRANT);
                                                                             entries.add(BaseItems.DUST_WITHERING);
                                                                             entries.add(BaseItems.RAW_ALLOY_ENDERITE);

                                                                             entries.add(BaseItems.GEAR_COPPER);
                                                                             entries.add(BaseItems.GEAR_DIAMOND);
                                                                             entries.add(BaseItems.GEAR_EMERALD);
                                                                             entries.add(BaseItems.GEAR_ENDERITE);
                                                                             entries.add(BaseItems.GEAR_ENERGIZED);
                                                                             entries.add(BaseItems.GEAR_GOLD);
                                                                             entries.add(BaseItems.GEAR_IRON);
                                                                             entries.add(BaseItems.GEAR_LAPIS);
                                                                             entries.add(BaseItems.GEAR_NETHERITE);
                                                                             entries.add(BaseItems.GEAR_OBSIDIAN);
                                                                             entries.add(BaseItems.GEAR_PRISMARINE);
                                                                             entries.add(BaseItems.GEAR_QUARTZ);
                                                                             entries.add(BaseItems.GEAR_RUBY);
                                                                             entries.add(BaseItems.GEAR_SAPPHIRE);
                                                                             entries.add(BaseItems.GEAR_SHULKER);
                                                                             entries.add(BaseItems.GEAR_STONE);
                                                                             entries.add(BaseItems.GEAR_VIBRANT);
                                                                             entries.add(BaseItems.GEAR_WOOD);

                                                                             entries.add(BaseItems.INGOT_ALLOY_CONDUCTIVE);
                                                                             entries.add(BaseItems.INGOT_ALLOY_ENERGETIC);
                                                                             entries.add(BaseItems.INGOT_ALLOY_PULSATING);
                                                                             entries.add(BaseItems.INGOT_ALLOY_RED);
                                                                             entries.add(BaseItems.INGOT_ALLOY_VIBRANT);
                                                                             entries.add(BaseItems.INGOT_ALLOY_ENDERITE);

                                                                             entries.add(BaseItems.PLATE_AMETHYST);
                                                                             entries.add(BaseItems.PLATE_CITRINE);
                                                                             entries.add(BaseItems.PLATE_COPPER);
                                                                             entries.add(BaseItems.PLATE_DIAMOND);
                                                                             entries.add(BaseItems.PLATE_EMERALD);
                                                                             entries.add(BaseItems.PLATE_ENDERITE);
                                                                             entries.add(BaseItems.PLATE_GOLD);
                                                                             entries.add(BaseItems.PLATE_IRON);
                                                                             entries.add(BaseItems.PLATE_NETHERITE);
                                                                             entries.add(BaseItems.PLATE_RUBY);
                                                                             entries.add(BaseItems.PLATE_SAPPHIRE);
                                                                             entries.add(BaseItems.PLATE_SHULKER);
                                                                             entries.add(BaseItems.PLATE_STONE);

                                                                             entries.add(BaseItems.REINFORCED_AMETHYST);
                                                                             entries.add(BaseItems.REINFORCED_CITRINE);
                                                                             entries.add(BaseItems.REINFORCED_COPPER);
                                                                             entries.add(BaseItems.REINFORCED_DIAMOND);
                                                                             entries.add(BaseItems.REINFORCED_EMERALD);
                                                                             entries.add(BaseItems.REINFORCED_ENDERITE);
                                                                             entries.add(BaseItems.REINFORCED_GOLD);
                                                                             entries.add(BaseItems.REINFORCED_IRON);
                                                                             entries.add(BaseItems.REINFORCED_NETHERITE);
                                                                             entries.add(BaseItems.REINFORCED_RUBY);
                                                                             entries.add(BaseItems.REINFORCED_SAPPHIRE);
                                                                             entries.add(BaseItems.REINFORCED_SHULKER);

                                                                             entries.add(BaseItems.ROD_COPPER);
                                                                             entries.add(BaseItems.ROD_ENDERITE);
                                                                             entries.add(BaseItems.ROD_GLOWSTONE);
                                                                             entries.add(BaseItems.ROD_GOLD);
                                                                             entries.add(BaseItems.ROD_IRON);
                                                                             entries.add(BaseItems.ROD_OBSIDIAN);
                                                                             entries.add(BaseItems.ROD_REDSTONE);
                                                                             entries.add(BaseItems.ROD_SHULKER);
                                                                         }).build());

        MISC = Registry.registerReference(Registries.ITEM_GROUP,
                                          MainBase.REFERENCE.identifier(MainBase.ModID + MainBase.REFERENCE.MISC_ITEM_GROUP_NAME),
                                          FabricItemGroup.builder().displayName(MainBase.REFERENCE.MISC_TITLE)
                                                         .icon(BaseItems.CAST_AXE::getDefaultStack)
                                                         .entries((displayContext, entries) ->
                                                                  {
                                                                      entries.add(BaseItems.CAST_AXE);
                                                                      entries.add(BaseItems.CAST_BINDING);
                                                                      entries.add(BaseItems.CAST_EXCAVATOR);
                                                                      entries.add(BaseItems.CAST_GEAR);
                                                                      entries.add(BaseItems.CAST_GEM);
                                                                      entries.add(BaseItems.CAST_HAMMER);
                                                                      entries.add(BaseItems.CAST_HANDLE);
                                                                      entries.add(BaseItems.CAST_HOE);
                                                                      entries.add(BaseItems.CAST_INGOT);
                                                                      entries.add(BaseItems.CAST_NUGGET);
                                                                      entries.add(BaseItems.CAST_PICKAXE);
                                                                      entries.add(BaseItems.CAST_PLATE);
                                                                      entries.add(BaseItems.CAST_ROD);
                                                                      entries.add(BaseItems.CAST_SHOVEL);
                                                                      entries.add(BaseItems.CAST_SWORD);
                                                                      entries.add(BaseItems.CAST_WIRE);
                                                                      entries.add(BaseItems.CAST_WOOD_INGOT);
                                                                      entries.add(BaseItems.CAST_WOOD_PICKAXE);

                                                                      entries.add(BaseItems.HEAD_CITRINE_AXE);
                                                                      entries.add(BaseItems.HEAD_CITRINE_EXCAVATOR);
                                                                      entries.add(BaseItems.HEAD_CITRINE_HAMMER);
                                                                      entries.add(BaseItems.HEAD_CITRINE_HOE);
                                                                      entries.add(BaseItems.HEAD_CITRINE_PICKAXE);
                                                                      entries.add(BaseItems.HEAD_CITRINE_SHOVEL);
                                                                      entries.add(BaseItems.HEAD_CITRINE_SWORD);

                                                                      entries.add(BaseItems.HEAD_COPPER_AXE);
                                                                      entries.add(BaseItems.HEAD_COPPER_EXCAVATOR);
                                                                      entries.add(BaseItems.HEAD_COPPER_HAMMER);
                                                                      entries.add(BaseItems.HEAD_COPPER_HOE);
                                                                      entries.add(BaseItems.HEAD_COPPER_PICKAXE);
                                                                      entries.add(BaseItems.HEAD_COPPER_SHOVEL);
                                                                      entries.add(BaseItems.HEAD_COPPER_SWORD);

                                                                      entries.add(BaseItems.HEAD_DIAMOND_AXE);
                                                                      entries.add(BaseItems.HEAD_DIAMOND_EXCAVATOR);
                                                                      entries.add(BaseItems.HEAD_DIAMOND_HAMMER);
                                                                      entries.add(BaseItems.HEAD_DIAMOND_HOE);
                                                                      entries.add(BaseItems.HEAD_DIAMOND_PICKAXE);
                                                                      entries.add(BaseItems.HEAD_DIAMOND_SHOVEL);
                                                                      entries.add(BaseItems.HEAD_DIAMOND_SWORD);

                                                                      entries.add(BaseItems.HEAD_ENDERITE_AXE);
                                                                      entries.add(BaseItems.HEAD_ENDERITE_EXCAVATOR);
                                                                      entries.add(BaseItems.HEAD_ENDERITE_HAMMER);
                                                                      entries.add(BaseItems.HEAD_ENDERITE_HOE);
                                                                      entries.add(BaseItems.HEAD_ENDERITE_PICKAXE);
                                                                      entries.add(BaseItems.HEAD_ENDERITE_SHOVEL);
                                                                      entries.add(BaseItems.HEAD_ENDERITE_SWORD);

                                                                      entries.add(BaseItems.HEAD_GOLD_AXE);
                                                                      entries.add(BaseItems.HEAD_GOLD_EXCAVATOR);
                                                                      entries.add(BaseItems.HEAD_GOLD_HAMMER);
                                                                      entries.add(BaseItems.HEAD_GOLD_HOE);
                                                                      entries.add(BaseItems.HEAD_GOLD_PICKAXE);
                                                                      entries.add(BaseItems.HEAD_GOLD_SHOVEL);
                                                                      entries.add(BaseItems.HEAD_GOLD_SWORD);

                                                                      entries.add(BaseItems.HEAD_IRON_AXE);
                                                                      entries.add(BaseItems.HEAD_IRON_EXCAVATOR);
                                                                      entries.add(BaseItems.HEAD_IRON_HAMMER);
                                                                      entries.add(BaseItems.HEAD_IRON_HOE);
                                                                      entries.add(BaseItems.HEAD_IRON_PICKAXE);
                                                                      entries.add(BaseItems.HEAD_IRON_SHOVEL);
                                                                      entries.add(BaseItems.HEAD_IRON_SWORD);

                                                                      entries.add(BaseItems.HEAD_NETHERITE_AXE);
                                                                      entries.add(BaseItems.HEAD_NETHERITE_EXCAVATOR);
                                                                      entries.add(BaseItems.HEAD_NETHERITE_HAMMER);
                                                                      entries.add(BaseItems.HEAD_NETHERITE_HOE);
                                                                      entries.add(BaseItems.HEAD_NETHERITE_PICKAXE);
                                                                      entries.add(BaseItems.HEAD_NETHERITE_SHOVEL);
                                                                      entries.add(BaseItems.HEAD_NETHERITE_SWORD);

                                                                      entries.add(BaseItems.HEAD_RUBY_AXE);
                                                                      entries.add(BaseItems.HEAD_RUBY_EXCAVATOR);
                                                                      entries.add(BaseItems.HEAD_RUBY_HAMMER);
                                                                      entries.add(BaseItems.HEAD_RUBY_HOE);
                                                                      entries.add(BaseItems.HEAD_RUBY_PICKAXE);
                                                                      entries.add(BaseItems.HEAD_RUBY_SHOVEL);
                                                                      entries.add(BaseItems.HEAD_RUBY_SWORD);

                                                                      entries.add(BaseItems.HEAD_SAPPHIRE_AXE);
                                                                      entries.add(BaseItems.HEAD_SAPPHIRE_EXCAVATOR);
                                                                      entries.add(BaseItems.HEAD_SAPPHIRE_HAMMER);
                                                                      entries.add(BaseItems.HEAD_SAPPHIRE_HOE);
                                                                      entries.add(BaseItems.HEAD_SAPPHIRE_PICKAXE);
                                                                      entries.add(BaseItems.HEAD_SAPPHIRE_SHOVEL);
                                                                      entries.add(BaseItems.HEAD_SAPPHIRE_SWORD);

                                                                      entries.add(BaseItems.HEAD_STONE_HAMMER);
                                                                      entries.add(BaseItems.HEAD_STONE_EXCAVATOR);
                                                                      entries.add(BaseItems.HEAD_WOOD_EXCAVATOR);
                                                                  }).build());
    }
}