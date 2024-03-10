package com.kyraltre.tretackshop.block.custom;

import com.alaharranhonor.swem.forge.registry.SWEMBlockEntities;
import com.alaharranhonor.swem.forge.registry.SWEMItems;
import com.alaharranhonor.swem.forge.tileentity.CowboyHatBE;
import com.alaharranhonor.swem.forge.util.DualDyeableItem;
import com.kyraltre.tretackshop.registry.AwardShopItems;
import com.kyraltre.tretackshop.registry.TackShopBlockEntities;
import com.kyraltre.tretackshop.registry.TackShopItems;
import com.kyraltre.tretackshop.tileentity.EggTrophyBE;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Supplier;

public class EggTrophy extends Block implements DualDyeableItem {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public static final VoxelShape SHAPE = Block.box(6, 0, 6, 10, 12, 10);

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    public final String texturePath;

    public EggTrophy(String texturePath, Properties pProperties) {
        super(pProperties);
        this.texturePath = texturePath;
        }
//to drop the block entity with data instead of the no data block
    public List<ItemStack> getDrops(BlockState pState, LootContext.Builder builder) {
        List<ItemStack> drops = super.getDrops(pState, builder);
        Object var5 = builder.getParameter(LootContextParams.BLOCK_ENTITY);
        if (var5 instanceof EggTrophyBE egg) {
            drops.add(egg.getEgg());
        }

        return drops;
    }

    //connected entity
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new EggTrophyBE((String)this.texturePath, pos, state);
    }

    /* FACING CODE FROM FURNACE*/
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }


}