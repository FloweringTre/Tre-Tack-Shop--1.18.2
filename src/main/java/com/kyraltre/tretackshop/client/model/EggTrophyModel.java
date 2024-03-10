package com.kyraltre.tretackshop.client.model;



import com.alaharranhonor.swem.forge.blocks.SWEMBlockStateProperties;
import com.kyraltre.tretackshop.tileentity.EggTrophyBE;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EggTrophyModel extends AnimatedGeoModel<EggTrophyBE> {
    public EggTrophyModel() {
    }
// THIS NEEDS TO BE FIXED BADLY
    public ResourceLocation getModelLocation(EggTrophyBE eggtrophyBE) {
        return eggtrophyBE.getBlockState().getValue(SWEMBlockStateProperties.D_SIDE) == SWEMBlockStateProperties.DoubleBlockSide.LEFT ? new ResourceLocation("swem", "geo/tile/tackbox_left.geo.json") : new ResourceLocation("swem", "geo/tile/tackbox_right.geo.json");
    }

    public ResourceLocation getTextureLocation(EggTrophyBE eggtrophyBE) {
        return new ResourceLocation("tretackshop", "textures/blocks/egg_trophy_thin.png");
    }

    public ResourceLocation getAnimationFileLocation(EggTrophyBE eggtrophyBE) {
        return new ResourceLocation("swem", "animations/tackbox.json");
    }
}
//connected testures and models