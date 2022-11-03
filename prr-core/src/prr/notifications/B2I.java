package prr.notifications;

import prr.notifications.Notifications;
import prr.terminals.Terminal;

public class B2I extends Notifications {
	
	private static final long serialVersionUID = 202208091753L;
	
	public B2I(Terminal terminaldeparture, Terminal terminalarrive) {
		super(terminaldeparture, terminalarrive);
	}
	public String showNotifications() {
		return "B2I" + "|" + get_arrivalterminal().get_key();
	}
}
