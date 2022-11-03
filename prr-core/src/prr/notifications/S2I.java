package prr.notifications;

import prr.notifications.Notifications;
import prr.terminals.Terminal;

public class S2I extends Notifications {
	
	private static final long serialVersionUID = 202208091753L;

	public S2I(Terminal terminaldeparture, Terminal terminalarrive) {
		super(terminaldeparture, terminalarrive);
	}
	public String showNotifications() {
		return "S2I" + "|" + get_arrivalterminal().get_key();
	}
}
