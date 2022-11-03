package prr.exceptions;

public class UnknownTerminalException extends Exception {
	
	private static final long serialVersionUID = 202208091753L;

    private String _key;

    public UnknownTerminalException(String key) {
        _key = key;
    }

    public String getUnknownKey() {
        return _key;
    }
    
}
