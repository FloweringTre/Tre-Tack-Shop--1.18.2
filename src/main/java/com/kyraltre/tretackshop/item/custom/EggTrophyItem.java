package com.kyraltre.tretackshop.item.custom;

import com.alaharranhonor.swem.forge.blocks.CowboyHatBlock;
import com.alaharranhonor.swem.forge.registry.SWEMBlockEntities;
import com.alaharranhonor.swem.forge.registry.SWEMBlocks;
import com.alaharranhonor.swem.forge.util.DualDyeableItem;
import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.block.TackShopBlocks;
import com.kyraltre.tretackshop.block.custom.EggTrophy;
import com.kyraltre.tretackshop.registry.TackShopBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import com.kyraltre.tretackshop.tileentity.EggTrophyBE;

public class EggTrophyItem extends Item implements DualDyeableItem {
    public EggTrophyItem(Properties pProperties) {
        super(pProperties);
    }

    public InteractionResult useOn(UseOnContext ctx) {
        Level level = ctx.getLevel();
        BlockPos pos = ctx.getClickedPos().relative(ctx.getClickedFace());
        level.setBlock(pos, ((EggTrophy) TackShopBlocks.E_G_G_TROPHY_THIN.get()).getStateForPlacement(new BlockPlaceContext(ctx)), 3);
        if (!ctx.getPlayer().getAbilities().instabuild) {
            ctx.getItemInHand().shrink(1);
        }
// this is to connect the item to the block
        return InteractionResult.sidedSuccess(level.isClientSide());
    }

}
