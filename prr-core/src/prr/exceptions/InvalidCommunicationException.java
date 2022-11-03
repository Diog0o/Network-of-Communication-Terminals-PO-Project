package prr.exceptions;

public class InvalidCommunicationException extends Throwable {

    /**
     *
     */
    private static final long serialVersionUID = 202208091753L;

    private int _key;

    public InvalidCommunicationException(int key) {
        _key = key;
    }

    public int getInvalidKey() {
        return _key;
    }


}