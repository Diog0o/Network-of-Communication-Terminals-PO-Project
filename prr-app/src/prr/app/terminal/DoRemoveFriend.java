package prr.app.terminal;

import prr.Network;
import prr.app.exceptions.InvalidTerminalKeyException;
import prr.app.exceptions.UnknownClientKeyException;
import prr.app.exceptions.UnknownTerminalKeyException;
import prr.exceptions.TerminalKeyInvalidException;
import prr.exceptions.UnknownTerminalException;
import prr.terminals.Terminal;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Remove friend.
 */
class DoRemoveFriend extends TerminalCommand {

	DoRemoveFriend(Network context, Terminal terminal) {
		super(Label.REMOVE_FRIEND, context, terminal);
		//FIXME add command fields
		addStringField("key",Prompt.terminalKey());
	}

	@Override
	protected final void execute() throws CommandException {
                //FIXME implement command
		try {
			_network.RemoveFriend(_receiver.get_key(), stringField("key"));
		} catch (TerminalKeyInvalidException e) {
			throw new InvalidTerminalKeyException(e.getInvalidKey());
		} catch (UnknownTerminalException e) {
			throw new UnknownTerminalKeyException(e.getUnknownKey());
		}
	}
}
