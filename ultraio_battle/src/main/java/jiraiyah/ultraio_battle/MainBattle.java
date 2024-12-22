package jiraiyah.ultraio_battle;

import jiraiyah.logger.Logger;
import net.fabricmc.api.ModInitializer;

public class MainBattle implements ModInitializer
{
    public static final String ModID = "ultraio_battle";
    public static final Logger LOGGER = new Logger(ModID);
    public static final ReferenceBattle REFERENCE = new ReferenceBattle(ModID);

    @Override
    public void onInitialize()
    {
        LOGGER.logMain();
    }
}