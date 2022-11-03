package prr.notifications;

import prr.terminals.Terminal;

public class DefaultState extends Notifications{
    private static final long serialVersionUID = 202208091753L;

    public DefaultState(Terminal terminaldeparture, Terminal terminalarrive) {
        super(terminaldeparture, terminalarrive);
    }
    public String showNotifications() {
        return "B2I" + "|" + get_arrivalterminal().get_key();
    }
}
