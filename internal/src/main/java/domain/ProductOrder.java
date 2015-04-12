package com.ionmart.domain;

public class ProductOrder{
    private final String _id;
    private final String _shoppingCartId;

    public ProductOrder(String _id, String _shoppingCartId) {
        this._id = _id;
        this._shoppingCartId = _shoppingCartId;
    }

    public String get_id() {
        return _id;
    }

    public String get_shoppingCartId() {
        return _shoppingCartId;
    }
}