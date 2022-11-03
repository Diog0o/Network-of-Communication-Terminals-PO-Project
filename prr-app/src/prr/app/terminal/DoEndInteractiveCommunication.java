package prr.app.terminal;

import prr.Network;
import prr.app.exceptions.CantStartCommunicationException_app;
import prr.app.exceptions.InvalidTerminalKeyException;
import prr.app.exceptions.UnknownTerminalKeyException;
import prr.exceptions.*;
import prr.terminals.Terminal;
import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Command for ending communication.
 */
class DoEndInteractiveCommunication extends TerminalCommand {

	DoEndInteractiveCommunication(Network context, Terminal terminal) {
		super(Label.END_INTERACTIVE_COMMUNICATION, context, terminal, receiver -> receiver.canEndCurrentCommunication());
	}

	@Override
	protected final void execute() throws CommandException {
		//FIXME implement command
		try {
			Form request = new Form();
			long duration;
			duration = Long.parseLong(Form.requestString(Prompt.duration()));
			request.parse();
			// null means get a new UUID
			int id = _receiver.get_ongoingcommunication().get_id();
			_network.EndInteractiveCommunication(_receiver.get_key(), duration);
			_display.popup(Message.communicationCost(_receiver.get_owner().get_communicationsMade().get(id).get_cost()));

		} catch (TerminalKeyInvalidException e) {
			throw new InvalidTerminalKeyException(e.getInvalidKey());
		} catch (CantStartCommunicationException e) {
			throw new RuntimeException(e);
		} catch (UnknownTerminalException e) {
			throw new UnknownTerminalKeyException(e.getUnknownKey());
		}
	}
}
