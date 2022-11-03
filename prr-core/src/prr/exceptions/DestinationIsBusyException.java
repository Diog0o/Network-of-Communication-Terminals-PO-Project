package prr.exceptions;

public class DestinationIsBusyException extends Throwable {

    /**
     *
     */
    private static final long serialVersionUID = 202208091753L;

    private String _key;
    public DestinationIsBusyException(String key) {
        _key= key;
    }

    public String getDestinationKey() {
        return _key;
    }
}
