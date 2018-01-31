package cn.krvision.krvisionsingletondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resource resource = SingletonEnum.INSTANCE.getInstance();//通过枚举类方式 获取Resource的单例

        Singleton singleton = Singleton.getInstance();//通过静态内部类方式 获取Singleton的单例
    }
}
