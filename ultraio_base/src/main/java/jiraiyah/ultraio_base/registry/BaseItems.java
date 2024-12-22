package jiraiyah.ultraio_base.registry;

import jiraiyah.register.Registers;
import jiraiyah.ultraio_base.MainBase;
import net.minecraft.item.*;

import static jiraiyah.register.Registers.Item.register;
import static jiraiyah.register.Registers.Item.registerSnackFood;

public class BaseItems
{
    public static Item GEM_CITRINE, GEM_RUBY, GEM_SAPPHIRE,
            RAW_CITRINE, RAW_ENDERITE, RAW_QUARTZ, RAW_RUBY, RAW_SAPPHIRE,
            CAST_AXE, CAST_BINDING, CAST_EXCAVATOR, CAST_GEAR, CAST_GEM, CAST_HAMMER, CAST_HANDLE, CAST_HOE, CAST_INGOT, CAST_NUGGET,
            CAST_PICKAXE, CAST_PLATE, CAST_ROD, CAST_SHOVEL, CAST_SWORD, CAST_WIRE, CAST_WOOD_INGOT, CAST_WOOD_PICKAXE,
            CRUSHED_SHULKER, DUST_CONDUCTIVE, DUST_COPPER, DUST_ENDERITE, DUST_ENERGETIC, DUST_GOLD, DUST_IRON, DUST_OBSIDIAN,
            DUST_PULSATING, DUST_RED_ALLOY, DUST_SOUL, DUST_VIBRANT, DUST_WITHERING,
            GEAR_COPPER, GEAR_DIAMOND, GEAR_EMERALD, GEAR_ENDERITE, GEAR_ENERGIZED, GEAR_GOLD, GEAR_IRON, GEAR_LAPIS,
            GEAR_NETHERITE, GEAR_OBSIDIAN, GEAR_PRISMARINE, GEAR_QUARTZ, GEAR_RUBY, GEAR_SAPPHIRE, GEAR_SHULKER, GEAR_STONE,
            GEAR_VIBRANT, GEAR_WOOD,
            INGOT_ALLOY_CONDUCTIVE, INGOT_ALLOY_ENERGETIC, INGOT_ALLOY_PULSATING, INGOT_ALLOY_RED, INGOT_ALLOY_VIBRANT,
            INGOT_ALLOY_ENDERITE, RAW_ALLOY_ENDERITE, INGOT_ENDERITE,
            PLATE_AMETHYST, PLATE_CITRINE, PLATE_COPPER, PLATE_DIAMOND, PLATE_EMERALD, PLATE_ENDERITE, PLATE_GOLD,
            PLATE_IRON, PLATE_NETHERITE, PLATE_RUBY, PLATE_SAPPHIRE, PLATE_SHULKER, PLATE_STONE,
            REINFORCED_AMETHYST, REINFORCED_CITRINE, REINFORCED_COPPER, REINFORCED_DIAMOND, REINFORCED_EMERALD, REINFORCED_ENDERITE,
            REINFORCED_GOLD, REINFORCED_IRON, REINFORCED_NETHERITE, REINFORCED_RUBY, REINFORCED_SAPPHIRE, REINFORCED_SHULKER,
            ROD_COPPER, ROD_ENDERITE, ROD_GLOWSTONE, ROD_GOLD, ROD_IRON, ROD_OBSIDIAN, ROD_REDSTONE, ROD_SHULKER,
            HEAD_CITRINE_AXE, HEAD_CITRINE_EXCAVATOR, HEAD_CITRINE_HAMMER, HEAD_CITRINE_HOE, HEAD_CITRINE_PICKAXE, HEAD_CITRINE_SHOVEL, HEAD_CITRINE_SWORD,
            HEAD_COPPER_AXE, HEAD_COPPER_EXCAVATOR, HEAD_COPPER_HAMMER, HEAD_COPPER_HOE, HEAD_COPPER_PICKAXE, HEAD_COPPER_SHOVEL, HEAD_COPPER_SWORD,
            HEAD_DIAMOND_AXE, HEAD_DIAMOND_EXCAVATOR, HEAD_DIAMOND_HAMMER, HEAD_DIAMOND_HOE, HEAD_DIAMOND_PICKAXE, HEAD_DIAMOND_SHOVEL, HEAD_DIAMOND_SWORD,
            HEAD_ENDERITE_AXE, HEAD_ENDERITE_EXCAVATOR, HEAD_ENDERITE_HAMMER, HEAD_ENDERITE_HOE, HEAD_ENDERITE_PICKAXE, HEAD_ENDERITE_SHOVEL, HEAD_ENDERITE_SWORD,
            HEAD_GOLD_AXE, HEAD_GOLD_EXCAVATOR, HEAD_GOLD_HAMMER, HEAD_GOLD_HOE, HEAD_GOLD_PICKAXE, HEAD_GOLD_SHOVEL, HEAD_GOLD_SWORD,
            HEAD_IRON_AXE, HEAD_IRON_EXCAVATOR, HEAD_IRON_HAMMER, HEAD_IRON_HOE, HEAD_IRON_PICKAXE, HEAD_IRON_SHOVEL, HEAD_IRON_SWORD,
            HEAD_NETHERITE_AXE, HEAD_NETHERITE_EXCAVATOR, HEAD_NETHERITE_HAMMER, HEAD_NETHERITE_HOE, HEAD_NETHERITE_PICKAXE, HEAD_NETHERITE_SHOVEL, HEAD_NETHERITE_SWORD,
            HEAD_RUBY_AXE, HEAD_RUBY_EXCAVATOR, HEAD_RUBY_HAMMER, HEAD_RUBY_HOE, HEAD_RUBY_PICKAXE, HEAD_RUBY_SHOVEL, HEAD_RUBY_SWORD,
            HEAD_SAPPHIRE_AXE, HEAD_SAPPHIRE_EXCAVATOR, HEAD_SAPPHIRE_HAMMER, HEAD_SAPPHIRE_HOE, HEAD_SAPPHIRE_PICKAXE, HEAD_SAPPHIRE_SHOVEL, HEAD_SAPPHIRE_SWORD,
            HEAD_STONE_HAMMER, HEAD_STONE_EXCAVATOR, HEAD_WOOD_HAMMER, HEAD_WOOD_EXCAVATOR,
            ENDER_CHARM, ENDERMAN_EYE, ENDERMAN_HEART, ENDERMAN_GLAND, THERMAL_CORE, HOT_COAL,
            COOKED_EGG, EGG_AND_BREAD, SLOT_DISABLED, SLOT_ENABLED, ITEM_FILTER,
            VOID_PLATE_BASE, VOID_PLATE_ACTIVATOR, VOID_PLATE, RUBBER, RAW_RUBBER, BINDING_STRING, UNSTABLE_GOO, COMBUSTION_CORE;

