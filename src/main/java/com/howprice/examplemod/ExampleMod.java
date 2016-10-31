package com.howprice.examplemod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

// 
@Mod(modid = ExampleMod.MODID)
public class ExampleMod
{
	public static final String MODID = "examplemod";

	// Populate this field with the instance of the mod created by FML
	@Instance(MODID)
	public ExampleMod instance;

	@SidedProxy(modId = MODID, clientSide = "com.howprice.examplemod.ClientProxy", serverSide = "com.howprice.examplemod.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("ExampleMod.preInit");
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		System.out.println("ExampleMod.init");
		proxy.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("ExampleMod.postInit");
		proxy.postInit(event);
	}
}
