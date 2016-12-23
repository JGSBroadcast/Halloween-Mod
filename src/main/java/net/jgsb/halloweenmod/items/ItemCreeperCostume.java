package net.jgsb.halloweenmod.items;

import net.jgsb.halloweenmod.Reference;
import net.jgsb.halloweenmod.creativetabs.ModCreativeTabs;
import net.jgsb.halloweenmod.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemCreeperCostume extends ItemArmor {

	private String texturePath = Reference.MOD_ID + ":" + "textures/models/armor/";

	public ItemCreeperCostume(ArmorMaterial armorMaterial, int renderIndex, EntityEquipmentSlot armorType) {
		super(armorMaterial, renderIndex, armorType);

		this.setMaxStackSize(1);
		this.setCreativeTab(ModCreativeTabs.tabCostumes);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot armorType, String layer) {
		if(stack.getItem().equals(ModItems.creepertorso) || stack.getItem().equals(ModItems.creeperboots)) {
			return texturePath + "creeper_layer_1.png";
		}

		if(stack.getItem().equals(ModItems.creeperlegs)) {
			return texturePath + "creeper_layer_2.png";
		}

		else return null;
	}
}