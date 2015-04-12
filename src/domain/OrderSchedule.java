package com.ionmart.domain;

public class OrderSchedule{
    private final String _id;
    private final String _shoppingCartId;
    private final Date _startTime;
    private final Date _endTime;
    private final OrderScheduleInterval _interval;

    public OrderSchedule(String _id, String _shoppingCartId, Date _startTime, Date _endTime, OrderScheduleInterval _interval) {
        this._id = _id;
        this._shoppingCartId = _shoppingCartId;
        this._startTime = _startTime;
        this._endTime = _endTime;
        this._interval = _interval;
    }

    public String get_id() {
        return _id;
    }

    public String get_shoppingCartId() {
        return _shoppingCartId;
    }

    public Date get_startTime() {
        return _startTime;
    }

    public Date get_endTime() {
        return _endTime;
    }

    public OrderScheduleInterval get_interval() {
        return _interval;
    }
}