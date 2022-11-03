package prr.app.exceptions;

import pt.tecnico.uilib.menus.CommandException;

public class CantStartCommunicationException_app extends CommandException {

    /**
     * Serial number for serialization.
     */
    private static final long serialVersionUID = 202208091753L;


    public CantStartCommunicationException_app(String key) {
        super("Não é possível iniciar a comunicação no terminal" + key);
    }
}