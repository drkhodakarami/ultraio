package jiraiyah.ultraio_effect.datagen;

import jiraiyah.ultraio_effect.MainEffect;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EffectEnLanguageProvider extends FabricLanguageProvider
{
    public EffectEnLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder builder)
    {
        builder.add("effect." + MainEffect.ModID + ".flight", "Flight");
    }
}