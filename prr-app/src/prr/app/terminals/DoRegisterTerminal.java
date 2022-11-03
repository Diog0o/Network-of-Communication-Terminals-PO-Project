package prr.app.terminals;


import prr.Network;
import prr.exceptions.UnknownClientException;
import pt.tecnico.uilib.forms.Form;
import prr.app.exceptions.DuplicateTerminalKeyException;
import prr.app.exceptions.InvalidTerminalKeyException;
import prr.app.exceptions.UnknownClientKeyException;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import prr.exceptions.DuplicateTerminalException;
import prr.exceptions.TerminalKeyInvalidException;
//FIXME add more imports if needed

/**
 * Register terminal.
 */
class DoRegisterTerminal extends Command<Network> {

	DoRegisterTerminal(Network receiver) {
		super(Label.REGISTER_TERMINAL, receiver);
		//FIXME add command fields

	}

	@Override
	protected final void execute() throws InvalidTerminalKeyException, DuplicateTerminalKeyException, UnknownClientKeyException {
                //FIXME implement command

	try {

		String terminalKey = Form.requestString(Prompt.terminalKey());

		String type;
		do {
			type = Form.requestString(Prompt.terminalType());
		} while (!type.equals("BASIC") && !type.equals("FANCY"));

		String clientKey = Form.requestString(Prompt.clientKey());


		// null means get a new UUID
		_receiver.registerTerminal(terminalKey, type, clientKey, "ON");
	}
	  catch (TerminalKeyInvalidException e) {
		throw new InvalidTerminalKeyException(e.getInvalidKey());
	  } 
	  catch (DuplicateTerminalException e) {
		// TODO Auto-generated catch block
		throw new DuplicateTerminalKeyException(e.getKey());
	  } catch (UnknownClientException e) {
		throw new UnknownClientKeyException(e.getUnknownKey());
	}
	}
}
  

