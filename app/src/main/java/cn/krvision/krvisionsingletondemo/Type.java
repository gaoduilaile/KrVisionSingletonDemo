package cn.krvision.krvisionsingletondemo;

/**
 * Created by gaoqiong on 2018/1/31  枚举类
 */

public enum  Type {
    A,B,C,D;
}

/*

上面的枚举类时与这样一个类  上面的每一个A,BC,D就是Type的一个实例化

class Type extends Enum{
    public static final Type A;
    public static final Type B;
    ...
}*/
