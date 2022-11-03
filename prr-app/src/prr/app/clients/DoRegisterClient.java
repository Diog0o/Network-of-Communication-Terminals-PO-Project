package prr.app.clients;

import prr.Network;
import prr.app.exceptions.DuplicateClientKeyException;
import prr.exceptions.DuplicateClientException;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Register new client.
 */
class DoRegisterClient extends Command<Network> {

	DoRegisterClient(Network receiver) {
		super(Label.REGISTER_CLIENT, receiver);
                //FIXME add command fields
		addStringField("key", Prompt.key());
	    addStringField("name", Prompt.name());
	    addIntegerField("taxid", Prompt.taxId());
	}

	@Override
	protected final void execute() throws CommandException, DuplicateClientKeyException {
                //FIXME implement command
	    try {
	        _receiver.registerClient(stringField("key"), stringField("name"), integerField("taxid"));

	      } catch (DuplicateClientException e) {
	        throw new DuplicateClientKeyException(e.getKey());
	      }
	    }

	}


