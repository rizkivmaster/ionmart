package com.ionmart.domain;

/*
a line item is an item that the customer puts into the shopping cart
it describes what and how many the user took the products
 */
public class LineItem{
    private final String _id;
    private final String _productId;
    private final String _shoppingCartId;
    private final Integer _quantity;

    public LineItem(String _id, String _productId, String _shoppingCartId) {
        this._id = _id;
        this._productId = _productId;
        this._shoppingCartId = _shoppingCartId;
    }

    public String get_id() {
        return _id;
    }

    public String get_productId() {
        return _productId;
    }
}