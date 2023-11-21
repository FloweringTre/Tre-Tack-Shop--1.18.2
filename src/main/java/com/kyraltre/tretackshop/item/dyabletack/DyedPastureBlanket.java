package com.kyraltre.tretackshop.item.dyabletack;

import com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem;
import net.minecraft.world.item.DyeableLeatherItem;

public class DyedPastureBlanket extends PastureBlanketItem implements DyeableLeatherItem {

    public DyedPastureBlanket(HorseArmorTier tier, int armorValue, String texture, Properties builder) {
        super(tier, armorValue, texture, builder);
    }
}
