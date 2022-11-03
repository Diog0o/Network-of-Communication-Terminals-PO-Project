package prr.app.terminals;


import prr.Network;
import prr.app.exceptions.DuplicateTerminalKeyException;
import prr.app.exceptions.InvalidTerminalKeyException;
import prr.app.exceptions.UnknownClientKeyException;
import prr.app.exceptions.UnknownTerminalKeyException;
import prr.exceptions.DuplicateTerminalException;
import prr.exceptions.UnknownClientException;
import prr.exceptions.UnknownTerminalException;
import prr.exceptions.TerminalKeyInvalidException;
import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import prr.app.terminal.Menu;
//FIXME add mode import if needed

/**
 * Open a specific terminal's menu.
 */
class DoOpenMenuTerminalConsole extends Command<Network> {

	DoOpenMenuTerminalConsole(Network receiver) {
		super(Label.OPEN_MENU_TERMINAL, receiver);
		//FIXME add command fields
	}

	@Override
	protected final void execute() throws CommandException, UnknownTerminalKeyException, InvalidTerminalKeyException {
		//FIXME implement command
		// create an instance of prr.app.terminal.Menu with the
		// selected Terminal
		try {

			Form request = new Form();
			request.addStringField("terminalkey", Prompt.terminalKey());
			request.parse();
			// null means get a new UUID
			(new prr.app.terminal.Menu(_receiver, _receiver.getTerminal(request.stringField("terminalkey")))).open();

		} catch (TerminalKeyInvalidException e) {
			throw new InvalidTerminalKeyException(e.getInvalidKey());
		} catch (UnknownTerminalException e) {
			throw new UnknownTerminalKeyException(e.getUnknownKey());
		}
	}
}
