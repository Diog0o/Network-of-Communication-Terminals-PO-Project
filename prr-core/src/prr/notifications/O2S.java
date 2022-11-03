package prr.notifications;

import prr.notifications.Notifications;
import prr.terminals.Terminal;

public class O2S extends Notifications {
	
	private static final long serialVersionUID = 202208091753L;

	public O2S(Terminal terminaldeparture, Terminal terminalarrive) {
		super(terminaldeparture, terminalarrive);
	}
	public String showNotifications() {
		return "O2S" + "|" + get_arrivalterminal().get_key();
	}
}
