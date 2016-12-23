package net.jgsb.halloweenmod.client.entity;

import net.jgsb.halloweenmod.Reference;
import net.jgsb.halloweenmod.client.model.ModelGhost;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGhost extends RenderBiped {

    private static final ResourceLocation ghostTexture = new ResourceLocation(Reference.MOD_ID, "textures/entity/ghost.png");

    public RenderGhost(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelGhost(), 0.0F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return ghostTexture;
    }

}