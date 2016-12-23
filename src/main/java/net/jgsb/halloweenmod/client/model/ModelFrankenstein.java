package net.jgsb.halloweenmod.client.model;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.entity.Entity;

/**
 * Created by Jacob on 10/29/2016.
 */
public class ModelFrankenstein extends ModelZombie {

    public ModelFrankenstein() {
        super();
    }

    public void render(Entity entityIn, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_,
                       float p_78088_6_, float scale) {
        this.setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, scale, entityIn);

        this.bipedBody.render(scale);
        this.bipedHead.render(scale);
        this.bipedRightArm.render(scale);
        this.bipedLeftArm.render(scale);
        this.bipedRightLeg.render(scale);
        this.bipedLeftLeg.render(scale);
        this.bipedHeadwear.render(scale);
    }
}
