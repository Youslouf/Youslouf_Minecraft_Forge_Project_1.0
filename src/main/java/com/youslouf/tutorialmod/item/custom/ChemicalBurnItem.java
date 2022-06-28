package com.youslouf.tutorialmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class ChemicalBurnItem extends SwordItem {

     public ChemicalBurnItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);


    }


    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
         pTarget.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 200), pAttacker);
        pTarget.addEffect(new MobEffectInstance(MobEffects.POISON, 200), pAttacker);
        pTarget.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 200), pAttacker);
        pTarget.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200), pAttacker);
         return super.hurtEnemy(pStack, pTarget, pAttacker);

    }
}

