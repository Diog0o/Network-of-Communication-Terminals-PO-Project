package prr.app.main;

import prr.NetworkManager;
import prr.exceptions.MissingFileAssociationException;
import pt.tecnico.uilib.forms.Form;
import pt.tecnico.uilib.menus.Command;
//FIXME add more imports if needed
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * Command to save a file.
 */
class DoSaveFile extends Command<NetworkManager> {

	DoSaveFile(NetworkManager receiver) {
		super(Label.SAVE_FILE, receiver);
	}

	@Override
	protected final void execute() {
		try {
			if (_receiver.getFileName().equals("")) {
				String filename = Form.requestString(Prompt.newSaveAs());
				_receiver.saveAs(filename);
			}
			else {
				_receiver.save();
			}
		}
		catch (MissingFileAssociationException e) {
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	}

