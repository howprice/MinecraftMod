package com.howprice.examplemod.client.render.item;

import com.howprice.examplemod.ExampleMod;
import com.howprice.examplemod.item.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemRenderRegister
{
	// this should only be called on the client (the server doesn't do any rendering)
	public static void registerItemRenderers()
	{
		// n.b. ModelLoader.setCustomModelResourceLocation must be called in preInit
		
		// ExampleItem
		String exampleItemName = ModItems.exampleItem.getUnlocalizedName().substring(5); // .substring(5) skips over "item." at the start
		String exampleItemResourceName = ExampleMod.MODID + ":" + exampleItemName;
		ModelResourceLocation exampleItemModelResourceLocation = new ModelResourceLocation(exampleItemResourceName, "inventory");
		ModelLoader.setCustomModelResourceLocation(ModItems.exampleItem, 0, exampleItemModelResourceLocation);

		// GhostItem
		String ghostItemName = ModItems.ghostItem.getUnlocalizedName().substring(5); // .substring(5) skips over "item." at the start
		String ghostItemResourceName = ExampleMod.MODID + ":" + ghostItemName;
		ModelResourceLocation ghostItemModelResourceLocation = new ModelResourceLocation(ghostItemResourceName, "inventory");
		ModelLoader.setCustomModelResourceLocation(ModItems.ghostItem, 0, ghostItemModelResourceLocation);

		// OctopusItem
		String octopusItemName = ModItems.octopusItem.getUnlocalizedName().substring(5); // .substring(5) skips over "item." at the start
		String octopusItemResourceName = ExampleMod.MODID + ":" + octopusItemName;
		ModelResourceLocation octopusItemModelResourceLocation = new ModelResourceLocation(octopusItemResourceName, "inventory");
		ModelLoader.setCustomModelResourceLocation(ModItems.octopusItem, 0, octopusItemModelResourceLocation);
	}
}
