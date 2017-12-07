package com.example.degangtao.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sun.jna.Native;




public class MainActivity extends AppCompatActivity implements Cloneable{
//    static {
//        System.loadLibrary("add");
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
      //  Test1();
     //  Test2();
       // Test3();
        Test4();
    }



    //简单例子
    private void Test1()
    {
        LAddLib lAddLib = (LAddLib) Native.loadLibrary("myadd", LAddLib.class);
        System.out.println(lAddLib.myadd(1,2));
        System.out.println(lAddLib.myString());

    }
    //结构体例子；
    private void Test2()
    {
        LUserLib lAddLib = (LUserLib) Native.loadLibrary("myadd", LUserLib.class);
        lAddLib.setUserName("杨幂");
        LUserLib.User user=lAddLib.getuser();
        System.out.println("这是C从获取的名字："+user.name);
        LUserLib.User user1=new LUserLib.User("徐璐",20);
        //重要：：：：：另一种写法
       // LUserLib.User.ByReference  user5=new LUserLib.User.ByReference();
        //user5.age=1;
        //user5.name="";
        //java方法改为：    void setuser(LUserLib.User.ByReference  user1);


        lAddLib.setuser(user1);
        LUserLib.User user2=lAddLib.getuser();
        System.out.println("这是从JAVA传入的数据名字："+user2.name+"  年龄："+user2.age);
    }
    //结构体例子；
    private void Test3()
    {
        LSchoolLib lAddLib = (LSchoolLib) Native.loadLibrary("myadd", LSchoolLib.class);
        LSchoolLib.School.ByReference  s=new LSchoolLib.School.ByReference();
        s.name="北大";
        for (int i=0;i<10;i++)
        {
            LUserLib.User.ByReference user=new LUserLib.User.ByReference();
            user.name="cui"+i;
            user.write();

            s.users[i]=user;
        }
        //s.users=users;
        lAddLib.setSchool(s);
        LSchoolLib.School ss=lAddLib.getSchool();
        System.out.println(ss.name);

        for (int i=0;i<ss.users.length;i++)
        {
            if(ss.users[i]!=null)
            {
                System.out.println(ss.users[i].name);
            }
        }
        System.out.println();
    }
    private void Test4() {
        FpaddLib lAddLib = (FpaddLib) Native.loadLibrary("myadd", FpaddLib.class);
     int c=   lAddLib.addxy(new Fp() {
            @Override
            public int invoke(int a, int b) {
                return a+b;
            }
        },3,4);

        System.out.println("c:"+c);
    }
}
