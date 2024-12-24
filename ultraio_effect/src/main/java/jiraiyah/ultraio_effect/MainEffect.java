package jiraiyah.ultraio_effect;

import jiraiyah.logger.Logger;
import jiraiyah.register.Registers;
import jiraiyah.ultraio_effect.effect.FlightEffect;
import net.fabricmc.api.ModInitializer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.entry.RegistryEntry;

import static jiraiyah.register.Registers.StatusEffect.register;


public class MainEffect implements ModInitializer
{
    public static final String ModID = "ultraio_effect";
    public static final Logger LOGGER = new Logger(ModID);

    public static RegistryEntry<StatusEffect> FLIGHT_EFFECT;

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();

        Registers.init(ModID);

        FLIGHT_EFFECT = register("flight", StatusEffectCategory.BENEFICIAL, 0xFFFFFF, FlightEffect::new);
    }
}