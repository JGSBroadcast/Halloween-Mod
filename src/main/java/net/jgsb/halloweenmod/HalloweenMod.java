package net.jgsb.halloweenmod;


import net.jgsb.halloweenmod.creativetabs.ModCreativeTabs;
import net.jgsb.halloweenmod.init.ModEntities;
import net.jgsb.halloweenmod.init.ModRecipes;
import net.jgsb.halloweenmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.jgsb.halloweenmod.init.ModItems;


@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)

public class HalloweenMod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@Mod.Instance("jgsbshalloweenmod")
	public static HalloweenMod instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {

		ModCreativeTabs.init();

		ModItems.init();
		ModItems.register();

		ModEntities.registerEntities();
		proxy.registerEntityRenders();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		proxy.registerRenders();
		ModRecipes.register();

		ModEntities.setEntityToSpawn();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
}
