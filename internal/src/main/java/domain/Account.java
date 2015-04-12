package domain;
/**
*   TODO change password with something moroe secure, like a hash key?
 */
public class Account{
    private final String _username;
    private final String _password;
    private final String _firstName;
    private final String _lastName;
    private final String _email;
    private final Boolean _isActive;

    public Account(String _username, String _password, String _firstName, String _lastName, String _email, Boolean _isActive) {
        this._username = _username;
        this._password = _password;
        this._firstName = _firstName;
        this._lastName = _lastName;
        this._email = _email;
        this._isActive = _isActive;
    }

    public String get_username() {
        return _username;
    }

    public String get_password() {
        return _password;
    }

    public String get_firstName() {
        return _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public String get_email() {
        return _email;
    }

    public Boolean is_isActive() {
        return _isActive;
    }
}
