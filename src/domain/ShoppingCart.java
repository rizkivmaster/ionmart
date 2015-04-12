package com.ionmart.domain;

/*
the shopping cart is the place to put the product that the customer has picked.
it can be many.
 */
public class ShoppingCart{
    private final String _id;
    private final List<LineItem> _lineItems;

    public ShoppingCart(String _id, List<LineItem> _lineItems) {
        this._id = _id;
        this._lineItems = _lineItems;
    }

    public String get_id() {
        return _id;
    }

    public List<LineItem> get_lineItems() {
        return _lineItems;
    }
}