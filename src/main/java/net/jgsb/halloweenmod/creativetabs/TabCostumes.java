package net.jgsb.halloweenmod.creativetabs;

import net.jgsb.halloweenmod.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Jacob on 10/29/2016.
 */
public class TabCostumes extends CreativeTabs {

    public TabCostumes(String label) {
        super(label);
    }

    @Override
    public Item getTabIconItem() {
        return ModItems.creepertorso;
    }

}
