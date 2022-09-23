package net.theduxdev.soulguns.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent MONO_VIRUS  = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).
            statusEffect((new StatusEffectInstance(StatusEffects.REGENERATION, 199980, 5)), 1.0f).
            statusEffect((new StatusEffectInstance(StatusEffects.NIGHT_VISION, 199980, 5)), 1.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 199980, 5), 1.0f).
            statusEffect(new StatusEffectInstance(StatusEffects .HEALTH_BOOST, 199980, 7), 1.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 199980, 5), 1.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 199980, 15), 1.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 199980, 5), 1.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 199980, 5), 1.0f).
            statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 199980, 5), 1.0f).build();
}
