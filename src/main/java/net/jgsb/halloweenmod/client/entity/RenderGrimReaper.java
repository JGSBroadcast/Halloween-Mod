package net.jgsb.halloweenmod.client.entity;

import net.jgsb.halloweenmod.Reference;
import net.jgsb.halloweenmod.client.model.ModelGhost;
import net.jgsb.halloweenmod.client.model.ModelGrimReaper;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGrimReaper extends RenderBiped {

    private static final ResourceLocation grimReaperTexture = new ResourceLocation(Reference.MOD_ID, "textures/entity/grimreaper.png");

    public RenderGrimReaper(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelGrimReaper(), 0.4F);
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return grimReaperTexture;
    }
}