package com.kyraltre.tretackshop.item.customs;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class TrePastureBlanketItem extends PastureBlanketItem {


    public TrePastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier tier, int armorValue, String texture, Item.Properties builder) {
        super(tier, armorValue, new ResourceLocation("tretackshop",
                "textures/entity/horse/armor/pasture_blanket" + texture + ".png"), builder);
        // The new ResourceLocation attempt to reroute the new items to assets tied to my mod throws and error.
        /* Error listed below

        'PastureBlanketItem(com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem.HorseArmorTier, int, java.lang.String,
        net.minecraft.world.item.Item.Properties)' in 'com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem'
        cannot be applied to '(com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem.HorseArmorTier, int,
        net.minecraft.resources.ResourceLocation, net.minecraft.world.item.Item.Properties)'

         */
    }

}
