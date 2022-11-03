package prr.app.terminal;

import prr.Network;
import prr.app.exceptions.*;
import prr.exceptions.*;
import prr.terminals.Terminal;
import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.CommandException;
//FIXME add more imports if needed

/**
 * Command for starting communication.
 */
class DoStartInteractiveCommunication extends TerminalCommand {

	DoStartInteractiveCommunication(Network context, Terminal terminal) {
		super(Label.START_INTERACTIVE_COMMUNICATION, context, terminal, receiver -> receiver.canStartCommunication());
	/*	addStringField("key", Prompt.terminalKey());
		boolean check = false;
		while (!check){
			addStringField("type", Prompt.commType());
			if (stringField("type").equals("VIDEO") || stringField("type").equals("VOICE")){
				check = true;
			}
		}*/
	}

	@Override
	protected final void execute() throws CommandException {
		//FIXME implement command
		String terminalKey = null;
		String type = null;
		try {
			terminalKey = Form.requestString(Prompt.terminalKey());

			do {
				type = Form.requestString(Prompt.commType());
			} while (!type.equals("VIDEO") && !type.equals("VOICE"));


			_network.StartInteractiveCommunication(_receiver.get_key(), terminalKey, type);

		} catch (DestinationIsSilentException e) {
			_display.popup(Message.destinationIsSilent(terminalKey));
		} catch (DestinationIsBusyException e) {
			_display.popup(Message.destinationIsBusy(terminalKey));
		} catch (DestinationisOffException e) {
			_display.popup(Message.destinationIsOff(terminalKey));
		} catch (TerminalKeyInvalidException e) {
			throw new InvalidTerminalKeyException(e.getInvalidKey());
		} catch (UnsupportedAtDestinationException e) {
			_display.popup(Message.unsupportedAtDestination(terminalKey, type));
		} catch (CantStartCommunicationException e) {
			throw new CantStartCommunicationException_app(e.getKey());
		} catch (UnsupportedAtOriginException e) {
			_display.popup(Message.unsupportedAtOrigin(_receiver.get_key(), type));
		} catch (UnknownTerminalException e) {
			throw new UnknownTerminalKeyException(e.getUnknownKey());
		}

	}



/*		try{
			_network.StartInteractiveCommunication(_receiver.get_key(), stringField("key"), stringField("type"));
		} catch (DestinationIsSilentException e) {
			throw new DestinationIsSilentException_app(e.getDestinationKey());
		} catch (DestinationIsBusyException e) {
			throw new DestinationIsBusyException_app(e.getDestinationKey());
		} catch (DestinationisOffException e) {
			throw new DestinationisOffException_app(e.getDestinationKey());
		} catch (TerminalKeyInvalidException e) {
			throw new InvalidTerminalKeyException(e.getInvalidKey());
		} catch (UnsupportedAtDestinationException e) {
			throw new UnsupportedAtDestinationException_app(e.getKey(), e.geType());
		} catch (CantStartCommunicationException e) {
			throw new CantStartCommunicationException_app(e.getKey());
		} catch (UnsupportedAtOriginException e) {
			throw new UnsupportedAtOriginException_app(e.getKey(), e.geType());
		} catch (UnknownTerminalException e) {
			throw new UnknownTerminalKeyException(e.getUnknownKey());
		}
	}*/
}
