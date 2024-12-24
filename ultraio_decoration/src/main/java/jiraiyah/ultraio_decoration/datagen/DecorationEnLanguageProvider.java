package jiraiyah.ultraio_decoration.datagen;

import jiraiyah.ultraio_base.MainBase;
import jiraiyah.ultraio_decoration.MainDecoration;
import jiraiyah.ultraio_decoration.registry.DecorationBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class DecorationEnLanguageProvider extends FabricLanguageProvider
{
    public DecorationEnLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder builder)
    {
        MainDecoration.LOGGER.logG("Generating Language Data");

        builder.add(DecorationBlocks.CITRINE_STAIRS, "Citrine Stairs");
        builder.add(DecorationBlocks.ENDERITE_STAIRS, "Enderite Stairs");
        builder.add(DecorationBlocks.RUBY_STAIRS, "Ruby Stairs");
        builder.add(DecorationBlocks.SAPPHIRE_STAIRS, "Sapphire Stairs");

        builder.add(DecorationBlocks.CITRINE_SLAB, "Citrine Slab");
        builder.add(DecorationBlocks.ENDERITE_SLAB, "Enderite Slab");
        builder.add(DecorationBlocks.RUBY_SLAB, "Ruby Slab");
        builder.add(DecorationBlocks.SAPPHIRE_SLAB, "Sapphire Slab");

        builder.add(DecorationBlocks.CITRINE_BUTTON, "Citrine Button");
        builder.add(DecorationBlocks.ENDERITE_BUTTON, "Enderite Button");
        builder.add(DecorationBlocks.RUBY_BUTTON, "Ruby Button");
        builder.add(DecorationBlocks.SAPPHIRE_BUTTON, "Sapphire Button");

        builder.add(DecorationBlocks.CITRINE_PRESSURE_PLATE, "Citrine Pressure Plate");
        builder.add(DecorationBlocks.ENDERITE_PRESSURE_PLATE, "Enderite Pressure Plate");
        builder.add(DecorationBlocks.RUBY_PRESSURE_PLATE, "Ruby Pressure Plate");
        builder.add(DecorationBlocks.SAPPHIRE_PRESSURE_PLATE, "Sapphire Pressure Plate");

        builder.add(DecorationBlocks.CITRINE_FENCE, "Citrine Fence");
        builder.add(DecorationBlocks.ENDERITE_FENCE, "Enderite Fence");
        builder.add(DecorationBlocks.RUBY_FENCE, "Ruby Fence");
        builder.add(DecorationBlocks.SAPPHIRE_FENCE, "Sapphire Fence");

        builder.add(DecorationBlocks.CITRINE_FENCE_GATE, "Citrine Fence Gate");
        builder.add(DecorationBlocks.ENDERITE_FENCE_GATE, "Enderite Fence Gate");
        builder.add(DecorationBlocks.RUBY_FENCE_GATE, "Ruby Fence Gate");
        builder.add(DecorationBlocks.SAPPHIRE_FENCE_GATE, "Sapphire Fence Gate");

        builder.add(DecorationBlocks.CITRINE_WALL, "Citrine Wall");
        builder.add(DecorationBlocks.ENDERITE_WALL, "Enderite Wall");
        builder.add(DecorationBlocks.RUBY_WALL, "Ruby Wall");
        builder.add(DecorationBlocks.SAPPHIRE_WALL, "Sapphire Wall");

        builder.add(DecorationBlocks.CITRINE_DOOR, "Citrine Door");
        builder.add(DecorationBlocks.ENDERITE_DOOR, "Enderite Door");
        builder.add(DecorationBlocks.RUBY_DOOR, "Ruby Door");
        builder.add(DecorationBlocks.SAPPHIRE_DOOR, "Sapphire Door");

        builder.add(DecorationBlocks.CITRINE_TRAP_DOOR, "Citrine Trap Door");
        builder.add(DecorationBlocks.ENDERITE_TRAP_DOOR, "Enderite Trap Door");
        builder.add(DecorationBlocks.RUBY_TRAP_DOOR, "Ruby Trap Door");
        builder.add(DecorationBlocks.SAPPHIRE_TRAP_DOOR, "Sapphire Trap Door");
    }
}