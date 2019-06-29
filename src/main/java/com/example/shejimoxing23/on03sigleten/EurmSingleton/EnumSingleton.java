package com.example.shejimoxing23.on03sigleten.EurmSingleton;

/**
 * @ClassName EnumSingleton
 * @AUthor hanjialiang
 * @Date 2019-06-27 11:39
 * @Version 1.0
 * @Description
 */
public enum  EnumSingleton {
    INSTANCE{
        protected void test(){
            System.out.println("hjl test");
        }
    };
    protected abstract void test();
    private Object Data;

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
