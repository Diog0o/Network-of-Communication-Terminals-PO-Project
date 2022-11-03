package prr.exceptions;

public class CantStartCommunicationException extends Throwable {

    /**
     *
     */
    private static final long serialVersionUID = 202208091753L;


    private String _key;

    public CantStartCommunicationException(String key) {
        _key = key;
    }

    public String  getKey() {
        return _key;
    }
}