package jiraiyah.ultraio;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer
{
	public static final String ModID = "ultraio";
	public static final Logger LOGGER = new Logger(ModID);

	@Override
	public void onInitialize()
	{
		LOGGER.logMain();
	}
}