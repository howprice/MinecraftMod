package com.howprice.examplemod.client.render.block;

import com.howprice.examplemod.ExampleMod;
import com.howprice.examplemod.block.ModBlocks;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class BlockRenderRegister
{
	// this should only be called on the client (the server doesn't do any rendering)
    public static void registerBlockRenderer() 
    {
    	// HowardItemBlock
		String howardItemBlockName = ModBlocks.howardItemBlock.getUnlocalizedName().substring(5); // .substring(5) skips over "item." at the start
		String howardItemBlockResourceName = ExampleMod.MODID + ":" + howardItemBlockName;
		ModelResourceLocation howardBlockItemResourceLocation = new ModelResourceLocation(howardItemBlockResourceName, "inventory");
		ModelLoader.setCustomModelResourceLocation(ModBlocks.howardItemBlock, 0, howardBlockItemResourceLocation);
    }
}
