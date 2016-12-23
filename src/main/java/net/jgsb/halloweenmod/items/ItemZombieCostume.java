package net.jgsb.halloweenmod.items;

import net.jgsb.halloweenmod.Reference;
import net.jgsb.halloweenmod.creativetabs.ModCreativeTabs;
import net.jgsb.halloweenmod.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemZombieCostume extends ItemArmor {

	private String texturePath = Reference.MOD_ID + ":" + "textures/models/armor/";

	public ItemZombieCostume(ArmorMaterial armorMaterial, int renderIndex, EntityEquipmentSlot armorType) {
		super(armorMaterial, renderIndex, armorType);

		this.setMaxStackSize(1);
		this.setCreativeTab(ModCreativeTabs.tabCostumes);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot armorType, String layer){
		if(stack.getItem().equals(ModItems.zombietorso) || stack.getItem().equals(ModItems.zombieboots)){
			return texturePath + "zombie_layer_1.png";
		}

		if(stack.getItem().equals(ModItems.zombielegs)) {
			return texturePath + "zombie_layer_2.png";
		}

		else return null;
	}
}