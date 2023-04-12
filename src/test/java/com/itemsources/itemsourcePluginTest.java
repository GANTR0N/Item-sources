package com.itemsources;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class itemsourcePluginTest {
    public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(ItemSourcesPlugin.class);
		RuneLite.main(args);
	}
}
