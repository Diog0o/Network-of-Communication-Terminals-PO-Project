package prr;
import prr.exceptions.*;
import prr.terminals.Terminal;

import java.io.IOException;


import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//FIXME add more import if needed (cannot import from pt.tecnico or prr.app)

/**
 * Manage access to network and implement load/save operations.
 */
public class NetworkManager {

	/** The network itself. */
	private Network _network = new Network();
        //FIXME  addmore fields if needed
	private String _filename ="";

        public Network getNetwork() {
		return _network;
	}
        
        public void registerClient(String key, String name, int taxid) throws DuplicateClientException {
        	_network.registerClient(key, name, taxid);
        }
        
        public String showAllClients() {
        	return _network.ShowAllClients();
        }
        
        public String showClient (String clientKey) throws UnknownClientException {
        	return _network.showClient(clientKey);
        }
		public void activateNotifications(String clientKey) throws UnknownClientException, ClientNotificationsAlreadyEnabledException {
				_network.activateNotifications(clientKey);
		}
		public void disableNotifications(String clientKey) throws UnknownClientException, ClientNotificationsAlreadyDisabledException {
				_network.disableNotifications(clientKey);
		}

		public long clientpayments (String clientKey) throws UnknownClientException {
				return _network.clientpayments(clientKey);
		}

		public long clientdebts (String clientKey) throws UnknownClientException {
				return _network.clientdebts(clientKey);
		}


        public void registerTerminal(String key, String type, String clientKey, String state) throws DuplicateTerminalException, TerminalKeyInvalidException, UnknownClientException {
        	_network.registerTerminal(key, type, clientKey, state);
        }
        
        public String showAllTerminals() {
        	return _network.showAllTerminals();
        }
		public Terminal getTerminal(String terminalKey) throws TerminalKeyInvalidException, UnknownTerminalException {
				return _network.getTerminal((terminalKey));
		}

		public String ShowCommunicationsMade(String clientKey) throws UnknownClientException {
				return _network.ShowCommunicationsMade(clientKey);
		}

		public String ShowCommunicationsReceived(String clientKey) throws UnknownClientException {
				return _network.ShowCommunicationsReceived(clientKey);
		}
		public String ShowClientsWithoutDebts() {
				return _network.ShowClientsWithoutDebts();
		}
		public String ShowClientsWithDebts() {
				return _network.ShowClientsWithDebts();
		}

		public String ShowTerminalsWithPositiveBalance() {
				return _network.ShowTerminalsWithPositiveBalance();
		}
		public void TurnOnTerminal(String terminalKey) throws TerminalKeyInvalidException, UnknownTerminalException, AlreadyOnException {
				_network.TurnOnTerminal(terminalKey);
		}
		public void TurnOffTerminal(String terminalKey) throws TerminalKeyInvalidException, UnknownTerminalException, AlreadyOffException {
				_network.TurnOffTerminal(terminalKey);
		}
		public void TurnSilentTerminal(String terminalKey) throws TerminalKeyInvalidException, UnknownTerminalException, AlreadySilentException {
				_network.TurnSilentTerminal(terminalKey);
		}
		public void AddFriend(String terminalKey, String terminalKeytoadd) throws TerminalKeyInvalidException, UnknownTerminalException {
				_network.AddFriend(terminalKey,terminalKeytoadd);
		}

