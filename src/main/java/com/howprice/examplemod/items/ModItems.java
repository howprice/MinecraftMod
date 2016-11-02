package com.howprice.examplemod.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
	public static Item exampleItem;
	
	// this should be called on both client and server
	public static void createItems()
	{
		System.out.println("ModItems.createItems");
		
		exampleItem = new Item();
		exampleItem.setUnlocalizedName("ExampleItem");
		exampleItem.setRegistryName("ExampleItem");
		exampleItem.setCreativeTab(CreativeTabs.MISC);
		GameRegistry.register(exampleItem);
	}
}
