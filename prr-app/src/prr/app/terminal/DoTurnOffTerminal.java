package prr.app.terminal;

import prr.Network;
import prr.app.exceptions.InvalidTerminalKeyException;
import prr.app.exceptions.UnknownTerminalKeyException;
import prr.exceptions.AlreadyOffException;
import prr.exceptions.TerminalKeyInvalidException;
import prr.exceptions.UnknownTerminalException;
import prr.terminals.Terminal;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Turn off the terminal.
 */
class DoTurnOffTerminal extends TerminalCommand {

	DoTurnOffTerminal(Network context, Terminal terminal) {
		super(Label.POWER_OFF, context, terminal);
	}

	@Override
	protected final void execute() throws CommandException {
                //FIXME implement command
		try{
			_network.TurnOffTerminal(_receiver.get_key());
		} catch (AlreadyOffException e) {
			_display.popup(Message.alreadyOff());
		} catch (TerminalKeyInvalidException e) {
			throw new InvalidTerminalKeyException(e.getInvalidKey());
		} catch (UnknownTerminalException e) {
			throw new UnknownTerminalKeyException(e.getUnknownKey());
		}
	}
}
