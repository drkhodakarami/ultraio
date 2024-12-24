package jiraiyah.ultraio_base.datagen;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_base.registry.BaseBlocks;
import jiraiyah.ultraio_base.registry.BaseItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;

public class BaseModelProvider extends FabricModelProvider
{
    public static BlockStateModelGenerator.BlockTexturePool
            CITRINE_TEXTURE_POOL, RUBY_TEXTURE_POOL, SAPPHIRE_TEXTURE_POOL, ENDERITE_TEXTURE_POOL;

    public BaseModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    //region ITEM MODEL HELPER METHODS
    private static void registerFoods(ItemModelGenerator generator)
    {
        generator.register(BaseItems.COOKED_EGG, Models.GENERATED);
        generator.register(BaseItems.EGG_AND_BREAD, Models.GENERATED);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator)
    {
        MainBase.LOGGER.logG("Generating Block Model Data");

        generator.registerSingleton(BaseBlocks.CARROT_BOX, TexturedModel.CUBE_BOTTOM_TOP);
        generator.registerSingleton(BaseBlocks.POTATO_BOX, TexturedModel.CUBE_BOTTOM_TOP);
        generator.registerSimpleCubeAll(BaseBlocks.ANGEL);
        generator.registerSingleton(BaseBlocks.ELEVATOR, TexturedModel.CUBE_BOTTOM_TOP);
        generator.registerSimpleCubeAll(BaseBlocks.CITRINE);
        generator.registerSimpleCubeAll(BaseBlocks.RUBY);
        generator.registerSimpleCubeAll(BaseBlocks.SAPPHIRE);
        generator.registerSimpleCubeAll(BaseBlocks.RAW_CITRINE);
        generator.registerSimpleCubeAll(BaseBlocks.RAW_ENDERITE);
        generator.registerSimpleCubeAll(BaseBlocks.RAW_QUARTZ);
        generator.registerSimpleCubeAll(BaseBlocks.RAW_RUBY);
        generator.registerSimpleCubeAll(BaseBlocks.RAW_SAPPHIRE);

        CITRINE_TEXTURE_POOL = generator.registerCubeAllModelTexturePool(BaseBlocks.CITRINE);
        ENDERITE_TEXTURE_POOL = generator.registerCubeAllModelTexturePool(BaseBlocks.ENDERITE);
        RUBY_TEXTURE_POOL = generator.registerCubeAllModelTexturePool(BaseBlocks.RUBY);
        SAPPHIRE_TEXTURE_POOL = generator.registerCubeAllModelTexturePool(BaseBlocks.SAPPHIRE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator generator)
    {
        MainBase.LOGGER.logG("Generating Item Model Data");

        registerFoods(generator);
        registerFuels(generator);
        registerMobDrops(generator);
        registerCastItems(generator);
        registerDustItems(generator);
        registerGearItems(generator);
        registerGemItems(generator);
        registerIngotItems(generator);
        registerPlateItems(generator);
        registerRawItems(generator);
        registerRodItems(generator);
        registerToolHeadItems(generator);
        registerSpecialItems(generator);
    }

    private static void registerFuels(ItemModelGenerator generator)
    {
        generator.register(BaseItems.HOT_COAL, Models.GENERATED);
    }

    private static void registerMobDrops(ItemModelGenerator generator)
    {
        generator.register(BaseItems.ENDER_CHARM, Models.GENERATED);
        generator.register(BaseItems.ENDERMAN_EYE, Models.GENERATED);
        generator.register(BaseItems.ENDERMAN_HEART, Models.GENERATED);
        generator.register(BaseItems.ENDERMAN_GLAND, Models.GENERATED);
    }

    private static void registerCastItems(ItemModelGenerator generator)
    {
        generator.register(BaseItems.CAST_AXE, Models.GENERATED);
        generator.register(BaseItems.CAST_BINDING, Models.GENERATED);
        generator.register(BaseItems.CAST_EXCAVATOR, Models.GENERATED);
        generator.register(BaseItems.CAST_GEAR, Models.GENERATED);
        generator.register(BaseItems.CAST_GEM, Models.GENERATED);
        generator.register(BaseItems.CAST_HAMMER, Models.GENERATED);
        generator.register(BaseItems.CAST_HANDLE, Models.GENERATED);
        generator.register(BaseItems.CAST_HOE, Models.GENERATED);
        generator.register(BaseItems.CAST_INGOT, Models.GENERATED);
        generator.register(BaseItems.CAST_NUGGET, Models.GENERATED);
        generator.register(BaseItems.CAST_PICKAXE, Models.GENERATED);
        generator.register(BaseItems.CAST_PLATE, Models.GENERATED);
        generator.register(BaseItems.CAST_ROD, Models.GENERATED);
        generator.register(BaseItems.CAST_SHOVEL, Models.GENERATED);
        generator.register(BaseItems.CAST_SWORD, Models.GENERATED);
        generator.register(BaseItems.CAST_WIRE, Models.GENERATED);
        generator.register(BaseItems.CAST_WOOD_INGOT, Models.GENERATED);
        generator.register(BaseItems.CAST_WOOD_PICKAXE, Models.GENERATED);
    }

    private static void registerDustItems(ItemModelGenerator generator)
    {
        generator.register(BaseItems.CRUSHED_SHULKER, Models.GENERATED);
        generator.register(BaseItems.DUST_CONDUCTIVE, Models.GENERATED);
        generator.register(BaseItems.DUST_COPPER, Models.GENERATED);
        generator.register(BaseItems.DUST_ENDERITE, Models.GENERATED);
        generator.register(BaseItems.DUST_ENERGETIC, Models.GENERATED);
        generator.register(BaseItems.DUST_GOLD, Models.GENERATED);
        generator.register(BaseItems.DUST_IRON, Models.GENERATED);
        generator.register(BaseItems.DUST_OBSIDIAN, Models.GENERATED);
        generator.register(BaseItems.DUST_PULSATING, Models.GENERATED);
        generator.register(BaseItems.DUST_RED_ALLOY, Models.GENERATED);
        generator.register(BaseItems.DUST_SOUL, Models.GENERATED);
        generator.register(BaseItems.DUST_VIBRANT, Models.GENERATED);
        generator.register(BaseItems.DUST_WITHERING, Models.GENERATED);
    }

    private static void registerGearItems(ItemModelGenerator generator)
    {
        generator.register(BaseItems.GEAR_COPPER, Models.GENERATED);
        generator.register(BaseItems.GEAR_DIAMOND, Models.GENERATED);
        generator.register(BaseItems.GEAR_EMERALD, Models.GENERATED);
        generator.register(BaseItems.GEAR_ENDERITE, Models.GENERATED);
        generator.register(BaseItems.GEAR_ENERGIZED, Models.GENERATED);
        generator.register(BaseItems.GEAR_GOLD, Models.GENERATED);
        generator.register(BaseItems.GEAR_IRON, Models.GENERATED);
        generator.register(BaseItems.GEAR_LAPIS, Models.GENERATED);
        generator.register(BaseItems.GEAR_NETHERITE, Models.GENERATED);
        generator.register(BaseItems.GEAR_OBSIDIAN, Models.GENERATED);
        generator.register(BaseItems.GEAR_PRISMARINE, Models.GENERATED);
        generator.register(BaseItems.GEAR_QUARTZ, Models.GENERATED);
        generator.register(BaseItems.GEAR_RUBY, Models.GENERATED);
        generator.register(BaseItems.GEAR_SAPPHIRE, Models.GENERATED);
        generator.register(BaseItems.GEAR_SHULKER, Models.GENERATED);
        generator.register(BaseItems.GEAR_STONE, Models.GENERATED);
        generator.register(BaseItems.GEAR_VIBRANT, Models.GENERATED);
        generator.register(BaseItems.GEAR_WOOD, Models.GENERATED);
    }

    private static void registerGemItems(ItemModelGenerator generator)
    {
        generator.register(BaseItems.GEM_CITRINE, Models.GENERATED);
        generator.register(BaseItems.GEM_RUBY, Models.GENERATED);
        generator.register(BaseItems.GEM_SAPPHIRE, Models.GENERATED);
    }

    private static void registerIngotItems(ItemModelGenerator generator)
    {
        generator.register(BaseItems.INGOT_ALLOY_CONDUCTIVE, Models.GENERATED);
        generator.register(BaseItems.INGOT_ALLOY_ENERGETIC, Models.GENERATED);
        generator.register(BaseItems.INGOT_ALLOY_PULSATING, Models.GENERATED);
        generator.register(BaseItems.INGOT_ALLOY_RED, Models.GENERATED);
        generator.register(BaseItems.INGOT_ALLOY_VIBRANT, Models.GENERATED);
        generator.register(BaseItems.INGOT_ALLOY_ENDERITE, Models.GENERATED);
        generator.register(BaseItems.INGOT_ENDERITE, Models.GENERATED);
        generator.register(BaseItems.RAW_ALLOY_ENDERITE, Models.GENERATED);
    }

    private static void registerPlateItems(ItemModelGenerator generator)
    {
        generator.register(BaseItems.PLATE_AMETHYST, Models.GENERATED);
        generator.register(BaseItems.PLATE_CITRINE, Models.GENERATED);
        generator.register(BaseItems.PLATE_COPPER, Models.GENERATED);
        generator.register(BaseItems.PLATE_DIAMOND, Models.GENERATED);
        generator.register(BaseItems.PLATE_EMERALD, Models.GENERATED);
        generator.register(BaseItems.PLATE_ENDERITE, Models.GENERATED);
        generator.register(BaseItems.PLATE_GOLD, Models.GENERATED);
        generator.register(BaseItems.PLATE_IRON, Models.GENERATED);
        generator.register(BaseItems.PLATE_NETHERITE, Models.GENERATED);
        generator.register(BaseItems.PLATE_RUBY, Models.GENERATED);
        generator.register(BaseItems.PLATE_SAPPHIRE, Models.GENERATED);
        generator.register(BaseItems.PLATE_SHULKER, Models.GENERATED);
        generator.register(BaseItems.PLATE_STONE, Models.GENERATED);
        generator.register(BaseItems.REINFORCED_AMETHYST, Models.GENERATED);
        generator.register(BaseItems.REINFORCED_CITRINE, Models.GENERATED);
        generator.register(BaseItems.REINFORCED_COPPER, Models.GENERATED);
        generator.register(BaseItems.REINFORCED_DIAMOND, Models.GENERATED);
        generator.register(BaseItems.REINFORCED_EMERALD, Models.GENERATED);
        generator.register(BaseItems.REINFORCED_ENDERITE, Models.GENERATED);
        generator.register(BaseItems.REINFORCED_GOLD, Models.GENERATED);
        generator.register(BaseItems.REINFORCED_IRON, Models.GENERATED);
        generator.register(BaseItems.REINFORCED_NETHERITE, Models.GENERATED);
        generator.register(BaseItems.REINFORCED_RUBY, Models.GENERATED);
        generator.register(BaseItems.REINFORCED_SAPPHIRE, Models.GENERATED);
        generator.register(BaseItems.REINFORCED_SHULKER, Models.GENERATED);
    }

    private static void registerRawItems(ItemModelGenerator generator)
    {
        generator.register(BaseItems.RAW_CITRINE, Models.GENERATED);
        generator.register(BaseItems.RAW_ENDERITE, Models.GENERATED);
        generator.register(BaseItems.RAW_QUARTZ, Models.GENERATED);
        generator.register(BaseItems.RAW_RUBY, Models.GENERATED);
        generator.register(BaseItems.RAW_SAPPHIRE, Models.GENERATED);
    }

    private static void registerRodItems(ItemModelGenerator generator)
    {
        generator.register(BaseItems.ROD_COPPER, Models.GENERATED);
        generator.register(BaseItems.ROD_ENDERITE, Models.GENERATED);
        generator.register(BaseItems.ROD_GLOWSTONE, Models.GENERATED);
        generator.register(BaseItems.ROD_GOLD, Models.GENERATED);
        generator.register(BaseItems.ROD_IRON, Models.GENERATED);
        generator.register(BaseItems.ROD_OBSIDIAN, Models.GENERATED);
        generator.register(BaseItems.ROD_REDSTONE, Models.GENERATED);
        generator.register(BaseItems.ROD_SHULKER, Models.GENERATED);
    }

    private static void registerToolHeadItems(ItemModelGenerator generator)
    {
        generator.register(BaseItems.HEAD_CITRINE_AXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_CITRINE_EXCAVATOR, Models.GENERATED);
        generator.register(BaseItems.HEAD_CITRINE_HAMMER, Models.GENERATED);
        generator.register(BaseItems.HEAD_CITRINE_HOE, Models.GENERATED);
        generator.register(BaseItems.HEAD_CITRINE_PICKAXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_CITRINE_SHOVEL, Models.GENERATED);
        generator.register(BaseItems.HEAD_CITRINE_SWORD, Models.GENERATED);
        generator.register(BaseItems.HEAD_COPPER_AXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_COPPER_EXCAVATOR, Models.GENERATED);
        generator.register(BaseItems.HEAD_COPPER_HAMMER, Models.GENERATED);
        generator.register(BaseItems.HEAD_COPPER_HOE, Models.GENERATED);
        generator.register(BaseItems.HEAD_COPPER_PICKAXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_COPPER_SHOVEL, Models.GENERATED);
        generator.register(BaseItems.HEAD_COPPER_SWORD, Models.GENERATED);
        generator.register(BaseItems.HEAD_DIAMOND_AXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_DIAMOND_EXCAVATOR, Models.GENERATED);
        generator.register(BaseItems.HEAD_DIAMOND_HAMMER, Models.GENERATED);
        generator.register(BaseItems.HEAD_DIAMOND_HOE, Models.GENERATED);
        generator.register(BaseItems.HEAD_DIAMOND_PICKAXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_DIAMOND_SHOVEL, Models.GENERATED);
        generator.register(BaseItems.HEAD_DIAMOND_SWORD, Models.GENERATED);
        generator.register(BaseItems.HEAD_ENDERITE_AXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_ENDERITE_EXCAVATOR, Models.GENERATED);
        generator.register(BaseItems.HEAD_ENDERITE_HAMMER, Models.GENERATED);
        generator.register(BaseItems.HEAD_ENDERITE_HOE, Models.GENERATED);
        generator.register(BaseItems.HEAD_ENDERITE_PICKAXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_ENDERITE_SHOVEL, Models.GENERATED);
        generator.register(BaseItems.HEAD_ENDERITE_SWORD, Models.GENERATED);
        generator.register(BaseItems.HEAD_GOLD_AXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_GOLD_EXCAVATOR, Models.GENERATED);
        generator.register(BaseItems.HEAD_GOLD_HAMMER, Models.GENERATED);
        generator.register(BaseItems.HEAD_GOLD_HOE, Models.GENERATED);
        generator.register(BaseItems.HEAD_GOLD_PICKAXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_GOLD_SHOVEL, Models.GENERATED);
        generator.register(BaseItems.HEAD_GOLD_SWORD, Models.GENERATED);
        generator.register(BaseItems.HEAD_IRON_AXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_IRON_EXCAVATOR, Models.GENERATED);
        generator.register(BaseItems.HEAD_IRON_HAMMER, Models.GENERATED);
        generator.register(BaseItems.HEAD_IRON_HOE, Models.GENERATED);
        generator.register(BaseItems.HEAD_IRON_PICKAXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_IRON_SHOVEL, Models.GENERATED);
        generator.register(BaseItems.HEAD_IRON_SWORD, Models.GENERATED);
        generator.register(BaseItems.HEAD_NETHERITE_AXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_NETHERITE_EXCAVATOR, Models.GENERATED);
        generator.register(BaseItems.HEAD_NETHERITE_HAMMER, Models.GENERATED);
        generator.register(BaseItems.HEAD_NETHERITE_HOE, Models.GENERATED);
        generator.register(BaseItems.HEAD_NETHERITE_PICKAXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_NETHERITE_SHOVEL, Models.GENERATED);
        generator.register(BaseItems.HEAD_NETHERITE_SWORD, Models.GENERATED);
        generator.register(BaseItems.HEAD_RUBY_AXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_RUBY_EXCAVATOR, Models.GENERATED);
        generator.register(BaseItems.HEAD_RUBY_HAMMER, Models.GENERATED);
        generator.register(BaseItems.HEAD_RUBY_HOE, Models.GENERATED);
        generator.register(BaseItems.HEAD_RUBY_PICKAXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_RUBY_SHOVEL, Models.GENERATED);
        generator.register(BaseItems.HEAD_RUBY_SWORD, Models.GENERATED);
        generator.register(BaseItems.HEAD_SAPPHIRE_AXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_SAPPHIRE_EXCAVATOR, Models.GENERATED);
        generator.register(BaseItems.HEAD_SAPPHIRE_HAMMER, Models.GENERATED);
        generator.register(BaseItems.HEAD_SAPPHIRE_HOE, Models.GENERATED);
        generator.register(BaseItems.HEAD_SAPPHIRE_PICKAXE, Models.GENERATED);
        generator.register(BaseItems.HEAD_SAPPHIRE_SHOVEL, Models.GENERATED);
        generator.register(BaseItems.HEAD_SAPPHIRE_SWORD, Models.GENERATED);
        generator.register(BaseItems.HEAD_STONE_HAMMER, Models.GENERATED);
        generator.register(BaseItems.HEAD_STONE_EXCAVATOR, Models.GENERATED);
        generator.register(BaseItems.HEAD_WOOD_HAMMER, Models.GENERATED);
        generator.register(BaseItems.HEAD_WOOD_EXCAVATOR, Models.GENERATED);
    }

    private static void registerSpecialItems(ItemModelGenerator generator)
    {
        generator.register(BaseItems.BINDING_STRING, Models.GENERATED);
        generator.register(BaseItems.RAW_RUBBER, Models.GENERATED);
        generator.register(BaseItems.RUBBER, Models.GENERATED);
        generator.register(BaseItems.UNSTABLE_GOO, Models.GENERATED);
        generator.register(BaseItems.COMBUSTION_CORE, Models.GENERATED);
        generator.register(BaseItems.THERMAL_CORE, Models.GENERATED);
        generator.register(BaseItems.VOID_PLATE, Models.GENERATED);
        generator.register(BaseItems.VOID_PLATE_ACTIVATOR, Models.GENERATED);
        generator.register(BaseItems.VOID_PLATE_BASE, Models.GENERATED);
        generator.register(BaseItems.ITEM_FILTER, Models.GENERATED);
        generator.register(BaseItems.SLOT_DISABLED, Models.GENERATED);
        generator.register(BaseItems.SLOT_ENABLED, Models.GENERATED);
    }
    //endregion
}