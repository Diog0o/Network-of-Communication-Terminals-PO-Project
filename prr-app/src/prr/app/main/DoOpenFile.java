package prr.app.main;

import prr.NetworkManager;
import prr.app.exceptions.FileOpenFailedException;
import prr.exceptions.UnavailableFileException;
import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.Command;
import pt.tecnico.uilib.menus.CommandException;
import java.io.FileNotFoundException;
import java.io.IOException;
//Add more imports if needed

/**
 * Command to open a file.
 */
class DoOpenFile extends Command<NetworkManager> {

	DoOpenFile(NetworkManager receiver) {
		super(Label.OPEN_FILE, receiver);
		//FIXME add command fields
		addStringField("filename", Prompt.openFile());
	}

	@Override
	public final void execute() throws CommandException {

		try {
			//FIXME implement command
			_receiver.load(stringField("filename"));
		} catch (UnavailableFileException | FileNotFoundException e) {
			throw new FileOpenFailedException(e);
		} catch (IOException | ClassNotFoundException e) {
			throw new FileOpenFailedException(e);
		}
	}
}
