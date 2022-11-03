package prr.communications;

import prr.terminals.Terminal;

public class Video extends Communication{
	
	private static final long serialVersionUID = 202208091753L;
	
	
private String _type = "VIDEO";
private double _videominutes;
	
	public Video (int id, long cost, Terminal tin, Terminal tout, double minutes) {
		super(id, cost,tin,tout); // super da classe
		_videominutes=minutes;
	}
	public String get_type() { //getter
		return _type;
}

	public double get_videominutes() {
		return _videominutes;
	}

	@Override
	public String ShowTypeofCommunication() {
		return _type;
	}

	@Override
	public String toString(){
		if (this.get_communicationstate() ==true) {
			return "VIDEO" + "|" + this.get_id() + "|" + this.get_terminalSender().get_key() + "|" + this.get_terminalReceiver().get_key() + "|" + "0" + "|" + "0" + "|" + this.ShowCommunicationStatus();
		}
		return "VIDEO" + "|" + this.get_id() + "|" + this.get_terminalSender().get_key() + "|" + this.get_terminalReceiver().get_key() + "|" + Math.round(_videominutes) + "|" + this.get_cost() + "|" + this.ShowCommunicationStatus();
	}
	@Override
	public double get_minutes(){ //nao vai ser usado
		return _videominutes;
	}

	@Override
	public int get_charnumber(){
		return 0;
	}

	@Override
	public void setminutes(double minutes){
		_videominutes	= minutes;
	}
}
