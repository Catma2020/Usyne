package net.fabricmc.usyne;

import net.fabricmc.api.ModInitializer;

public class Usyne implements ModInitializer
{
	@Override
	public void onInitialize()
	{
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		System.out.println("Hello Fabric world!");
	}
}
