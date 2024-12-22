package jiraiyah.ultraio_base.datagen;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_base.registry.BaseBlocks;
import jiraiyah.ultraio_base.registry.BaseItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class BaseItemTagProvider extends FabricTagProvider.ItemTagProvider
{
    public BaseItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture)
    {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup)
    {
        MainBase.LOGGER.logG("Generating Item Tag Data");

        getOrCreateTagBuilder(MainBase.REFERENCE.HAMMERS);
        getOrCreateTagBuilder(MainBase.REFERENCE.EXCAVATORS);

        getOrCreateTagBuilder(MainBase.REFERENCE.MENDING_ONLY);

        getOrCreateTagBuilder(MainBase.REFERENCE.AMETHYST_ARMOR_TYPE);
        getOrCreateTagBuilder(MainBase.REFERENCE.CITRINE_ARMOR_TYPE);
        getOrCreateTagBuilder(MainBase.REFERENCE.COPPER_ARMOR_TYPE);
        getOrCreateTagBuilder(MainBase.REFERENCE.EMERALD_ARMOR_TYPE);
        getOrCreateTagBuilder(MainBase.REFERENCE.ENDERITE_ARMOR_TYPE);
        getOrCreateTagBuilder(MainBase.REFERENCE.RUBY_ARMOR_TYPE);
        getOrCreateTagBuilder(MainBase.REFERENCE.SAPPHIRE_ARMOR_TYPE);

        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS);
        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS);

        getOrCreateTagBuilder(MainBase.REFERENCE.FLUID_BUCKET)
                .add(Items.LAVA_BUCKET)
                .add(Items.WATER_BUCKET)
                .add(Items.MILK_BUCKET)
                .add(Items.BUCKET);

        getOrCreateTagBuilder(MainBase.REFERENCE.RUBY_GEMS)
                .add(BaseItems.GEM_RUBY);

        getOrCreateTagBuilder(MainBase.REFERENCE.SAPPHIRE_GEMS)
                .add(BaseItems.GEM_SAPPHIRE);

        getOrCreateTagBuilder(MainBase.REFERENCE.CITRINE_GEMS)
                .add(BaseItems.GEM_CITRINE);

        getOrCreateTagBuilder(MainBase.REFERENCE.CAST)
                .add(BaseItems.CAST_AXE)
                .add(BaseItems.CAST_BINDING)
                .add(BaseItems.CAST_EXCAVATOR)
                .add(BaseItems.CAST_GEAR)
                .add(BaseItems.CAST_GEM)
                .add(BaseItems.CAST_HAMMER)
                .add(BaseItems.CAST_HANDLE)
                .add(BaseItems.CAST_HOE)
                .add(BaseItems.CAST_INGOT)
                .add(BaseItems.CAST_NUGGET)
                .add(BaseItems.CAST_PICKAXE)
                .add(BaseItems.CAST_PLATE)
                .add(BaseItems.CAST_ROD)
                .add(BaseItems.CAST_SHOVEL)
                .add(BaseItems.CAST_SWORD)
                .add(BaseItems.CAST_WIRE);

        getOrCreateTagBuilder(MainBase.REFERENCE.RAW)
                .add(BaseItems.RAW_CITRINE)
                .add(BaseItems.RAW_ENDERITE)
                .add(BaseItems.RAW_QUARTZ)
                .add(BaseItems.RAW_RUBY)
                .add(BaseItems.RAW_SAPPHIRE);

        getOrCreateTagBuilder(MainBase.REFERENCE.WOOD_CAST)
                .add(BaseItems.CAST_WOOD_INGOT)
                .add(BaseItems.CAST_WOOD_PICKAXE);

        getOrCreateTagBuilder(MainBase.REFERENCE.GEAR)
                .add(BaseItems.GEAR_COPPER)
                .add(BaseItems.GEAR_DIAMOND)
                .add(BaseItems.GEAR_EMERALD)
                .add(BaseItems.GEAR_ENDERITE)
                .add(BaseItems.GEAR_ENERGIZED)
                .add(BaseItems.GEAR_GOLD)
                .add(BaseItems.GEAR_IRON)
                .add(BaseItems.GEAR_LAPIS)
                .add(BaseItems.GEAR_NETHERITE)
                .add(BaseItems.GEAR_OBSIDIAN)
                .add(BaseItems.GEAR_PRISMARINE)
                .add(BaseItems.GEAR_QUARTZ)
                .add(BaseItems.GEAR_RUBY)
                .add(BaseItems.GEAR_SAPPHIRE)
                .add(BaseItems.GEAR_SHULKER)
                .add(BaseItems.GEAR_STONE)
                .add(BaseItems.GEAR_VIBRANT)
                .add(BaseItems.GEAR_WOOD);

        getOrCreateTagBuilder(MainBase.REFERENCE.GEM)
                .add(BaseItems.GEM_CITRINE)
                .add(BaseItems.GEM_RUBY)
                .add(BaseItems.GEM_SAPPHIRE)
                .add(Items.DIAMOND)
                .add(Items.EMERALD);

        getOrCreateTagBuilder(MainBase.REFERENCE.DUST)
                .add(BaseItems.CRUSHED_SHULKER)
                .add(BaseItems.DUST_CONDUCTIVE)
                .add(BaseItems.DUST_COPPER)
                .add(BaseItems.DUST_ENDERITE)
                .add(BaseItems.DUST_ENERGETIC)
                .add(BaseItems.DUST_GOLD)
                .add(BaseItems.DUST_IRON)
                .add(BaseItems.DUST_OBSIDIAN)
                .add(BaseItems.DUST_PULSATING)
                .add(BaseItems.DUST_RED_ALLOY)
                .add(BaseItems.DUST_SOUL)
                .add(BaseItems.DUST_VIBRANT)
                .add(BaseItems.DUST_WITHERING);

        getOrCreateTagBuilder(MainBase.REFERENCE.INGOT)
                .add(BaseItems.INGOT_ALLOY_CONDUCTIVE)
                .add(BaseItems.INGOT_ALLOY_ENERGETIC)
                .add(BaseItems.INGOT_ALLOY_PULSATING)
                .add(BaseItems.INGOT_ALLOY_RED)
                .add(BaseItems.INGOT_ALLOY_VIBRANT)
                .add(BaseItems.RAW_ALLOY_ENDERITE)
                .add(BaseItems.INGOT_ALLOY_ENDERITE)
                .add(BaseItems.INGOT_ENDERITE);

        getOrCreateTagBuilder(MainBase.REFERENCE.ALLOY)
                .add(BaseItems.INGOT_ALLOY_CONDUCTIVE)
                .add(BaseItems.INGOT_ALLOY_ENERGETIC)
                .add(BaseItems.INGOT_ALLOY_PULSATING)
                .add(BaseItems.INGOT_ALLOY_RED)
                .add(BaseItems.INGOT_ALLOY_VIBRANT);

        getOrCreateTagBuilder(MainBase.REFERENCE.PLATE)
                .add(BaseItems.PLATE_AMETHYST)
                .add(BaseItems.PLATE_CITRINE)
                .add(BaseItems.PLATE_COPPER)
                .add(BaseItems.PLATE_DIAMOND)
                .add(BaseItems.PLATE_EMERALD)
                .add(BaseItems.PLATE_ENDERITE)
                .add(BaseItems.PLATE_GOLD)
                .add(BaseItems.PLATE_IRON)
                .add(BaseItems.PLATE_NETHERITE)
                .add(BaseItems.PLATE_RUBY)
                .add(BaseItems.PLATE_SAPPHIRE)
                .add(BaseItems.PLATE_SHULKER)
                .add(BaseItems.PLATE_STONE);

        getOrCreateTagBuilder(MainBase.REFERENCE.REINFORCED)
                .add(BaseItems.REINFORCED_AMETHYST)
                .add(BaseItems.REINFORCED_CITRINE)
                .add(BaseItems.REINFORCED_COPPER)
                .add(BaseItems.REINFORCED_DIAMOND)
                .add(BaseItems.REINFORCED_EMERALD)
                .add(BaseItems.REINFORCED_ENDERITE)
                .add(BaseItems.REINFORCED_GOLD)
                .add(BaseItems.REINFORCED_IRON)
                .add(BaseItems.REINFORCED_NETHERITE)
                .add(BaseItems.REINFORCED_RUBY)
                .add(BaseItems.REINFORCED_SAPPHIRE)
                .add(BaseItems.REINFORCED_SHULKER);

        getOrCreateTagBuilder(MainBase.REFERENCE.ROD)
                .add(BaseItems.ROD_COPPER)
                .add(BaseItems.ROD_ENDERITE)
                .add(BaseItems.ROD_GLOWSTONE)
                .add(BaseItems.ROD_GOLD)
                .add(BaseItems.ROD_IRON)
                .add(BaseItems.ROD_OBSIDIAN)
                .add(BaseItems.ROD_REDSTONE)
                .add(BaseItems.ROD_SHULKER);

        getOrCreateTagBuilder(MainBase.REFERENCE.TOOL_HEAD)
                .add(BaseItems.HEAD_CITRINE_AXE)
                .add(BaseItems.HEAD_CITRINE_HAMMER)
                .add(BaseItems.HEAD_CITRINE_HOE)
                .add(BaseItems.HEAD_CITRINE_PICKAXE)
                .add(BaseItems.HEAD_CITRINE_SHOVEL)
                .add(BaseItems.HEAD_CITRINE_SWORD)
                .add(BaseItems.HEAD_COPPER_AXE)
                .add(BaseItems.HEAD_COPPER_HAMMER)
                .add(BaseItems.HEAD_COPPER_HOE)
                .add(BaseItems.HEAD_COPPER_PICKAXE)
                .add(BaseItems.HEAD_COPPER_SHOVEL)
                .add(BaseItems.HEAD_COPPER_SWORD)
                .add(BaseItems.HEAD_DIAMOND_AXE)
                .add(BaseItems.HEAD_DIAMOND_HAMMER)
                .add(BaseItems.HEAD_DIAMOND_HOE)
                .add(BaseItems.HEAD_DIAMOND_PICKAXE)
                .add(BaseItems.HEAD_DIAMOND_SHOVEL)
                .add(BaseItems.HEAD_DIAMOND_SWORD)
                .add(BaseItems.HEAD_ENDERITE_AXE)
                .add(BaseItems.HEAD_ENDERITE_HAMMER)
                .add(BaseItems.HEAD_ENDERITE_HOE)
                .add(BaseItems.HEAD_ENDERITE_PICKAXE)
                .add(BaseItems.HEAD_ENDERITE_SHOVEL)
                .add(BaseItems.HEAD_ENDERITE_SWORD)
                .add(BaseItems.HEAD_GOLD_AXE)
                .add(BaseItems.HEAD_GOLD_HAMMER)
                .add(BaseItems.HEAD_GOLD_HOE)
                .add(BaseItems.HEAD_GOLD_PICKAXE)
                .add(BaseItems.HEAD_GOLD_SHOVEL)
                .add(BaseItems.HEAD_GOLD_SWORD)
                .add(BaseItems.HEAD_IRON_AXE)
                .add(BaseItems.HEAD_IRON_HAMMER)
                .add(BaseItems.HEAD_IRON_HOE)
                .add(BaseItems.HEAD_IRON_PICKAXE)
                .add(BaseItems.HEAD_IRON_SHOVEL)
                .add(BaseItems.HEAD_IRON_SWORD)
                .add(BaseItems.HEAD_NETHERITE_AXE)
                .add(BaseItems.HEAD_NETHERITE_HAMMER)
                .add(BaseItems.HEAD_NETHERITE_HOE)
                .add(BaseItems.HEAD_NETHERITE_PICKAXE)
                .add(BaseItems.HEAD_NETHERITE_SHOVEL)
                .add(BaseItems.HEAD_NETHERITE_SWORD)
                .add(BaseItems.HEAD_RUBY_AXE)
                .add(BaseItems.HEAD_RUBY_HAMMER)
                .add(BaseItems.HEAD_RUBY_HOE)
                .add(BaseItems.HEAD_RUBY_PICKAXE)
                .add(BaseItems.HEAD_RUBY_SHOVEL)
                .add(BaseItems.HEAD_RUBY_SWORD)
                .add(BaseItems.HEAD_SAPPHIRE_AXE)
                .add(BaseItems.HEAD_SAPPHIRE_HAMMER)
                .add(BaseItems.HEAD_SAPPHIRE_HOE)
                .add(BaseItems.HEAD_SAPPHIRE_PICKAXE)
                .add(BaseItems.HEAD_SAPPHIRE_SHOVEL)
                .add(BaseItems.HEAD_SAPPHIRE_SWORD)
                .add(BaseItems.HEAD_STONE_HAMMER)
                .add(BaseItems.HEAD_WOOD_HAMMER);

        getOrCreateTagBuilder(MainBase.REFERENCE.SMELTABLE)
                .add(BaseItems.GEM_CITRINE)
                .add(BaseItems.GEM_RUBY)
                .add(BaseItems.GEM_SAPPHIRE)
                .add(Items.DIAMOND)
                .add(Items.EMERALD)
                .add(Items.PRISMARINE_SHARD)
                .add(Items.AMETHYST_SHARD)
                .add(Items.COPPER_INGOT)
                .add(BaseItems.INGOT_ALLOY_ENDERITE)
                .add(Items.GLOWSTONE)
                .add(Items.GOLD_INGOT)
                .add(Items.IRON_INGOT)
                .add(Items.LAPIS_LAZULI)
                .add(Items.NETHERITE_INGOT)
                .add(Items.OBSIDIAN)
                .add(Items.QUARTZ)
                //.add(BaseBlocks.ORE_NETHER_COAL.asItem())
                //.add(BaseBlocks.ORE_NETHER_IRON.asItem())
                //.add(BaseBlocks.ORE_NETHER_LAPIS.asItem())
                //.add(BaseBlocks.ORE_NETHER_REDSTONE.asItem())
                //.add(BaseBlocks.ORE_NETHER_COPPER.asItem())
                //.add(BaseBlocks.ORE_NETHER_DIAMOND.asItem())
                .add(Items.RAW_COPPER)
                .add(Items.RAW_IRON)
                .add(Items.RAW_GOLD);

        getOrCreateTagBuilder(MainBase.REFERENCE.REPAIRS_AMETHYST_ARMOR)
                .add(BaseItems.REINFORCED_AMETHYST);
        getOrCreateTagBuilder(MainBase.REFERENCE.REPAIRS_CITRINE_ARMOR)
                .add(BaseItems.REINFORCED_CITRINE);
        getOrCreateTagBuilder(MainBase.REFERENCE.REPAIRS_COPPER_ARMOR)
                .add(BaseItems.REINFORCED_COPPER);
        getOrCreateTagBuilder(MainBase.REFERENCE.REPAIRS_EMERALD_ARMOR)
                .add(BaseItems.REINFORCED_EMERALD);
        getOrCreateTagBuilder(MainBase.REFERENCE.REPAIRS_ENDERITE_ARMOR)
                .add(BaseItems.REINFORCED_ENDERITE);
        getOrCreateTagBuilder(MainBase.REFERENCE.REPAIRS_RUBY_ARMOR)
                .add(BaseItems.REINFORCED_RUBY);
        getOrCreateTagBuilder(MainBase.REFERENCE.REPAIRS_SAPPHIRE_ARMOR)
                .add(BaseItems.REINFORCED_SAPPHIRE);
        getOrCreateTagBuilder(MainBase.REFERENCE.REPAIRS_CITRINE_TOOL)
                .add(BaseItems.PLATE_CITRINE);
        getOrCreateTagBuilder(MainBase.REFERENCE.REPAIRS_COPPER_TOOL)
                .add(BaseItems.PLATE_COPPER);
        getOrCreateTagBuilder(MainBase.REFERENCE.REPAIRS_ENDERITE_TOOL)
                .add(BaseItems.PLATE_ENDERITE);
        getOrCreateTagBuilder(MainBase.REFERENCE.REPAIRS_RUBY_TOOL)
                .add(BaseItems.PLATE_RUBY);
        getOrCreateTagBuilder(MainBase.REFERENCE.REPAIRS_SAPPHIRE_TOOL)
                .add(BaseItems.PLATE_SAPPHIRE);
    }
}