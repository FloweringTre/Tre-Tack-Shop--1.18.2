package com.kyraltre.tretackshop.client.render;

import com.alaharranhonor.swem.forge.client.model.CowboyHatBlockModel;

import com.alaharranhonor.swem.forge.util.DualDyeableItem;
import com.kyraltre.tretackshop.block.custom.EggTrophy;
import com.kyraltre.tretackshop.client.model.EggTrophyModel;
import com.kyraltre.tretackshop.tileentity.EggTrophyBE;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.util.Color;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class EggTrophyBlockRender extends GeoBlockRenderer<EggTrophyBE> {
    public EggTrophyBlockRender(BlockEntityRendererProvider.Context rendererDispatcherIn) {
        super(rendererDispatcherIn, new EggTrophyModel());
    }
    private static final String[] EGG_LAYERS = new String[]{"egg_stripe_4", "egg_stripe_2", "egg_stripe_6"};

    // TRY TO GET IT TO RENDER THE COLORS
    public Color getBoneColor(GeoBone bone, EggTrophyBE egg) {
        Item var4 = egg.getEgg().getItem();
        if (var4 instanceof DualDyeableItem dyeable) {
            return bone.getName().equals(EGG_LAYERS) ? Color.ofOpaque(dyeable.getSecondary(egg.getEgg())) : Color.ofOpaque(dyeable.getPrimary(egg.getEgg()));
        } else {
            return Color.WHITE;
        }
    }

    public void render(GeoModel model, EggTrophyBE egg, float partialTick, RenderType type, PoseStack poseStack, @Nullable MultiBufferSource bufferSource, @Nullable VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        super.render(model, egg, partialTick, type, poseStack, bufferSource, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    public void renderRecursively(GeoBone bone, PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        Color color = this.getBoneColor(bone, (EggTrophyBE)this.animatable);
        if (color == null) {
            color = Color.ofOpaque(Color.ofRGBA(red, green, blue, alpha).getColor());
        }

        super.renderRecursively(bone, poseStack, buffer, packedLight, packedOverlay, (float)color.getRed() / 255.0F, (float)color.getGreen() / 255.0F, (float)color.getBlue() / 255.0F, (float)color.getAlpha() / 255.0F);
    }
}