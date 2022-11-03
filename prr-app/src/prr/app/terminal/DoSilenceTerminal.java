package prr.app.terminal;

import prr.Network;
import prr.app.exceptions.InvalidTerminalKeyException;
import prr.app.exceptions.UnknownClientKeyException;
import prr.exceptions.AlreadySilentException;
import prr.exceptions.TerminalKeyInvalidException;
import prr.exceptions.UnknownTerminalException;
import prr.terminals.Terminal;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Silence the terminal.
 */
class DoSilenceTerminal extends TerminalCommand {

	DoSilenceTerminal(Network context, Terminal terminal) {
		super(Label.MUTE_TERMINAL, context, terminal);
	}

	@Override
	protected final void execute() throws CommandException {
                //FIXME implement command
		try{
				_network.TurnSilentTerminal(_receiver.get_key());
		} catch (TerminalKeyInvalidException e) {
			throw new InvalidTerminalKeyException(e.getInvalidKey());
		} catch (AlreadySilentException e) {
			_display.popup(Message.alreadySilent());
		} catch (UnknownTerminalException e) {
			throw new UnknownClientKeyException(e.getUnknownKey());
		}
	}
}
