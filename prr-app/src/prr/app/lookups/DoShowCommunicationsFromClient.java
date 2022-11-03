package prr.app.lookups;

import prr.Network;
import prr.app.exceptions.UnknownClientKeyException;
import prr.exceptions.UnknownClientException;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Show communications from a client.
 */
class DoShowCommunicationsFromClient extends Command<Network> {

	DoShowCommunicationsFromClient(Network receiver) {
		super(Label.SHOW_COMMUNICATIONS_FROM_CLIENT, receiver);
		//FIXME add command fields
		addStringField("key",Prompt.clientKey());
	}

	@Override
	protected final void execute() throws CommandException {
                //FIXME implement command
		try{
			_display.popup(_receiver.ShowCommunicationsMade(stringField("key")));
		} catch (UnknownClientException e) {
			throw new UnknownClientKeyException(e.getUnknownKey());
		}
	}
}
