package jiraiyah.ultraio_base;

import jiraiyah.reference.JiReference;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.MutableText;

public class ReferenceBase extends JiReference
{
    public ReferenceBase(String mod_ID)
    {
        super(mod_ID);
    }

    //region ITEM GROUP NAMES AND TITLES
    public final String BLOCK_ITEM_GROUP_NAME = "_1_block_group";
    public final String INGREDIENT_ITEM_GROUP_NAME = "_5_ingredient_group";
    public final String MACHINE_ITEM_GROUP_NAME = "_2_machine_group";
    public final String TOOLS_ITEM_GROUP_NAME = "_3_tool_group";
    public final String ARMOR_ITEM_GROUP_NAME = "_4_armor_group";
    public final String MISC_ITEM_GROUP_NAME = "_6_misc_group";
    public final MutableText BLOCKS_TITLE = translate(BLOCK_ITEM_GROUP_NAME);
    public final MutableText INGREDIENT_TITLE = translate(INGREDIENT_ITEM_GROUP_NAME);
    public final MutableText MACHINES_TITLE = translate(MACHINE_ITEM_GROUP_NAME);
    public final MutableText TOOLS_TITLE = translate(TOOLS_ITEM_GROUP_NAME);
    public final MutableText ARMORS_TITLE = translate(ARMOR_ITEM_GROUP_NAME);
    public final MutableText MISC_TITLE = translate(MISC_ITEM_GROUP_NAME);
    //endregion

    //region BLOCK TAGS
    public final TagKey<Block> GEM_BLOCKS = createBlockCommonTag("gem_blocks");
    public final TagKey<Block> IS_MACHINE = createBlockCommonTag("machines");
    public final TagKey<Block> HAMMER_BLACKLIST = createBlockTag("hammer_blacklist");
    public final TagKey<Block> EXCAVATOR_BLACKLIST = createBlockTag("excavator_blacklist");
    public final TagKey<Block> INCORRECT_FOR_ENDERITE_TOOL = createBlockTag("incorrect_for_enderite_tool");
    //endregion

    //region ITEM TAGS
    public final TagKey<Item> RUBY_GEMS = createItemCommonTag("ruby_gems");
    public final TagKey<Item> SAPPHIRE_GEMS = createItemCommonTag("sapphire_gems");
    public final TagKey<Item> CITRINE_GEMS = createItemCommonTag("citrine_gems");

    public final TagKey<Item> FLUID_BUCKET = createItemCommonTag("fluid_buckets");
    public final TagKey<Item> CAST = createItemCommonTag("casts");
    public final TagKey<Item> RAW = createItemCommonTag("raws");
    public final TagKey<Item> WOOD_CAST = createItemCommonTag("wood_casts");
    public final TagKey<Item> GEAR = createItemCommonTag("gears");
    public final TagKey<Item> DUST = createItemCommonTag("dusts");
    public final TagKey<Item> INGOT = createItemCommonTag("ingots");
    public final TagKey<Item> PLATE = createItemCommonTag("plates");
    public final TagKey<Item> REINFORCED = createItemCommonTag("reinforced_plates");
    public final TagKey<Item> ROD = createItemCommonTag("rods");
    public final TagKey<Item> TOOL_HEAD = createItemCommonTag("tool_heads");
    public final TagKey<Item> ALLOY = createItemCommonTag("alloys");
    public final TagKey<Item> GEM = createItemCommonTag("gems");
    public final TagKey<Item> MENDING_ONLY = createItemCommonTag("mending_only");


    public final TagKey<Item> HAMMERS = createItemTag("hammers");
    public final TagKey<Item> EXCAVATORS = createItemTag("excavators");

    public final TagKey<Item> ENDERITE_INGOTS = createItemTag("enderite_ingots");
    public final TagKey<Item> SMELTABLE = createItemTag("smeltable");

    public final TagKey<Item> REPAIRS_AMETHYST_ARMOR = createItemTag("repairs_amethyst_armor");
    public final TagKey<Item> REPAIRS_CITRINE_ARMOR = createItemTag("repairs_citrine_armor");
    public final TagKey<Item> REPAIRS_COPPER_ARMOR = createItemTag("repairs_copper_armor");
    public final TagKey<Item> REPAIRS_EMERALD_ARMOR = createItemTag("repairs_emerald_armor");
    public final TagKey<Item> REPAIRS_ENDERITE_ARMOR = createItemTag("repairs_enderite_armor");
    public final TagKey<Item> REPAIRS_RUBY_ARMOR = createItemTag("repairs_ruby_armor");
    public final TagKey<Item> REPAIRS_SAPPHIRE_ARMOR = createItemTag("repairs_sapphire_armor");
    public final TagKey<Item> REPAIRS_CITRINE_TOOL = createItemTag("repairs_citrine_tool");
    public final TagKey<Item> REPAIRS_COPPER_TOOL = createItemTag("repairs_copper_tool");
    public final TagKey<Item> REPAIRS_ENDERITE_TOOL = createItemTag("repairs_enderite_tool");
    public final TagKey<Item> REPAIRS_RUBY_TOOL = createItemTag("repairs_ruby_tool");
    public final TagKey<Item> REPAIRS_SAPPHIRE_TOOL = createItemTag("repairs_sapphire_tool");
    public final TagKey<Item> AMETHYST_ARMOR_TYPE = createItemTag("amethyst_armor_type");
    public final TagKey<Item> CITRINE_ARMOR_TYPE = createItemTag("citrine_armor_type");
    public final TagKey<Item> COPPER_ARMOR_TYPE = createItemTag("copper_armor_type");
    public final TagKey<Item> EMERALD_ARMOR_TYPE = createItemTag("emerald_armor_type");
    public final TagKey<Item> ENDERITE_ARMOR_TYPE = createItemTag("enderite_armor_type");
    public final TagKey<Item> RUBY_ARMOR_TYPE = createItemTag("ruby_armor_type");
    public final TagKey<Item> SAPPHIRE_ARMOR_TYPE = createItemTag("sapphire_armor_type");
    //endregion

    //region ENTITY TAGS
    public final TagKey<EntityType<?>> TUNER_BLACKLIST = createEntityTag("tuner_blacklist");
    public final TagKey<EntityType<?>> RUBY_SWORD_WHITELIST = createEntityTag("ruby_sword_whitelist");
    public final TagKey<EntityType<?>> ENDERITE_SWORD_BLACKLIST = createEntityTag("enderite_sword_blacklist");
    //endregion
}