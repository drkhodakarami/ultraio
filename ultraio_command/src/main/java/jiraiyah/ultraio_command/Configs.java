package jiraiyah.ultraio_command;

import com.mojang.datafixers.util.Pair;
import jiraiyah.config.Config;
import jiraiyah.ultraio_command.util.ConfigKeys;

public class Configs extends Config
{
    public int DCLR_RADIUS;

    public Configs(String modId)
    {
        super(modId);
    }

    @Override
    protected void createConfigs()
    {
        provider.addComment("===================================================================================================");
        provider.addComment("===============================            COMMANDS SETTINGS            ===========================");
        provider.addComment("===================================================================================================");
        provider.addComment("The radius for DCLR command, this will be the value for the command to expand on each side.");
        provider.addComment("The final dimension would be (radius * 2) + 1.");
        provider.addPair(new Pair<>(ConfigKeys.DCLR, 128), false, true);
    }

    @Override
    protected void assignConfigValues()
    {
        DCLR_RADIUS = config.getOrDefault(ConfigKeys.DCLR, 128);
    }
}