package prr.app.clients;

import prr.Network;
import prr.app.exceptions.UnknownClientKeyException;
import prr.exceptions.ClientNotificationsAlreadyEnabledException;
import prr.exceptions.UnknownClientException;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Enable client notifications.
 */
class DoEnableClientNotifications extends Command<Network> {

	DoEnableClientNotifications(Network receiver) {
		super(Label.ENABLE_CLIENT_NOTIFICATIONS, receiver);
		//FIXME add command fields
		addStringField("key", Prompt.key());
	}

	@Override
	protected final void execute() throws CommandException {
		//FIXME implement command
		try {
			_receiver.activateNotifications(stringField("key"));

		} catch (UnknownClientException e) {
			throw new UnknownClientKeyException(e.getUnknownKey());
		} catch (ClientNotificationsAlreadyEnabledException e) {
			_display.popup(Message.clientNotificationsAlreadyEnabled());
		}
	}
}
