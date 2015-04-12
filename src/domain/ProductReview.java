package com.ionmart.domain;

public class ProductReview{
    private final String _id;
    private final String _comment;
    private final Integer _rating;

    public ProductReview(String _id, String _comment, Integer _rating) {
        this._id = _id;
        this._comment = _comment;
        this._rating = _rating;
    }
}

