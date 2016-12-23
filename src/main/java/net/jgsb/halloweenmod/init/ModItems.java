package net.jgsb.halloweenmod.init;

import net.jgsb.halloweenmod.Reference;
import net.jgsb.halloweenmod.items.ItemCreeperCostume;
import net.jgsb.halloweenmod.items.ItemSkeletonCostume;
import net.jgsb.halloweenmod.items.ItemZombieCostume;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static Item candycorn;

	public static Item metalrod;
	public static Item scythe;

	// Costumes
	public static Item creepertorso;
	public static Item creeperlegs;
	public static Item creeperboots;

	public static Item skeletontorso;
	public static Item skeletonlegs;
	public static Item skeletonboots;

	public static Item zombietorso;
	public static Item zombielegs;
	public static Item zombieboots;

	public static ItemArmor.ArmorMaterial enumArmorMaterialCostume = new EnumHelper().addArmorMaterial("Costume", "costume", 5, new int[]{1, 3, 2, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

	public static void init() {
		candycorn = new ItemFood(2, 0.4F, false).setUnlocalizedName("candycorn");
		metalrod = new Item().setUnlocalizedName("metalrod").setCreativeTab(CreativeTabs.MATERIALS);
		scythe = new ItemSword(Item.ToolMaterial.IRON).setUnlocalizedName("scythe");
		creepertorso = new ItemCreeperCostume(enumArmorMaterialCostume, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("creeper_chestplate");
		creeperlegs = new ItemCreeperCostume(enumArmorMaterialCostume, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("creeper_leggings");
		creeperboots = new ItemCreeperCostume(enumArmorMaterialCostume, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("creeper_boots");
		skeletontorso = new ItemSkeletonCostume(enumArmorMaterialCostume, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("skeleton_chestplate");
		skeletonlegs = new ItemSkeletonCostume(enumArmorMaterialCostume, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("skeleton_leggings");
		skeletonboots = new ItemSkeletonCostume(enumArmorMaterialCostume, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("skeleton_boots");
		zombietorso = new ItemZombieCostume(enumArmorMaterialCostume, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("zombie_chestplate");
		zombielegs = new ItemZombieCostume(enumArmorMaterialCostume, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("zombie_leggings");
		zombieboots = new ItemZombieCostume(enumArmorMaterialCostume, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("zombie_boots");
	}

	public static void register() {
		GameRegistry.register(candycorn, new ResourceLocation(Reference.MOD_ID, candycorn.getUnlocalizedName().substring(5)));
		GameRegistry.register(metalrod, new ResourceLocation(Reference.MOD_ID, metalrod.getUnlocalizedName().substring(5)));
		GameRegistry.register(scythe, new ResourceLocation(Reference.MOD_ID, scythe.getUnlocalizedName().substring(5)));
		GameRegistry.register(creepertorso, new ResourceLocation(Reference.MOD_ID, creepertorso.getUnlocalizedName().substring(5)));
		GameRegistry.register(creeperlegs, new ResourceLocation(Reference.MOD_ID, creeperlegs.getUnlocalizedName().substring(5)));
		GameRegistry.register(creeperboots, new ResourceLocation(Reference.MOD_ID, creeperboots.getUnlocalizedName().substring(5)));
		GameRegistry.register(skeletontorso, new ResourceLocation(Reference.MOD_ID, skeletontorso.getUnlocalizedName().substring(5)));
		GameRegistry.register(skeletonlegs, new ResourceLocation(Reference.MOD_ID, skeletonlegs.getUnlocalizedName().substring(5)));
		GameRegistry.register(skeletonboots, new ResourceLocation(Reference.MOD_ID, skeletonboots.getUnlocalizedName().substring(5)));
		GameRegistry.register(zombietorso, new ResourceLocation(Reference.MOD_ID, zombietorso.getUnlocalizedName().substring(5)));
		GameRegistry.register(zombielegs, new ResourceLocation(Reference.MOD_ID, zombielegs.getUnlocalizedName().substring(5)));
		GameRegistry.register(zombieboots, new ResourceLocation(Reference.MOD_ID, zombieboots.getUnlocalizedName().substring(5)));
	}

	public static void registerRenders() {
		registerRender(candycorn);
		registerRender(metalrod);
		registerRender(scythe);
		registerRender(creepertorso);
		registerRender(creeperlegs);
		registerRender(creeperboots);
		registerRender(skeletontorso);
		registerRender(skeletonlegs);
		registerRender(skeletonboots);
		registerRender(zombietorso);
		registerRender(zombielegs);
		registerRender(zombieboots);
	}

	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
