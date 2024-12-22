package jiraiyah.ultraio_command;

import jiraiyah.reference.JiReference;

public class ReferenceCommand extends JiReference
{
    public final String DCLR_ERROR_ID_NAME = "dclr.error";
    public final String DCLR_START_ID_NAME = "dclr.start";
    public final String DCLR_END_ID_NAME = "dclr.end";

    public ReferenceCommand(String mod_ID)
    {
        super(mod_ID);
    }
}