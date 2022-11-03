package prr.app.lookups;

import prr.Network;
import prr.app.exceptions.UnknownClientKeyException;
import prr.exceptions.UnknownClientException;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Show communications to a client.
 */
class DoShowCommunicationsToClient extends Command<Network> {

	DoShowCommunicationsToClient(Network receiver) {
		super(Label.SHOW_COMMUNICATIONS_TO_CLIENT, receiver);
		//FIXME add command fields
		addStringField("key",Prompt.clientKey());
	}

	@Override
	protected final void execute() throws CommandException {
                //FIXME implement command
		try{
			_display.popup(_receiver.ShowCommunicationsReceived(stringField("partnerKey")));
		} catch (UnknownClientException e) {
			throw new UnknownClientKeyException(e.getUnknownKey());
		}
	}
}
