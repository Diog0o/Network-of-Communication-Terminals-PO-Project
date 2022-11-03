package prr.app.terminal;

import prr.Network;
import prr.app.exceptions.InvalidTerminalKeyException;
import prr.app.exceptions.UnknownCommunicationKeyException;
import prr.app.exceptions.UnknownTerminalKeyException;
import prr.exceptions.InvalidCommunicationException;
import prr.exceptions.TerminalKeyInvalidException;
import prr.exceptions.UnknownCommunicationException;
import prr.exceptions.UnknownTerminalException;
import prr.terminals.Terminal;
import pt.tecnico.uilib.menus.CommandException;
// Add more imports if needed

/**
 * Perform payment.
 */
class DoPerformPayment extends TerminalCommand {

	DoPerformPayment(Network context, Terminal terminal) {
		super(Label.PERFORM_PAYMENT, context, terminal);
		//FIXME add command fields
		addIntegerField("id",Prompt.commKey());

	}

	@Override
	protected final void execute() throws CommandException {
                //FIXME implement command
		try{
			_network.MakePayment(_receiver.get_key(), integerField("id"));
		} catch (UnknownCommunicationException e) {
			throw new UnknownCommunicationKeyException(e.getUnknownKey());
		} catch (InvalidCommunicationException e) {
			_display.popup(Message.invalidCommunication());
		} catch (TerminalKeyInvalidException e) {
			throw new InvalidTerminalKeyException(e.getInvalidKey());
		} catch (UnknownTerminalException e) {
			throw new UnknownTerminalKeyException(e.getUnknownKey());
		}
	}
}
