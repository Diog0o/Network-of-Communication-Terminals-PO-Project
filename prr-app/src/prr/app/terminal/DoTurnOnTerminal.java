package prr.app.terminal;

import prr.Network;
import prr.app.exceptions.InvalidTerminalKeyException;
import prr.app.exceptions.UnknownTerminalKeyException;
import prr.exceptions.AlreadyOnException;
import prr.exceptions.TerminalKeyInvalidException;
import prr.exceptions.UnknownTerminalException;
import prr.terminals.Terminal;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Turn on the terminal.
 */
class DoTurnOnTerminal extends TerminalCommand {

	DoTurnOnTerminal(Network context, Terminal terminal) {
		super(Label.POWER_ON, context, terminal);
	}

	@Override
	protected final void execute() throws CommandException {
                //FIXME implement command
		try{
			_network.TurnOnTerminal(_receiver.get_key());

		} catch (AlreadyOnException e) {
			_display.popup(Message.alreadyOn());
		} catch (TerminalKeyInvalidException e) {
			throw new InvalidTerminalKeyException(e.getInvalidKey());
		} catch (UnknownTerminalException e) {
			throw new UnknownTerminalKeyException(e.getUnknownKey());
		}
	}
}
