package net.jgsb.halloweenmod.client.entity;

import net.jgsb.halloweenmod.Reference;
import net.jgsb.halloweenmod.client.model.ModelFrankenstein;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Jacob on 10/29/2016.
 */
public class RenderFrankenstein extends RenderBiped {

    private static final ResourceLocation frankensteinTexture = new ResourceLocation(Reference.MOD_ID, "textures/entity/frankenstein.png");

    public RenderFrankenstein(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelFrankenstein(), 0.4F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return frankensteinTexture;
    }
}
