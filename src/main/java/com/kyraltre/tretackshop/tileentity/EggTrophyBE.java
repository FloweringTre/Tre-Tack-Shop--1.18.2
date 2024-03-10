package com.kyraltre.tretackshop.tileentity;

import com.alaharranhonor.swem.forge.registry.SWEMBlockEntities;
import com.kyraltre.tretackshop.registry.TackShopBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;
import software.bernie.geckolib3.core.manager.SingletonAnimationFactory;

public class EggTrophyBE extends BlockEntity implements IAnimatable {

    private final AnimationFactory factory;
    private String texturePath;
    private ItemStack egg;

    public EggTrophyBE(BlockPos pPos, BlockState pBlockState) {
        this("", pPos, pBlockState);
    }

    public EggTrophyBE(String texturePath, BlockPos pPos, BlockState pBlockState) {
        super((BlockEntityType) TackShopBlockEntities.E_G_G_TROPHY_THIN.get(), pPos, pBlockState);
        this.factory = new SingletonAnimationFactory(this);
        this.egg = ItemStack.EMPTY;
        this.texturePath = texturePath;
    }

    public void setEgg(ItemStack egg) {
        this.egg = egg;
        this.setChanged();
    }

    public ItemStack getEgg() {
        return this.egg.copy();
    }

    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.put("Egg", this.egg.save(new CompoundTag()));
    }

    public void load(CompoundTag tag) {
        super.load(tag);
        this.setEgg(ItemStack.of(tag.getCompound("Egg")));
    }

    public @Nullable Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    public CompoundTag getUpdateTag() {
        CompoundTag tag = super.getUpdateTag();
        this.saveAdditional(tag);
        return tag;
    }

    public String getTexturePath() {
        return this.texturePath;
    }

    private <P extends IAnimatable> PlayState predicate(AnimationEvent<P> event) {
        return PlayState.STOP;
    }

    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller", 20.0F, this::predicate));
    }

    public AnimationFactory getFactory() {
        return this.factory;
    }
}
