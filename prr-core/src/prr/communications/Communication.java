package prr.communications;

import java.io.Serializable;
import prr.terminals.Terminal;

public abstract class Communication implements Serializable, Comparable<Communication>  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 202208091753L;
	
	private int _id;
	private long _cost;
	private Terminal _terminalSender;
	private Terminal _terminalReceiver;

	private boolean _communicationstate = false; //se esta ou nao a acontecer

	public Communication (int id, long cost, Terminal tsender, Terminal treceiver) {
		_id=id;
		_cost=cost;
		_terminalSender = tsender;
		_terminalReceiver = treceiver;
		
	}

	public boolean get_communicationstate() {
		return _communicationstate;
	}

	public void set_communicationstate(boolean communicationstate) {

		_communicationstate = communicationstate;
	}

	public long get_cost() {
		return _cost;
	}

	public void set_cost(long _cost) {
		this._cost = _cost;
	}

	public Terminal get_terminalSender() {
		return _terminalSender;
	}

	public void set_terminalSender(Terminal _terminalSender) {
		this._terminalSender = _terminalSender;
	}

	public Terminal get_terminalReceiver() {
		return _terminalReceiver;
	}

	public void set_terminalReceiver(Terminal _terminalReceiver) {
		this._terminalReceiver = _terminalReceiver;
	}

	public int get_id() {
		return _id;
	
	}
	public abstract String ShowTypeofCommunication();
	
	public abstract String toString();

	public abstract double get_minutes();

	public abstract int get_charnumber();

	public String ShowCommunicationStatus(){
		if (_communicationstate==true){
			return "ONGOING";
		}
		return "FINISHED";
	}

	public abstract void setminutes(double minutes);

	@Override
	public int compareTo (Communication other){
		return _id - other.get_id();
	}
}
