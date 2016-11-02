package com.howprice.examplemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;


// http://bedrockminer.jimdo.com/modding-tutorials/basic-modding-1-8/first-block/

public class ModBlocks
{
	public static Block howardBlock;
	public static ItemBlock howardItemBlock;
	
	// this should be called on both client and server
	public static void createBlocks() 
	{
		System.out.println("ModItems.createBlocks");
		
		// HowardBlock
		howardBlock = new Block(Material.ROCK);
		howardBlock.setUnlocalizedName("HowardBlock");
		howardBlock.setRegistryName("HowardBlock");
		howardBlock.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		howardBlock.setHardness(1.5f); // stone:10.0f; obsidian:2000.0f
		howardBlock.setResistance(10.0f); // // stone:10.0f; obsidian:2000.0f
//		howardBlock.setHarvestLevel("pickaxe", "wood"); // tool: "pickaxe", "axe", "shovel"   level: 0=wood; 1=stone; 2=iron; 3=diamond tool
//		howardBlock.setLightLevel(1.0f);
		GameRegistry.register(howardBlock);
		
		// ExampleItemBlock
		howardItemBlock = new ItemBlock(howardBlock);
		howardItemBlock.setRegistryName(howardBlock.getRegistryName());
		GameRegistry.register(howardItemBlock);
    }
}
