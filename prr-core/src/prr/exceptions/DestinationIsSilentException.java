package prr.exceptions;

public class DestinationIsSilentException extends Throwable {

    /**
     *
     */
    private static final long serialVersionUID = 202208091753L;

    private String _key;
    public DestinationIsSilentException(String key) {
        _key= key;
    }

    public String getDestinationKey() {
        return _key;
    }
}
