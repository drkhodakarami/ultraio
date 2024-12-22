package jiraiyah.ultraio_base.datagen;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_base.registry.BaseBlocks;
import jiraiyah.ultraio_base.registry.BaseItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.SmokingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class BaseRecipeProvider extends FabricRecipeProvider
{
    public BaseRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public String getName()
    {
        return MainBase.ModID;
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter)
    {
        return new RecipeGenerator(registries, exporter)
        {
            @Override
            public void generate()
            {
                MainBase.LOGGER.logG("Generating Recipe Data");

                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, BaseItems.GEM_CITRINE,
                                                 RecipeCategory.DECORATIONS, BaseBlocks.CITRINE);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, BaseItems.GEM_RUBY,
                                                 RecipeCategory.DECORATIONS, BaseBlocks.RUBY);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, BaseItems.GEM_SAPPHIRE,
                                                 RecipeCategory.DECORATIONS, BaseBlocks.SAPPHIRE);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, BaseItems.INGOT_ENDERITE,
                                                 RecipeCategory.DECORATIONS, BaseBlocks.ENDERITE);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, BaseItems.RAW_CITRINE,
                                                 RecipeCategory.DECORATIONS, BaseBlocks.RAW_CITRINE);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, BaseItems.RAW_ENDERITE,
                                                 RecipeCategory.DECORATIONS, BaseBlocks.RAW_ENDERITE);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, BaseItems.RAW_QUARTZ,
                                                 RecipeCategory.DECORATIONS, BaseBlocks.RAW_QUARTZ);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, BaseItems.RAW_RUBY,
                                                 RecipeCategory.DECORATIONS, BaseBlocks.RAW_RUBY);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, BaseItems.RAW_SAPPHIRE,
                                                 RecipeCategory.DECORATIONS, BaseBlocks.RAW_SAPPHIRE);

                offerFoodCookingRecipe("smoking", RecipeSerializer.SMOKING, SmokingRecipe::new,
                                       400, Items.ROTTEN_FLESH, Items.LEATHER, 0.1F);

                createShapeless(RecipeCategory.MISC, Items.NAME_TAG, 1)
                        .input(Items.PAPER)
                        .input(BaseItems.ROD_IRON)
                        .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                        .criterion(hasItem(BaseItems.ROD_IRON), conditionsFromItem(BaseItems.ROD_IRON))
                        .offerTo(exporter, getRecipeName(Items.NAME_TAG) + "_shapeless");

                offerSmelting(List.of(Items.EGG), RecipeCategory.FOOD, BaseItems.COOKED_EGG, 0.15f, 100, "cooked_egg_smelting");

                offerFoodCookingRecipe("campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new,
                                       300, Items.EGG, BaseItems.COOKED_EGG, 0.15F);

                createShapeless(RecipeCategory.FOOD, BaseItems.EGG_AND_BREAD, 1)
                        .input(BaseItems.COOKED_EGG)
                        .input(Items.BREAD)
                        .criterion(hasItem(BaseItems.COOKED_EGG), conditionsFromItem(BaseItems.COOKED_EGG))
                        .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                        .offerTo(exporter, getRecipeName(BaseItems.EGG_AND_BREAD) + "_shapeless");

                createShaped(RecipeCategory.MISC, BaseItems.HOT_COAL, 8)
                        .pattern("CCC")
                        .pattern("CBC")
                        .pattern("CCC")
                        .input('C', Items.COAL)
                        .input('B', Items.LAVA_BUCKET)
                        .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL))
                        .criterion(hasItem(Items.LAVA_BUCKET), conditionsFromItem(Items.LAVA_BUCKET))
                        .offerTo(exporter, getRecipeName(BaseItems.HOT_COAL));

                createShaped(RecipeCategory.TOOLS, BaseItems.ENDER_CHARM, 1)
                        .pattern("EIE")
                        .pattern("GIG")
                        .pattern("IHI")
                        .input('E', BaseItems.ENDERMAN_EYE)
                        .input('I', BaseItems.INGOT_ENDERITE)
                        .input('G', BaseItems.ENDERMAN_GLAND)
                        .input('H', BaseItems.ENDERMAN_HEART)
                        .criterion(hasItem(BaseItems.ENDERMAN_EYE), conditionsFromItem(BaseItems.ENDERMAN_EYE))
                        .criterion(hasItem(BaseItems.INGOT_ENDERITE), conditionsFromItem(BaseItems.INGOT_ENDERITE))
                        .criterion(hasItem(BaseItems.ENDERMAN_GLAND), conditionsFromItem(BaseItems.ENDERMAN_GLAND))
                        .criterion(hasItem(BaseItems.ENDERMAN_HEART), conditionsFromItem(BaseItems.ENDERMAN_HEART))
                        .offerTo(exporter, getRecipeName(BaseItems.ENDER_CHARM));

                createShapeless(RecipeCategory.TOOLS, BaseItems.VOID_PLATE, 1)
                        .input(BaseItems.VOID_PLATE_BASE)
                        .input(BaseItems.VOID_PLATE_ACTIVATOR)
                        .criterion(hasItem(BaseItems.VOID_PLATE_BASE), conditionsFromItem(BaseItems.VOID_PLATE_BASE))
                        .criterion(hasItem(BaseItems.VOID_PLATE_ACTIVATOR), conditionsFromItem(BaseItems.VOID_PLATE_ACTIVATOR))
                        .offerTo(exporter, getRecipeName(BaseItems.VOID_PLATE) + "_shapeless");

                createShaped(RecipeCategory.MISC, BaseItems.ITEM_FILTER, 1)
                        .pattern("   ")
                        .pattern("RRR")
                        .pattern("PPP")
                        .input('R', Items.REDSTONE)
                        .input('P', Items.PAPER)
                        .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                        .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                        .offerTo(exporter, getRecipeName(BaseItems.ITEM_FILTER));

                createShaped(RecipeCategory.MISC, BaseItems.SLOT_DISABLED, 1)
                        .pattern("   ")
                        .pattern("RWR")
                        .pattern("SSS")
                        .input('R', Items.REDSTONE)
                        .input('W', Items.LAPIS_LAZULI)
                        .input('S', BaseItems.PLATE_STONE)
                        .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                        .criterion(hasItem(Items.LAPIS_LAZULI), conditionsFromItem(Items.LAPIS_LAZULI))
                        .criterion(hasItem(BaseItems.PLATE_STONE), conditionsFromItem(BaseItems.PLATE_STONE))
                        .offerTo(exporter, getRecipeName(BaseItems.SLOT_DISABLED));

                createShaped(RecipeCategory.MISC, BaseItems.SLOT_ENABLED, 1)
                        .pattern("   ")
                        .pattern("RWR")
                        .pattern("SSS")
                        .input('R', Items.REDSTONE)
                        .input('W', Items.EMERALD)
                        .input('S', BaseItems.PLATE_STONE)
                        .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                        .criterion(hasItem(Items.EMERALD), conditionsFromItem(Items.EMERALD))
                        .criterion(hasItem(BaseItems.PLATE_STONE), conditionsFromItem(BaseItems.PLATE_STONE))
                        .offerTo(exporter, getRecipeName(BaseItems.SLOT_ENABLED));

                offerBlasting(List.of(BaseItems.ENDER_CHARM), RecipeCategory.MISC, BaseItems.VOID_PLATE_ACTIVATOR, 5.0f, 2400, "void_plate_activator");
                offerBlasting(List.of(BaseItems.COMBUSTION_CORE), RecipeCategory.MISC, BaseItems.UNSTABLE_GOO, 2.0f, 2400, "unstable_goo");
                offerBlasting(List.of(BaseItems.HOT_COAL), RecipeCategory.MISC, BaseItems.COMBUSTION_CORE, 2.0f, 1200, "combustion_core");

                offerSmelting(List.of(BaseItems.RAW_RUBBER), RecipeCategory.MISC, BaseItems.RUBBER, 0.1f, 100, "rubber_smelting");
                offerFoodCookingRecipe("smoking", RecipeSerializer.SMOKING, SmokingRecipe::new,
                                       400, BaseItems.RAW_RUBBER, BaseItems.RUBBER, 0.1F);
                offerFoodCookingRecipe("campfire_cooking", RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new,
                                       2400, BaseItems.RAW_RUBBER, BaseItems.RUBBER, 0.1F);

                createShaped(RecipeCategory.MISC, BaseItems.THERMAL_CORE, 1)
                        .pattern("PPP")
                        .pattern("HIH")
                        .pattern("PPP")
                        .input('I', BaseItems.COMBUSTION_CORE)
                        .input('H', BaseItems.HOT_COAL)
                        .input('P', BaseItems.REINFORCED_IRON)
                        .criterion(hasItem(BaseItems.HOT_COAL), conditionsFromItem(BaseItems.HOT_COAL))
                        .criterion(hasItem(Blocks.IRON_BLOCK), conditionsFromItem(Blocks.IRON_BLOCK))
                        .criterion(hasItem(BaseItems.REINFORCED_IRON), conditionsFromItem(BaseItems.REINFORCED_IRON))
                        .offerTo(exporter, getRecipeName(BaseItems.THERMAL_CORE));

                createShaped(RecipeCategory.MISC, BaseBlocks.ELEVATOR, 1)
                        .pattern(" E ")
                        .pattern("EWE")
                        .pattern(" E ")
                        .input('E', Items.ENDER_PEARL)
                        .input('W', ItemTags.WOOL)
                        .criterion(hasItem(Items.ENDER_PEARL), conditionsFromItem(Items.ENDER_PEARL))
                        .criterion("has_wool", conditionsFromTag(ItemTags.WOOL))
                        .offerTo(exporter, getRecipeName(BaseBlocks.ELEVATOR));

                createShapeless(RecipeCategory.TOOLS, BaseBlocks.ANGEL, 1)
                        .input(ItemTags.WOOL)
                        .input(Items.ENDER_PEARL)
                        .criterion(hasItem(Items.ENDER_PEARL), conditionsFromItem(Items.ENDER_PEARL))
                        .criterion("has_wool", conditionsFromTag(ItemTags.WOOL))
                        .offerTo(exporter, getRecipeName(BaseBlocks.ANGEL) + "_shapeless");

                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.CARROT,
                                                 RecipeCategory.FOOD, BaseBlocks.CARROT_BOX);
                offerReversibleCompactingRecipes(RecipeCategory.FOOD, Items.POTATO,
                                                 RecipeCategory.FOOD, BaseBlocks.POTATO_BOX);

                offerBlasting(List.of(BaseBlocks.ENDERITE), RecipeCategory.MISC, BaseItems.VOID_PLATE_BASE, 5.0f, 3600, "void_plate_base");

            }
        };
    }
}