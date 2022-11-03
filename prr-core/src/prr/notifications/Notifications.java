package prr.notifications;

import java.io.Serializable;
import prr.terminals.Terminal;

public abstract class Notifications implements Serializable {

    /**
     * 
     */
	private static final long serialVersionUID = 202208091753L;
	
    private Terminal _departureterminal;

    private Terminal _arrivalterminal;

    public Terminal get_arrivalterminal() {
        return _arrivalterminal;
    }

    public Notifications(Terminal terminaldeparture, Terminal terminalarrive) {
        _departureterminal=terminaldeparture;
        _arrivalterminal = terminalarrive;
    }
    public Terminal get_departureterminal() {
        return _departureterminal;
    }
    public abstract String showNotifications ();

}