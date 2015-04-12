package com.ionmart.domain;

public class ProductStock{
    private final String _id;
    private final Long _price;
    private final Long _stock;
    private final ImageAsset _image;
    private final Double _discount;
    private final String _provider;

    public ProductStock(String _id, Long _price, Long _stock, ImageAsset _image, double _discount, String _provider) {
        this._id = _id;
        this._price = _price;
        this._stock = _stock;
        this._image = _image;
        this._discount = _discount;
        this._provider = _provider;
    }

    public String get_id() {
        return _id;
    }

    public Long get_price() {
        return _price;
    }

    public Long get_stock() {
        return _stock;
    }

    public ImageAsset get_image() {
        return _image;
    }

    public Double get_discount() {
        return _discount;
    }

    public String get_provider() {
        return _provider;
    }
}