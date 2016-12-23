package net.jgsb.halloweenmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void register() {
		GameRegistry.addRecipe(new ItemStack(ModItems.candycorn, 3),
				" S ", "YMO", 'S', Items.SUGAR, 'Y', new ItemStack(Items.DYE, 1, 11), 'M', Items.MILK_BUCKET, 'O', new ItemStack(Items.DYE, 1, 14));

		GameRegistry.addRecipe(new ItemStack(ModItems.metalrod, 2),
				"  I", " B ", "I  ", 'I', Items.IRON_INGOT, 'B', Items.DYE);

		GameRegistry.addRecipe(new ItemStack(ModItems.scythe, 1),
				"II ", " R ", " R ", 'I', Items.IRON_INGOT, 'R', ModItems.metalrod);

		// Creeper Costume

		GameRegistry.addRecipe(new ItemStack(Items.SKULL, 1, 4),
				"GLG", "LHL", 'L', new ItemStack(Items.DYE, 1, 10), 'G', Items.GUNPOWDER, 'H', Items.LEATHER_HELMET);

		GameRegistry.addRecipe(new ItemStack(ModItems.creepertorso, 1),
				"L L", "GCG", "LGL", 'L', new ItemStack(Items.DYE, 1, 10), 'G', Items.GUNPOWDER, 'C', Items.LEATHER_CHESTPLATE);

		GameRegistry.addRecipe(new ItemStack(ModItems.creeperlegs, 1),
				"LGL", "GPG", "L L", 'L', new ItemStack(Items.DYE, 1, 10), 'G', Items.GUNPOWDER, 'P', Items.LEATHER_LEGGINGS);

		GameRegistry.addRecipe(new ItemStack(ModItems.creeperboots, 1),
				"L L", "GBG", 'L', new ItemStack(Items.DYE, 1, 10), 'G', Items.GUNPOWDER, 'B', Items.LEATHER_BOOTS);

		// Skeleton Costume

		GameRegistry.addRecipe(new ItemStack(Items.SKULL, 1, 0),
				"BBB", "BHB", 'L', new ItemStack(Items.DYE, 1, 10), 'B', Items.BONE, 'H', Items.LEATHER_HELMET);

		GameRegistry.addRecipe(new ItemStack(ModItems.skeletontorso, 1),
				"B B", "BCB", "BBB", 'B', Items.BONE, 'C', Items.LEATHER_CHESTPLATE);

		GameRegistry.addRecipe(new ItemStack(ModItems.skeletonlegs, 1),
				"BBB", "BLB", "B B", 'B', Items.BONE, 'L', Items.LEATHER_LEGGINGS);

		GameRegistry.addRecipe(new ItemStack(ModItems.skeletonboots, 1),
				"B B", "BLB", 'B', Items.BONE, 'L', Items.LEATHER_BOOTS);

		// Zombie Costume

		GameRegistry.addRecipe(new ItemStack(Items.SKULL, 1, 2),
				"FFF", "FHF", 'F', Items.ROTTEN_FLESH, 'H', Items.LEATHER_HELMET);

		GameRegistry.addRecipe(new ItemStack(ModItems.zombietorso, 1),
				"D D", "RCR", "DRD", 'D', new ItemStack(Items.DYE, 1, 6), 'R', Items.ROTTEN_FLESH, 'C', Items.LEATHER_CHESTPLATE);

		GameRegistry.addRecipe(new ItemStack(ModItems.zombielegs, 1),
				"DRD", "RLR", "D D", 'D', new ItemStack(Items.DYE, 1, 4), 'R', Items.ROTTEN_FLESH, 'L', Items.LEATHER_LEGGINGS);

		GameRegistry.addRecipe(new ItemStack(ModItems.zombieboots, 1),
				"D D", "RBR", 'D', new ItemStack(Items.DYE, 1, 8), 'R', Items.ROTTEN_FLESH, 'B', Items.LEATHER_BOOTS);
	}
}
