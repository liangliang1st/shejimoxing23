package com.example.shejimoxing23.on03sigleten.test;


public enum EnumSingleton {
    INSTANCE{
        protected void say(){
            System.out.println("hello");
        }
    };
    protected abstract void say();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