    public BaseItems()
    {
        throw new AssertionError("This class should not be instantiated");
    }

    public static void init()
    {
        MainBase.LOGGER.log("Registering Items");

        Registers.init(MainBase.ModID);

        BINDING_STRING = register("binding_string", 16);
        UNSTABLE_GOO = register("unstable_goo_core");
        COMBUSTION_CORE = register("unstable_goo_base");
        RAW_RUBBER = register("raw_rubber", 16);
        RUBBER = register("rubber", 16);
        VOID_PLATE_BASE = register("void_plate_base", 1);
        VOID_PLATE_ACTIVATOR = register("void_plate_activator", 1);
        VOID_PLATE = register("void_plate", 1);
        ENDER_CHARM = register("ender_charm", 16);
        ENDERMAN_EYE = register("enderman_eye", 16);
        ENDERMAN_HEART = register("enderman_heart", 16);
        ENDERMAN_GLAND = register("enderman_gland", 16);
        ITEM_FILTER = register("item_filter", 16);
        SLOT_DISABLED = register("slot_disabled", 16);
        SLOT_ENABLED = register("slot_enabled", 16);
        COOKED_EGG = registerSnackFood("cooked_egg", 16, 4, 0.55f);
        EGG_AND_BREAD = registerSnackFood("egg_and_bread", 16, 11, 1.2f);
        HOT_COAL = register("hot_coal");
        THERMAL_CORE = register("thermal_core");

        GEM_CITRINE = register("gem_citrine");
        GEM_RUBY = register("gem_ruby");
        GEM_SAPPHIRE = register("gem_sapphire");

        RAW_CITRINE = register("raw_citrine");
        RAW_ENDERITE = register("raw_enderite");
        RAW_QUARTZ = register("raw_quartz");
        RAW_RUBY = register("raw_ruby");
        RAW_SAPPHIRE = register("raw_sapphire");

        CAST_AXE = register("cast_axe", 1);
        CAST_BINDING = register("cast_binding", 1);
        CAST_EXCAVATOR = register("cast_excavator", 1);
        CAST_GEAR = register("cast_gear", 1);
        CAST_GEM = register("cast_gem", 1);
        CAST_HAMMER = register("cast_hammer", 1);
        CAST_HANDLE = register("cast_handle", 1);
        CAST_HOE = register("cast_hoe", 1);
        CAST_INGOT = register("cast_ingot", 1);
        CAST_NUGGET = register("cast_nugget", 1);
        CAST_PICKAXE = register("cast_pickaxe", 1);
        CAST_PLATE = register("cast_plate", 1);
        CAST_ROD = register("cast_rod", 1);
        CAST_SHOVEL = register("cast_shovel", 1);
        CAST_SWORD = register("cast_sword", 1);
        CAST_WIRE = register("cast_wire", 1);
        CAST_WOOD_INGOT = register("cast_wood_ingot", 1);
        CAST_WOOD_PICKAXE = register("cast_wood_pickaxe", 1);

        CRUSHED_SHULKER = register("crushed_shulker_shell");
        DUST_CONDUCTIVE = register("dust_conductive");
        DUST_COPPER = register("dust_copper");
        DUST_ENDERITE = register("dust_enderite");
        DUST_ENERGETIC = register("dust_energetic");
        DUST_GOLD = register("dust_gold");
        DUST_IRON = register("dust_iron");
        DUST_OBSIDIAN = register("dust_obsidian");
        DUST_PULSATING = register("dust_pulsating");
        DUST_RED_ALLOY = register("dust_red_alloy");
        DUST_SOUL = register("dust_soul");
        DUST_VIBRANT = register("dust_vibrant");
        DUST_WITHERING = register("dust_withering");

        GEAR_COPPER = register("gear_copper", 16);
        GEAR_DIAMOND = register("gear_diamond", 16);
        GEAR_EMERALD = register("gear_emerald", 16);
        GEAR_ENDERITE = register("gear_enderite", 16);
        GEAR_ENERGIZED = register("gear_energized", 16);
        GEAR_GOLD = register("gear_gold", 16);
        GEAR_IRON = register("gear_iron", 16);
        GEAR_LAPIS = register("gear_lapis", 16);
        GEAR_NETHERITE = register("gear_netherite", 16);
        GEAR_OBSIDIAN = register("gear_obsidian", 16);
        GEAR_PRISMARINE = register("gear_prismarine", 16);
        GEAR_QUARTZ = register("gear_quartz", 16);
        GEAR_RUBY = register("gear_ruby", 16);
        GEAR_SAPPHIRE = register("gear_sapphire", 16);
        GEAR_SHULKER = register("gear_shulker", 16);
        GEAR_STONE = register("gear_stone", 16);
        GEAR_VIBRANT = register("gear_vibrant", 16);
        GEAR_WOOD = register("gear_wood", 16);

        INGOT_ALLOY_CONDUCTIVE = register("ingot_alloy_conductive");
        INGOT_ALLOY_ENERGETIC = register("ingot_alloy_energetic");
        INGOT_ALLOY_PULSATING = register("ingot_alloy_pulsating");
        INGOT_ALLOY_RED = register("ingot_alloy_red");
        INGOT_ALLOY_VIBRANT = register("ingot_alloy_vibrant");
        INGOT_ALLOY_ENDERITE = register("ingot_alloy_enderite");

        RAW_ALLOY_ENDERITE = register("raw_alloy_enderite");

        INGOT_ENDERITE = register("ingot_enderite");

        PLATE_AMETHYST = register("plate_amethyst");
        PLATE_CITRINE = register("plate_citrine");
        PLATE_COPPER = register("plate_copper");
        PLATE_DIAMOND = register("plate_diamond");
        PLATE_EMERALD = register("plate_emerald");
        PLATE_ENDERITE = register("plate_enderite");
        PLATE_GOLD = register("plate_gold");
        PLATE_IRON = register("plate_iron");
        PLATE_NETHERITE = register("plate_netherite");
        PLATE_RUBY = register("plate_ruby");
        PLATE_SAPPHIRE = register("plate_sapphire");
        PLATE_SHULKER = register("plate_shulker");
        PLATE_STONE = register("plate_stone");

        REINFORCED_AMETHYST = register("reinforced_amethyst", 16);
        REINFORCED_CITRINE = register("reinforced_citrine", 16);
        REINFORCED_COPPER = register("reinforced_copper", 16);
        REINFORCED_DIAMOND = register("reinforced_diamond", 16);
        REINFORCED_EMERALD = register("reinforced_emerald", 16);
        REINFORCED_ENDERITE = register("reinforced_enderite", 16);
        REINFORCED_GOLD = register("reinforced_gold", 16);
        REINFORCED_IRON = register("reinforced_iron", 16);
        REINFORCED_NETHERITE = register("reinforced_netherite", 16);
        REINFORCED_RUBY = register("reinforced_ruby", 16);
        REINFORCED_SAPPHIRE = register("reinforced_sapphire", 16);
        REINFORCED_SHULKER = register("reinforced_shulker", 16);

        ROD_COPPER = register("rod_copper", 16);
        ROD_ENDERITE = register("rod_enderite", 16);
        ROD_GLOWSTONE = register("rod_glowstone", 16);
        ROD_GOLD = register("rod_gold", 16);
        ROD_IRON = register("rod_iron", 16);
        ROD_OBSIDIAN = register("rod_obsidian", 16);
        ROD_REDSTONE = register("rod_redstone", 16);
        ROD_SHULKER = register("rod_shulker", 16);

        HEAD_CITRINE_AXE = register("head_citrine_axe", 16);
        HEAD_CITRINE_EXCAVATOR = register("head_citrine_excavator", 16);
        HEAD_CITRINE_HAMMER = register("head_citrine_hammer", 16);
        HEAD_CITRINE_HOE = register("head_citrine_hoe", 16);
        HEAD_CITRINE_PICKAXE = register("head_citrine_pickaxe", 16);
        HEAD_CITRINE_SHOVEL = register("head_citrine_shovel", 16);
        HEAD_CITRINE_SWORD = register("head_citrine_sword", 16);

        HEAD_COPPER_AXE = register("head_copper_axe", 16);
        HEAD_COPPER_EXCAVATOR = register("head_copper_excavator", 16);
        HEAD_COPPER_HAMMER = register("head_copper_hammer", 16);
        HEAD_COPPER_HOE = register("head_copper_hoe", 16);
        HEAD_COPPER_PICKAXE = register("head_copper_pickaxe", 16);
        HEAD_COPPER_SHOVEL = register("head_copper_shovel", 16);
        HEAD_COPPER_SWORD = register("head_copper_sword", 16);

        HEAD_DIAMOND_AXE = register("head_diamond_axe", 16);
        HEAD_DIAMOND_EXCAVATOR = register("head_diamond_excavator", 16);
        HEAD_DIAMOND_HAMMER = register("head_diamond_hammer", 16);
        HEAD_DIAMOND_HOE = register("head_diamond_hoe", 16);
        HEAD_DIAMOND_PICKAXE = register("head_diamond_pickaxe", 16);
        HEAD_DIAMOND_SHOVEL = register("head_diamond_shovel", 16);
        HEAD_DIAMOND_SWORD = register("head_diamond_sword", 16);

        HEAD_ENDERITE_AXE = register("head_enderite_axe", 16);
        HEAD_ENDERITE_EXCAVATOR = register("head_enderite_excavator", 16);
        HEAD_ENDERITE_HAMMER = register("head_enderite_hammer", 16);
        HEAD_ENDERITE_HOE = register("head_enderite_hoe", 16);
        HEAD_ENDERITE_PICKAXE = register("head_enderite_pickaxe", 16);
        HEAD_ENDERITE_SHOVEL = register("head_enderite_shovel", 16);
        HEAD_ENDERITE_SWORD = register("head_enderite_sword", 16);

        HEAD_GOLD_AXE = register("head_gold_axe", 16);
        HEAD_GOLD_EXCAVATOR = register("head_gold_excavator", 16);
        HEAD_GOLD_HAMMER = register("head_gold_hammer", 16);
        HEAD_GOLD_HOE = register("head_gold_hoe", 16);
        HEAD_GOLD_PICKAXE = register("head_gold_pickaxe", 16);
        HEAD_GOLD_SHOVEL = register("head_gold_shovel", 16);
        HEAD_GOLD_SWORD = register("head_gold_sword", 16);

        HEAD_IRON_AXE = register("head_iron_axe", 16);
        HEAD_IRON_EXCAVATOR = register("head_iron_excavator", 16);
        HEAD_IRON_HAMMER = register("head_iron_hammer", 16);
        HEAD_IRON_HOE = register("head_iron_hoe", 16);
        HEAD_IRON_PICKAXE = register("head_iron_pickaxe", 16);
        HEAD_IRON_SHOVEL = register("head_iron_shovel", 16);
        HEAD_IRON_SWORD = register("head_iron_sword", 16);

        HEAD_NETHERITE_AXE = register("head_netherite_axe", 16);
        HEAD_NETHERITE_EXCAVATOR = register("head_netherite_excavator", 16);
        HEAD_NETHERITE_HAMMER = register("head_netherite_hammer", 16);
        HEAD_NETHERITE_HOE = register("head_netherite_hoe", 16);
        HEAD_NETHERITE_PICKAXE = register("head_netherite_pickaxe", 16);
        HEAD_NETHERITE_SHOVEL = register("head_netherite_shovel", 16);
        HEAD_NETHERITE_SWORD = register("head_netherite_sword", 16);

        HEAD_RUBY_AXE = register("head_ruby_axe", 16);
        HEAD_RUBY_EXCAVATOR = register("head_ruby_excavator", 16);
        HEAD_RUBY_HAMMER = register("head_ruby_hammer", 16);
        HEAD_RUBY_HOE = register("head_ruby_hoe", 16);
        HEAD_RUBY_PICKAXE = register("head_ruby_pickaxe", 16);
        HEAD_RUBY_SHOVEL = register("head_ruby_shovel", 16);
        HEAD_RUBY_SWORD = register("head_ruby_sword", 16);

        HEAD_SAPPHIRE_AXE = register("head_sapphire_axe", 16);
        HEAD_SAPPHIRE_EXCAVATOR = register("head_sapphire_excavator", 16);
        HEAD_SAPPHIRE_HAMMER = register("head_sapphire_hammer", 16);
        HEAD_SAPPHIRE_HOE = register("head_sapphire_hoe", 16);
        HEAD_SAPPHIRE_PICKAXE = register("head_sapphire_pickaxe", 16);
        HEAD_SAPPHIRE_SHOVEL = register("head_sapphire_shovel", 16);
        HEAD_SAPPHIRE_SWORD = register("head_sapphire_sword", 16);

        HEAD_STONE_HAMMER = register("head_stone_hammer", 16);
        HEAD_STONE_EXCAVATOR = register("head_stone_excavator", 16);
        HEAD_WOOD_HAMMER = register("head_wood_hammer", 16);
        HEAD_WOOD_EXCAVATOR = register("head_wood_excavator", 16);
    }
}