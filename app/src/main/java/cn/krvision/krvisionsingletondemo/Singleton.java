package cn.krvision.krvisionsingletondemo;

/**
 * Created by gaoqiong on 2018/1/31  静态内部类单例模式
 *
 * 当第一次加载Singleton类时并不会初始化sInstance，只有在第一次调用Singleton的getInstance方法时候才会导致sInstance初始化，
 * 因此，第一次刁艳红getInstance方法会导致虚拟机加载SingletonHolder类，这种方法不仅能够确保线程安全，也能够保证单例对象的唯一性，
 * 同时延迟了单例的实例化。所以是推荐的单例模式实现方式。
 */

public class Singleton {
    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }

    /**
     * 2018/1/31  GaoQiong 静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }
}
