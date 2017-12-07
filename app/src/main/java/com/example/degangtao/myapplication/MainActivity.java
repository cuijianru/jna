package com.example.degangtao.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.sun.jna.Native;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements Cloneable{
//    static {
//        System.loadLibrary("add");
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
      //  Test1();
        Test2();

    }
    private void Test1()
    {
        LAddLib lAddLib = (LAddLib) Native.loadLibrary("myadd", LAddLib.class);
        System.out.println(lAddLib.myadd(1,2));
        System.out.println(lAddLib.myString());

    }
    private void Test2()
    {
        LUserLib lAddLib = (LUserLib) Native.loadLibrary("myadd", LUserLib.class);
        lAddLib.setUserName("杨幂");
        LUserLib.User user=lAddLib.getuser();
        System.out.println("这是C从获取的名字："+user.name);
        LUserLib.User user1=new LUserLib.User("徐璐",20);
        lAddLib.setuser(user1);
        LUserLib.User user2=lAddLib.getuser();
        System.out.println("这是从JAVA传入的数据名字："+user2.name+"  年龄："+user2.age);
    }
}
