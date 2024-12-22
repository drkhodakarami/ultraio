package jiraiyah.ultraio_base.datagen;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_base.registry.BaseBlockItems;
import jiraiyah.ultraio_base.registry.BaseBlocks;
import jiraiyah.ultraio_base.registry.BaseItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.MutableText;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class BaseEnLanguageProvider extends FabricLanguageProvider
{
    public BaseEnLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "en_us", registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull MutableText text, @NotNull String value)
    {
        builder.add(((TranslatableTextContent) text.getContent()).getKey(), value);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder builder)
    {
        MainBase.LOGGER.logG("Generating Language Data");

        builder.add(BaseItems.BINDING_STRING, "Binding String");
        builder.add(BaseItems.UNSTABLE_GOO, "Unstable Goo Core");
        builder.add(BaseItems.COMBUSTION_CORE, "Combustion Core");
        builder.add(BaseItems.RAW_RUBBER, "Raw Rubber");
        builder.add(BaseItems.RUBBER, "Rubber");
        builder.add(BaseItems.VOID_PLATE_BASE, "Portal Frame");
        builder.add(BaseItems.VOID_PLATE_ACTIVATOR, "Portal Activator");
        builder.add(BaseItems.VOID_PLATE, "Portal Key");
        builder.add(BaseItems.ENDER_CHARM, "Ender Charm");
        builder.add(BaseItems.ENDERMAN_EYE, "Enderman Eye");
        builder.add(BaseItems.ENDERMAN_HEART, "Enderman Heart");
        builder.add(BaseItems.ENDERMAN_GLAND, "Enderman Gland");
        builder.add(BaseItems.COOKED_EGG, "Cooked Egg");
        builder.add(BaseItems.EGG_AND_BREAD, "Egg And Bread");
        builder.add(BaseItems.HOT_COAL, "Hot Coal");
        builder.add(BaseItems.THERMAL_CORE, "Thermal Energy Core");

        builder.add(BaseItems.ITEM_FILTER, "Item Filter");
        builder.add(BaseItems.SLOT_DISABLED, "Disable Slot");
        builder.add(BaseItems.SLOT_ENABLED, "Enable Slot");

        builder.add(BaseItems.CAST_AXE, "Axe Head Cast");
        builder.add(BaseItems.CAST_BINDING, "Binding String Cast");
        builder.add(BaseItems.CAST_EXCAVATOR, "Excavator Head Cast");
        builder.add(BaseItems.CAST_GEAR, "Gear Cast");
        builder.add(BaseItems.CAST_GEM, "Gem Cast");
        builder.add(BaseItems.CAST_HAMMER, "Hammer Head Cast");
        builder.add(BaseItems.CAST_HANDLE, "Tool Handle Cast");
        builder.add(BaseItems.CAST_HOE, "Hoe Cast");
        builder.add(BaseItems.CAST_INGOT, "Ingot Cast");
        builder.add(BaseItems.CAST_NUGGET, "Nugget Cast");
        builder.add(BaseItems.CAST_PICKAXE, "Pickaxe Head Cast");
        builder.add(BaseItems.CAST_PLATE, "Plate Cast");
        builder.add(BaseItems.CAST_ROD, "Rod Cast");
        builder.add(BaseItems.CAST_SHOVEL, "Shovel Head Cast");
        builder.add(BaseItems.CAST_SWORD, "Sword Head Cast");
        builder.add(BaseItems.CAST_WIRE, "Wire Cast");
        builder.add(BaseItems.CAST_WOOD_INGOT, "Wooden Ingot Cast");
        builder.add(BaseItems.CAST_WOOD_PICKAXE, "Wooden Pickaxe Head Cast");

        builder.add(BaseItems.RAW_CITRINE, "Raw Citrine");
        builder.add(BaseItems.RAW_ENDERITE, "Raw Enderite");
        builder.add(BaseItems.RAW_QUARTZ, "Raw Quartz");
        builder.add(BaseItems.RAW_RUBY, "Raw Ruby");
        builder.add(BaseItems.RAW_SAPPHIRE, "Raw Sapphire");

        builder.add(BaseItems.GEM_CITRINE, "Citrine Gem");
        builder.add(BaseItems.GEM_RUBY, "Ruby Gem");
        builder.add(BaseItems.GEM_SAPPHIRE, "Sapphire Gem");

        builder.add(BaseItems.CRUSHED_SHULKER, "Crushed Shulker Shell");
        builder.add(BaseItems.DUST_CONDUCTIVE, "Conductive Dust");
        builder.add(BaseItems.DUST_COPPER, "Copper Dust");
        builder.add(BaseItems.DUST_ENDERITE, "Enderite Dust");
        builder.add(BaseItems.DUST_ENERGETIC, "Energetic Dust");
        builder.add(BaseItems.DUST_GOLD, "Gold Dust");
        builder.add(BaseItems.DUST_IRON, "Iron Dust");
        builder.add(BaseItems.DUST_OBSIDIAN, "Obsidian Dust");
        builder.add(BaseItems.DUST_PULSATING, "Pulsating Dust");
        builder.add(BaseItems.DUST_RED_ALLOY, "Red Alloy Dust");
        builder.add(BaseItems.DUST_SOUL, "Soul Dust");
        builder.add(BaseItems.DUST_VIBRANT, "Vibrant Dust");
        builder.add(BaseItems.DUST_WITHERING, "Withering Dust");

        builder.add(BaseItems.GEAR_COPPER, "Copper Gear");
        builder.add(BaseItems.GEAR_DIAMOND, "Diamond Gear");
        builder.add(BaseItems.GEAR_EMERALD, "Emerald Gear");
        builder.add(BaseItems.GEAR_ENDERITE, "Enderite Gear");
        builder.add(BaseItems.GEAR_ENERGIZED, "Energized Gear");
        builder.add(BaseItems.GEAR_GOLD, "Gold Gear");
        builder.add(BaseItems.GEAR_IRON, "Iron Gear");
        builder.add(BaseItems.GEAR_LAPIS, "Lapis Gear");
        builder.add(BaseItems.GEAR_NETHERITE, "Netherite Gear");
        builder.add(BaseItems.GEAR_OBSIDIAN, "Obsidian Gear");
        builder.add(BaseItems.GEAR_PRISMARINE, "Prismarine Gear");
        builder.add(BaseItems.GEAR_QUARTZ, "Quartz Gear");
        builder.add(BaseItems.GEAR_RUBY, "Ruby Gear");
        builder.add(BaseItems.GEAR_SAPPHIRE, "Sapphire Gear");
        builder.add(BaseItems.GEAR_SHULKER, "Shulker Shell Gear");
        builder.add(BaseItems.GEAR_STONE, "Stone Gear");
        builder.add(BaseItems.GEAR_VIBRANT, "Vibrant Gear");
        builder.add(BaseItems.GEAR_WOOD, "Wood Gear");

        builder.add(BaseItems.INGOT_ALLOY_CONDUCTIVE, "Conductive Alloy");
        builder.add(BaseItems.INGOT_ALLOY_ENERGETIC, "Energetic Alloy");
        builder.add(BaseItems.INGOT_ALLOY_PULSATING, "Pulsating Alloy");
        builder.add(BaseItems.INGOT_ALLOY_RED, "Red Alloy");
        builder.add(BaseItems.INGOT_ALLOY_VIBRANT, "Vibrant Alloy");
        builder.add(BaseItems.INGOT_ALLOY_ENDERITE, "Enderite Alloy");
        builder.add(BaseItems.INGOT_ENDERITE, "Enderite Ingot");
        builder.add(BaseItems.RAW_ALLOY_ENDERITE, "Raw Enderite Alloy");

        builder.add(BaseItems.PLATE_AMETHYST, "Amethyst Plate");
        builder.add(BaseItems.PLATE_CITRINE, "Citrine Plate");
        builder.add(BaseItems.PLATE_COPPER, "Copper Plate");
        builder.add(BaseItems.PLATE_DIAMOND, "Diamond Plate");
        builder.add(BaseItems.PLATE_EMERALD, "Emerald Plate");
        builder.add(BaseItems.PLATE_ENDERITE, "Enderite Plate");
        builder.add(BaseItems.PLATE_GOLD, "Gold Plate");
        builder.add(BaseItems.PLATE_IRON, "Iron Plate");
        builder.add(BaseItems.PLATE_NETHERITE, "Netherite Plate");
        builder.add(BaseItems.PLATE_RUBY, "Ruby Plate");
        builder.add(BaseItems.PLATE_SAPPHIRE, "Sapphire Plate");
        builder.add(BaseItems.PLATE_SHULKER, "Shulker Shell Plate");
        builder.add(BaseItems.PLATE_STONE, "Stone Plate");

        builder.add(BaseItems.REINFORCED_AMETHYST, "Reinforced Amethyst Plate");
        builder.add(BaseItems.REINFORCED_CITRINE, "Reinforced Citrine Plate");
        builder.add(BaseItems.REINFORCED_COPPER, "Reinforced Copper Plate");
        builder.add(BaseItems.REINFORCED_DIAMOND, "Reinforced Diamond Plate");
        builder.add(BaseItems.REINFORCED_EMERALD, "Reinforced Emerald Plate");
        builder.add(BaseItems.REINFORCED_ENDERITE, "Reinforced Enderite Plate");
        builder.add(BaseItems.REINFORCED_GOLD, "Reinforced Gold Plate");
        builder.add(BaseItems.REINFORCED_IRON, "Reinforced Iron Plate");
        builder.add(BaseItems.REINFORCED_NETHERITE, "Reinforced Netherite Plate");
        builder.add(BaseItems.REINFORCED_RUBY, "Reinforced Ruby Plate");
        builder.add(BaseItems.REINFORCED_SAPPHIRE, "Reinforced Sapphire Plate");
        builder.add(BaseItems.REINFORCED_SHULKER, "Reinforced Shulker Shell Plate");

        builder.add(BaseItems.ROD_COPPER, "Copper Rod");
        builder.add(BaseItems.ROD_ENDERITE, "Enderite Rod");
        builder.add(BaseItems.ROD_GLOWSTONE, "Glowstone Rod");
        builder.add(BaseItems.ROD_GOLD, "Gold Rod");
        builder.add(BaseItems.ROD_IRON, "Iron Rod");
        builder.add(BaseItems.ROD_OBSIDIAN, "Obsidian Rod");
        builder.add(BaseItems.ROD_REDSTONE, "Redstone Rod");
        builder.add(BaseItems.ROD_SHULKER, "Shulker Shell Rod");

        builder.add(BaseItems.HEAD_CITRINE_AXE, "Citrine Axe Head");
        builder.add(BaseItems.HEAD_CITRINE_EXCAVATOR, "Citrine Excavator Head");
        builder.add(BaseItems.HEAD_CITRINE_HAMMER, "Citrine Hammer Head");
        builder.add(BaseItems.HEAD_CITRINE_HOE, "Citrine Hoe Head");
        builder.add(BaseItems.HEAD_CITRINE_PICKAXE, "Citrine Pickaxe Head");
        builder.add(BaseItems.HEAD_CITRINE_SHOVEL, "Citrine Shovel Head");
        builder.add(BaseItems.HEAD_CITRINE_SWORD, "Citrine Sword Head");
        builder.add(BaseItems.HEAD_COPPER_AXE, "Copper Axe Head");
        builder.add(BaseItems.HEAD_COPPER_EXCAVATOR, "Copper Excavator Head");
        builder.add(BaseItems.HEAD_COPPER_HAMMER, "Copper Hammer Head");
        builder.add(BaseItems.HEAD_COPPER_HOE, "Copper Hoe Head");
        builder.add(BaseItems.HEAD_COPPER_PICKAXE, "Copper Pickaxe Head");
        builder.add(BaseItems.HEAD_COPPER_SHOVEL, "Copper Shovel Head");
        builder.add(BaseItems.HEAD_COPPER_SWORD, "Copper Sword Head");
        builder.add(BaseItems.HEAD_DIAMOND_AXE, "Diamond Axe Head");
        builder.add(BaseItems.HEAD_DIAMOND_EXCAVATOR, "Diamond Excavator Head");
        builder.add(BaseItems.HEAD_DIAMOND_HAMMER, "Diamond Hammer Head");
        builder.add(BaseItems.HEAD_DIAMOND_HOE, "Diamond Hoe Head");
        builder.add(BaseItems.HEAD_DIAMOND_PICKAXE, "Diamond Pickaxe Head");
        builder.add(BaseItems.HEAD_DIAMOND_SHOVEL, "Diamond Shovel Head");
        builder.add(BaseItems.HEAD_DIAMOND_SWORD, "Diamond Sword Head");
        builder.add(BaseItems.HEAD_ENDERITE_AXE, "Enderite Axe Head");
        builder.add(BaseItems.HEAD_ENDERITE_EXCAVATOR, "Enderite Excavator Head");
        builder.add(BaseItems.HEAD_ENDERITE_HAMMER, "Enderite Hammer Head");
        builder.add(BaseItems.HEAD_ENDERITE_HOE, "Enderite Hoe Head");
        builder.add(BaseItems.HEAD_ENDERITE_PICKAXE, "Enderite Pickaxe Head");
        builder.add(BaseItems.HEAD_ENDERITE_SHOVEL, "Enderite Shovel Head");
        builder.add(BaseItems.HEAD_ENDERITE_SWORD, "Enderite Sword Head");
        builder.add(BaseItems.HEAD_GOLD_AXE, "Gold Axe Head");
        builder.add(BaseItems.HEAD_GOLD_EXCAVATOR, "Gold Excavator Head");
        builder.add(BaseItems.HEAD_GOLD_HAMMER, "Gold Hammer Head");
        builder.add(BaseItems.HEAD_GOLD_HOE, "Gold Hoe Head");
        builder.add(BaseItems.HEAD_GOLD_PICKAXE, "Gold Pickaxe Head");
        builder.add(BaseItems.HEAD_GOLD_SHOVEL, "Gold Shovel Head");
        builder.add(BaseItems.HEAD_GOLD_SWORD, "Gold Sword Head");
        builder.add(BaseItems.HEAD_IRON_AXE, "Iron Axe Head");
        builder.add(BaseItems.HEAD_IRON_EXCAVATOR, "Iron Excavator Head");
        builder.add(BaseItems.HEAD_IRON_HAMMER, "Iron Hammer Head");
        builder.add(BaseItems.HEAD_IRON_HOE, "Iron Hoe Head");
        builder.add(BaseItems.HEAD_IRON_PICKAXE, "Iron Pickaxe Head");
        builder.add(BaseItems.HEAD_IRON_SHOVEL, "Iron Shovel Head");
        builder.add(BaseItems.HEAD_IRON_SWORD, "Iron Sword Head");
        builder.add(BaseItems.HEAD_NETHERITE_AXE, "Netherite Axe Head");
        builder.add(BaseItems.HEAD_NETHERITE_EXCAVATOR, "Netherite Excavator Head");
        builder.add(BaseItems.HEAD_NETHERITE_HAMMER, "Netherite Hammer Head");
        builder.add(BaseItems.HEAD_NETHERITE_HOE, "Netherite Hoe Head");
        builder.add(BaseItems.HEAD_NETHERITE_PICKAXE, "Netherite Pickaxe Head");
        builder.add(BaseItems.HEAD_NETHERITE_SHOVEL, "Netherite Shovel Head");
        builder.add(BaseItems.HEAD_NETHERITE_SWORD, "Netherite Sword Head");
        builder.add(BaseItems.HEAD_RUBY_AXE, "Ruby Axe Head");
        builder.add(BaseItems.HEAD_RUBY_EXCAVATOR, "Ruby Excavator Head");
        builder.add(BaseItems.HEAD_RUBY_HAMMER, "Ruby Hammer Head");
        builder.add(BaseItems.HEAD_RUBY_HOE, "Ruby Hoe Head");
        builder.add(BaseItems.HEAD_RUBY_PICKAXE, "Ruby Pickaxe Head");
        builder.add(BaseItems.HEAD_RUBY_SHOVEL, "Ruby Shovel Head");
        builder.add(BaseItems.HEAD_RUBY_SWORD, "Ruby Sword Head");
        builder.add(BaseItems.HEAD_SAPPHIRE_AXE, "Sapphire Axe Head");
        builder.add(BaseItems.HEAD_SAPPHIRE_EXCAVATOR, "Sapphire Excavator Head");
        builder.add(BaseItems.HEAD_SAPPHIRE_HAMMER, "Sapphire Hammer Head");
        builder.add(BaseItems.HEAD_SAPPHIRE_HOE, "Sapphire Hoe Head");
        builder.add(BaseItems.HEAD_SAPPHIRE_PICKAXE, "Sapphire Pickaxe Head");
        builder.add(BaseItems.HEAD_SAPPHIRE_SHOVEL, "Sapphire Shovel Head");
        builder.add(BaseItems.HEAD_SAPPHIRE_SWORD, "Sapphire Sword Head");
        builder.add(BaseItems.HEAD_STONE_HAMMER, "Stone Hammer Head");
        builder.add(BaseItems.HEAD_STONE_EXCAVATOR, "Stone Excavator Head");
        builder.add(BaseItems.HEAD_WOOD_HAMMER, "Wooden Hammer Head");
        builder.add(BaseItems.HEAD_WOOD_EXCAVATOR, "Wooden Excavator Head");

        builder.add(BaseBlockItems.ANGEL, "Angel Block");
        builder.add(BaseBlocks.ELEVATOR, "Elevator");
        //builder.add(BaseBlocks.ANGEL, "Angel Block");

        builder.add(BaseBlocks.CARROT_BOX, "Box of Carrots");
        builder.add(BaseBlocks.POTATO_BOX, "Box of Potatoes");
        builder.add(BaseBlocks.CITRINE, "Citrine Block");
        builder.add(BaseBlocks.ENDERITE, "Enderite Block");
        builder.add(BaseBlocks.RUBY, "Ruby Block");
        builder.add(BaseBlocks.SAPPHIRE, "Sapphire Block");

        builder.add(BaseBlocks.RAW_CITRINE, "Raw Citrine Block");
        builder.add(BaseBlocks.RAW_ENDERITE, "Raw Enderite Block");
        builder.add(BaseBlocks.RAW_QUARTZ, "Raw Quartz Block");
        builder.add(BaseBlocks.RAW_RUBY, "Raw Ruby Block");
        builder.add(BaseBlocks.RAW_SAPPHIRE, "Raw Sapphire Block");

        builder.add(MainBase.REFERENCE.GEM_BLOCKS, "");
        builder.add(MainBase.REFERENCE.IS_MACHINE, "");
        builder.add(MainBase.REFERENCE.HAMMER_BLACKLIST, "Hammer Blacklist");
        builder.add(MainBase.REFERENCE.EXCAVATOR_BLACKLIST, "Excavator Blacklist");
        builder.add(MainBase.REFERENCE.INCORRECT_FOR_ENDERITE_TOOL, "Incorrect For Enderite Tool");

        builder.add(MainBase.REFERENCE.RUBY_GEMS, "Ruby Gems");
        builder.add(MainBase.REFERENCE.SAPPHIRE_GEMS, "Sapphire Gems");
        builder.add(MainBase.REFERENCE.CITRINE_GEMS, "Citrine Gems");
        builder.add(MainBase.REFERENCE.FLUID_BUCKET, "Fluid Buckets");
        builder.add(MainBase.REFERENCE.CAST, "Casts");
        builder.add(MainBase.REFERENCE.RAW, "Raws");
        builder.add(MainBase.REFERENCE.WOOD_CAST, "Wood Casts");
        builder.add(MainBase.REFERENCE.GEAR, "Gears");
        builder.add(MainBase.REFERENCE.DUST, "Dusts");
        builder.add(MainBase.REFERENCE.INGOT, "Ingots");
        builder.add(MainBase.REFERENCE.PLATE, "Plates");
        builder.add(MainBase.REFERENCE.REINFORCED, "Reinforced Plates");
        builder.add(MainBase.REFERENCE.ROD, "Rods");
        builder.add(MainBase.REFERENCE.TOOL_HEAD, "Tool Heads");
        builder.add(MainBase.REFERENCE.ALLOY, "Alloys");
        builder.add(MainBase.REFERENCE.GEM, "Gems");
        builder.add(MainBase.REFERENCE.HAMMERS, "Hammers");
        builder.add(MainBase.REFERENCE.EXCAVATORS, "Excavators");
        builder.add(MainBase.REFERENCE.MENDING_ONLY, "Mending Only");
        builder.add(MainBase.REFERENCE.SMELTABLE, "Smeltables");
        builder.add(MainBase.REFERENCE.ENDERITE_INGOTS, "Enderite Ingots");

        builder.add(MainBase.REFERENCE.REPAIRS_AMETHYST_ARMOR, "Amethyst Armor Repair Material");
        builder.add(MainBase.REFERENCE.REPAIRS_CITRINE_ARMOR, "Citrine Armor Repair Material");
        builder.add(MainBase.REFERENCE.REPAIRS_COPPER_ARMOR, "Copper Armor Repair Material");
        builder.add(MainBase.REFERENCE.REPAIRS_EMERALD_ARMOR, "Emerald Armor Repair Material");
        builder.add(MainBase.REFERENCE.REPAIRS_ENDERITE_ARMOR, "Enderite Armor Repair Material");
        builder.add(MainBase.REFERENCE.REPAIRS_RUBY_ARMOR, "Ruby Armor Repair Material");
        builder.add(MainBase.REFERENCE.REPAIRS_SAPPHIRE_ARMOR, "Sapphire Armor Repair Material");
        builder.add(MainBase.REFERENCE.REPAIRS_CITRINE_TOOL, "Citrine Tool Repair Material");
        builder.add(MainBase.REFERENCE.REPAIRS_COPPER_TOOL, "Copper Tool Repair Material");
        builder.add(MainBase.REFERENCE.REPAIRS_ENDERITE_TOOL, "Enderite Tool Repair Material");
        builder.add(MainBase.REFERENCE.REPAIRS_RUBY_TOOL, "Ruby Tool Repair Material");
        builder.add(MainBase.REFERENCE.REPAIRS_SAPPHIRE_TOOL, "Sapphire Tool Repair Material");

        builder.add(MainBase.REFERENCE.AMETHYST_ARMOR_TYPE, "Amethyst Armors");
        builder.add(MainBase.REFERENCE.CITRINE_ARMOR_TYPE, "Citrine Armors");
        builder.add(MainBase.REFERENCE.COPPER_ARMOR_TYPE, "Copper Armors");
        builder.add(MainBase.REFERENCE.EMERALD_ARMOR_TYPE, "Emerald Armors");
        builder.add(MainBase.REFERENCE.ENDERITE_ARMOR_TYPE, "Enderite Armors");
        builder.add(MainBase.REFERENCE.RUBY_ARMOR_TYPE, "Ruby Armors");
        builder.add(MainBase.REFERENCE.SAPPHIRE_ARMOR_TYPE, "Sapphire Armors");

        builder.add(MainBase.REFERENCE.TUNER_BLACKLIST, "Tuner Blacklist");
        builder.add(MainBase.REFERENCE.RUBY_SWORD_WHITELIST, "Ruby Sword Whitelist");
        builder.add(MainBase.REFERENCE.ENDERITE_SWORD_BLACKLIST, "Enderite Sword Blacklist");

        addText(builder, MainBase.REFERENCE.BLOCKS_TITLE, "Blocks");
        addText(builder, MainBase.REFERENCE.INGREDIENT_TITLE, "Ingredients");
        addText(builder, MainBase.REFERENCE.MACHINES_TITLE, "Machines");
        addText(builder, MainBase.REFERENCE.TOOLS_TITLE, "Tools");
        addText(builder, MainBase.REFERENCE.ARMORS_TITLE, "Armors");
        addText(builder, MainBase.REFERENCE.MISC_TITLE, "Misc");
    }
}