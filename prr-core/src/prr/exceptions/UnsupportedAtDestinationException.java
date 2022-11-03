package prr.exceptions;

public class UnsupportedAtDestinationException extends Throwable {

    /**
     *
     */
    private static final long serialVersionUID = 202208091753L;


    private String _key;
    private String _type;

    public UnsupportedAtDestinationException(String key, String type) {
        _key = key;
        _type = type;
    }

    public String getKey() {
        return _key;
    }
    public String geType(){return _type;}

}
