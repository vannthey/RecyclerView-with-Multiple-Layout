package com.example.reyclerviewwithdifferencelayout;

public class View {
    private int viewType;
    private Object object;

    public View(int viewType, Object object) {
        this.viewType = viewType;
        this.object = object;
    }

    public int getViewType() {
        return viewType;
    }

    public Object getObject() {
        return object;
    }
}
