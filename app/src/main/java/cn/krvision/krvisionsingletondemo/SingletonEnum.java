package cn.krvision.krvisionsingletondemo;

/**
 * Created by gaoqiong on 2018/1/31  枚举单例
 */

public enum SingletonEnum {
    INSTANCE;
    private Resource instance;

    SingletonEnum() {
        instance = new Resource();
    }

    public Resource getInstance() {
        return instance;
    }

}
