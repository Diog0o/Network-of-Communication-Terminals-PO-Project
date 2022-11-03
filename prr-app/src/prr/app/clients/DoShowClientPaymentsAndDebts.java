package prr.app.clients;

import prr.Network;
import prr.app.exceptions.UnknownClientKeyException;
import prr.exceptions.UnknownClientException;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Show the payments and debts of a client.
 */
class DoShowClientPaymentsAndDebts extends Command<Network> {

	DoShowClientPaymentsAndDebts(Network receiver) {
		super(Label.SHOW_CLIENT_BALANCE, receiver);
		//FIXME add command fields
		addStringField("key", Prompt.key());
	}

	@Override
	protected final void execute() throws CommandException {
                //FIXME implement command
		try {
			_display.popup(Message.clientPaymentsAndDebts(stringField("key"), _receiver.clientpayments(stringField("key")), _receiver.clientdebts(stringField("key"))));
		} catch (UnknownClientException e) {
			throw new UnknownClientKeyException(e.getUnknownKey());
		}
	}
}
