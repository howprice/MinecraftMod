package com.howprice.examplemod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
	public static Item exampleItem;
	public static Item ghostItem;
	public static Item octopusItem;
	
	// this should be called on both client and server
	public static void createItems()
	{
		System.out.println("ModItems.createItems");
		
		// ExampleItem
		exampleItem = new Item();
		exampleItem.setUnlocalizedName("ExampleItem");
		exampleItem.setRegistryName("ExampleItem");
		exampleItem.setCreativeTab(CreativeTabs.MISC);
		GameRegistry.register(exampleItem);
		
		// GhostItem
		ghostItem = new Item();
		ghostItem.setUnlocalizedName("GhostItem");
		ghostItem.setRegistryName("GhostItem");
		ghostItem.setCreativeTab(CreativeTabs.MISC);
		GameRegistry.register(ghostItem);
		
		// OctopusItem
		octopusItem = new Item();
		octopusItem.setUnlocalizedName("OctopusItem");
		octopusItem.setRegistryName("OctopusItem");
		octopusItem.setCreativeTab(CreativeTabs.MISC);
		GameRegistry.register(octopusItem);
	}
}
