package jiraiyah.ultraio_decoration.datagen;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_base.registry.BaseBlocks;
import jiraiyah.ultraio_base.registry.BaseItems;
import jiraiyah.ultraio_decoration.MainDecoration;
import jiraiyah.ultraio_decoration.registry.DecorationBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class DecorationRecipeProvider extends FabricRecipeProvider
{

    public DecorationRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public String getName()
    {
        return MainDecoration.ModID;
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter)
    {
        return new RecipeGenerator(registries, exporter)
        {
            @Override
            public void generate()
            {
                MainDecoration.LOGGER.logG("Generating Recipe Data");

                //TODO: Talk about wrong recipe ingredients in Stone Cutting Recipes
                //region STAIRS
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.ENDERITE_STAIRS, BaseBlocks.ENDERITE, 9);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.ENDERITE_STAIRS, BaseBlocks.ENDERITE, 9);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.RUBY_STAIRS, BaseBlocks.RUBY, 9);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.SAPPHIRE_STAIRS, BaseBlocks.SAPPHIRE, 9);
                //endregion

                //region SLABS
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.CITRINE_SLAB, BaseBlocks.CITRINE, 18);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.ENDERITE_SLAB, BaseBlocks.ENDERITE, 18);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.RUBY_SLAB, BaseBlocks.RUBY, 18);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.SAPPHIRE_SLAB, BaseBlocks.SAPPHIRE, 18);
                //endregion

                //region PRESSURE PLATE
                createPressurePlateRecipe(RecipeCategory.REDSTONE, DecorationBlocks.CITRINE_PRESSURE_PLATE, Ingredient.ofItems(BaseItems.GEM_CITRINE))
                        .criterion(hasItem(BaseItems.GEM_CITRINE), conditionsFromItem(BaseItems.GEM_CITRINE))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.CITRINE_PRESSURE_PLATE));
                createPressurePlateRecipe(RecipeCategory.REDSTONE, DecorationBlocks.ENDERITE_PRESSURE_PLATE, Ingredient.ofItems(BaseItems.INGOT_ENDERITE))
                        .criterion(hasItem(BaseItems.INGOT_ENDERITE), conditionsFromItem(BaseItems.INGOT_ENDERITE))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.ENDERITE_PRESSURE_PLATE));
                createPressurePlateRecipe(RecipeCategory.REDSTONE, DecorationBlocks.RUBY_PRESSURE_PLATE, Ingredient.ofItems(BaseItems.GEM_RUBY))
                        .criterion(hasItem(BaseItems.GEM_RUBY), conditionsFromItem(BaseItems.GEM_RUBY))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.RUBY_PRESSURE_PLATE));
                createPressurePlateRecipe(RecipeCategory.REDSTONE, DecorationBlocks.SAPPHIRE_PRESSURE_PLATE, Ingredient.ofItems(BaseItems.GEM_SAPPHIRE))
                        .criterion(hasItem(BaseItems.GEM_SAPPHIRE), conditionsFromItem(BaseItems.GEM_SAPPHIRE))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.SAPPHIRE_PRESSURE_PLATE));
                //endregion

                //region FENCE
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.CITRINE_FENCE, BaseBlocks.CITRINE, 9);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.ENDERITE_FENCE, BaseBlocks.ENDERITE, 9);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.RUBY_FENCE, BaseBlocks.RUBY, 9);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.SAPPHIRE_FENCE, BaseBlocks.SAPPHIRE, 9);
                //endregion

                //region FENCE GATE
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.CITRINE_FENCE_GATE, BaseBlocks.CITRINE, 9);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.ENDERITE_FENCE_GATE, BaseBlocks.ENDERITE, 9);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.RUBY_FENCE_GATE, BaseBlocks.RUBY, 9);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.SAPPHIRE_FENCE_GATE, BaseBlocks.SAPPHIRE, 9);
                //endregion

                //region DOOR
                createDoorRecipe(DecorationBlocks.CITRINE_DOOR, Ingredient.ofItems(BaseItems.GEM_CITRINE))
                        .criterion(hasItem(BaseItems.GEM_CITRINE), conditionsFromItem(BaseItems.GEM_CITRINE))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.CITRINE_DOOR));
                createDoorRecipe(DecorationBlocks.ENDERITE_DOOR, Ingredient.ofItems(BaseItems.INGOT_ENDERITE))
                        .criterion(hasItem(BaseItems.INGOT_ENDERITE), conditionsFromItem(BaseItems.INGOT_ENDERITE))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.ENDERITE_DOOR));
                createDoorRecipe(DecorationBlocks.RUBY_DOOR, Ingredient.ofItems(BaseItems.GEM_RUBY))
                        .criterion(hasItem(BaseItems.GEM_RUBY), conditionsFromItem(BaseItems.GEM_RUBY))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.RUBY_DOOR));
                createDoorRecipe(DecorationBlocks.SAPPHIRE_DOOR, Ingredient.ofItems(BaseItems.GEM_SAPPHIRE))
                        .criterion(hasItem(BaseItems.GEM_SAPPHIRE), conditionsFromItem(BaseItems.GEM_SAPPHIRE))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.SAPPHIRE_DOOR));
                //endregion

                //region TRAP DOOR
                createTrapdoorRecipe(DecorationBlocks.CITRINE_TRAP_DOOR, Ingredient.ofItems(BaseItems.GEM_CITRINE))
                        .criterion(hasItem(BaseItems.GEM_CITRINE), conditionsFromItem(BaseItems.GEM_CITRINE))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.CITRINE_TRAP_DOOR));
                createTrapdoorRecipe(DecorationBlocks.ENDERITE_TRAP_DOOR, Ingredient.ofItems(BaseItems.INGOT_ENDERITE))
                        .criterion(hasItem(BaseItems.INGOT_ENDERITE), conditionsFromItem(BaseItems.INGOT_ENDERITE))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.ENDERITE_TRAP_DOOR));
                createTrapdoorRecipe(DecorationBlocks.RUBY_TRAP_DOOR, Ingredient.ofItems(BaseItems.GEM_RUBY))
                        .criterion(hasItem(BaseItems.GEM_RUBY), conditionsFromItem(BaseItems.GEM_RUBY))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.RUBY_TRAP_DOOR));
                createTrapdoorRecipe(DecorationBlocks.SAPPHIRE_TRAP_DOOR, Ingredient.ofItems(BaseItems.GEM_SAPPHIRE))
                        .criterion(hasItem(BaseItems.GEM_SAPPHIRE), conditionsFromItem(BaseItems.GEM_SAPPHIRE))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.SAPPHIRE_TRAP_DOOR));
                //endregion

                //region WALL
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.CITRINE_WALL, BaseBlocks.CITRINE, 9);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.ENDERITE_WALL, BaseBlocks.ENDERITE, 9);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.RUBY_WALL, BaseBlocks.RUBY, 9);
                offerStonecuttingRecipe(RecipeCategory.DECORATIONS, DecorationBlocks.SAPPHIRE_WALL, BaseBlocks.SAPPHIRE, 9);
                //endregion

                //region BUTTON
                createShapeless(RecipeCategory.REDSTONE, DecorationBlocks.CITRINE_BUTTON, 1)
                        .input(BaseItems.GEM_CITRINE)
                        .criterion(hasItem(BaseItems.GEM_CITRINE), conditionsFromItem(BaseItems.GEM_CITRINE))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.CITRINE_BUTTON) + "_shapeless");
                createShapeless(RecipeCategory.REDSTONE, DecorationBlocks.ENDERITE_BUTTON, 1)
                        .input(BaseItems.INGOT_ENDERITE)
                        .criterion(hasItem(BaseItems.INGOT_ENDERITE), conditionsFromItem(BaseItems.INGOT_ENDERITE))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.ENDERITE_BUTTON) + "_shapeless");
                createShapeless(RecipeCategory.REDSTONE, DecorationBlocks.RUBY_BUTTON, 1)
                        .input(BaseItems.GEM_RUBY)
                        .criterion(hasItem(BaseItems.GEM_RUBY), conditionsFromItem(BaseItems.GEM_RUBY))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.RUBY_BUTTON) + "_shapeless");
                createShapeless(RecipeCategory.REDSTONE, DecorationBlocks.SAPPHIRE_BUTTON, 1)
                        .input(BaseItems.GEM_SAPPHIRE)
                        .criterion(hasItem(BaseItems.GEM_SAPPHIRE), conditionsFromItem(BaseItems.GEM_SAPPHIRE))
                        .offerTo(exporter, getRecipeName(DecorationBlocks.SAPPHIRE_BUTTON) + "_shapeless");
                //endregion
            }
        };
    }
}