		public void RemoveFriend(String terminalKey, String terminalKeytoremove) throws TerminalKeyInvalidException, UnknownTerminalException {
				_network.RemoveFriend(terminalKey,terminalKeytoremove);
		}
		public void MakePayment(String terminalKey, int id) throws UnknownTerminalException, TerminalKeyInvalidException, UnknownCommunicationException, InvalidCommunicationException {
				_network.MakePayment(terminalKey,id);
		}
		public long TerminalPayments (String terminalKey) throws TerminalKeyInvalidException, UnknownTerminalException {
				return _network.TerminalPayments(terminalKey);
		}
		public long TerminalDebts (String terminalKey) throws TerminalKeyInvalidException, UnknownTerminalException {
				return _network.TerminalDebts(terminalKey);
		}
		public void SendText(String terminalKeysender, String terminalKeyreceiver, String text) throws TerminalKeyInvalidException, UnknownTerminalException, CantStartCommunicationException, DestinationisOffException {
				_network.SendText(terminalKeysender,terminalKeyreceiver,text);
		}
		public void StartInteractiveCommunication(String terminalKeysender, String terminalKeyreceiver, String videoorvoice) throws TerminalKeyInvalidException, UnknownTerminalException, CantStartCommunicationException, UnsupportedAtOriginException, UnsupportedAtDestinationException, DestinationisOffException, DestinationIsBusyException, DestinationIsSilentException, CantStartCommunicationException {
				_network.StartInteractiveCommunication(terminalKeysender,terminalKeyreceiver,videoorvoice);
		}
		public void EndInteractiveCommunication(String terminalKeysender, long tempo) throws TerminalKeyInvalidException, UnknownTerminalException, CantStartCommunicationException {
				_network.EndInteractiveCommunication(terminalKeysender,tempo);
		}
		public String ShowOnGoingCommunication(String terminalkey) throws TerminalKeyInvalidException, UnknownTerminalException, NoOnGoingCommunicationException {
				return _network.ShowOnGoingCommunication(terminalkey);
		}
		public long GlobalPayments (){
				return _network.GlobalPayments();
		}
		public long GlobalDebts (){
				return _network.GlobalDebts();
		}
        
        public String showTerminalsWithoutActivity() {
        	return _network.showTerminalsWithoutActivity();
        }


	/**
	 * @param filename name of the file containing the serialized application's state
         *        to load.
	 * @throws UnavailableFileException if the specified file does not exist or there is
         *         an error while processing this file.
	 */
	public void load(String filename) throws UnavailableFileException, IOException, ClassNotFoundException, FileNotFoundException {
		//FIXME implement serialization method
		try {
			ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename)));
			_network = (Network) in.readObject();
			in.close();
			_filename = filename;
		}catch(IOException | ClassNotFoundException e){
			throw new UnavailableFileException(filename);
		}
	}
	public String getFileName() {
		return _filename;
	}

	/**
         * Saves the serialized application's state into the file associated to the current network.
         *
	 * @throws FileNotFoundException if for some reason the file cannot be created or opened. 
	 * @throws MissingFileAssociationException if the current network does not have a file.
	 * @throws IOException if there is some error while serializing the state of the network to disk.
	 */
	public void save() throws FileNotFoundException, MissingFileAssociationException, IOException {
		//FIXME implement serialization method
	    if (!_filename.equals("")) {
	        ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(_filename)));
	        out.writeObject(_network);
	        out.close();
	      }
	      else {
	        throw new MissingFileAssociationException();
	      }
	}

	/**
         * Saves the serialized application's state into the specified file. The current network is
         * associated to this file.
         *
	 * @param filename the name of the file.
	 * @throws FileNotFoundException if for some reason the file cannot be created or opened.
	 * @throws MissingFileAssociationException if the current network does not have a file.
	 * @throws IOException if there is some error while serializing the state of the network to disk.
	 */
	public void saveAs(String filename) throws FileNotFoundException, MissingFileAssociationException, IOException {
		//FIXME implement serialization method
		  _filename = filename;
		  save();
		}

	/**
	 * Read text input file and create domain entities..
	 * 
	 * @param filename name of the text input file
	 * @throws ImportFileException
	 * @throws UnknownTerminalException 
	 */
	public void importFile(String filename) throws ImportFileException, UnknownTerminalException {
		try {
			_network.importFile(filename);
		} catch (IOException | UnrecognizedEntryException | DuplicateClientException | DuplicateTerminalException /* FIXME maybe other exceptions */ e) {
			throw new ImportFileException(filename, e);
    }
	}

}
