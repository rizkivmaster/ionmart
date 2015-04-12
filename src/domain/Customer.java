/*
    the person who buys our products
    TODO separate balance from here?
 */
public class Customer extends Account{
    private final String _id;
    private final String _phone;
    private final Long _balance;
    private final String _address;
    private final SexType _gender;

    public Customer(String _phone, Long _balance, String _address, SexType _gender) {
        this._phone = _phone;
        this._balance = _balance;
        this._address = _address;
        this._gender = _gender;
    }

    public String get_phone() {
        return _phone;
    }

    public Long get_balance() {
        return _balance;
    }

    public String get_address() {
        return _address;
    }

    public SexType get_gender() {
        return _gender;
    }
}