package net.jgsb.halloweenmod.proxy;

import net.jgsb.halloweenmod.client.entity.RenderFrankenstein;
import net.jgsb.halloweenmod.client.entity.RenderGhost;
import net.jgsb.halloweenmod.client.entity.RenderGrimReaper;
import net.jgsb.halloweenmod.entities.EntityFrankenstein;
import net.jgsb.halloweenmod.entities.EntityGhost;
import net.jgsb.halloweenmod.entities.EntityGrimReaper;
import net.jgsb.halloweenmod.init.ModItems;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		ModItems.registerRenders();
	}

	@Override
	public void registerEntityRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityGhost.class, RenderGhost::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityGrimReaper.class, RenderGrimReaper::new);
		RenderingRegistry.registerEntityRenderingHandler(EntityFrankenstein.class, RenderFrankenstein::new);
	}

}
