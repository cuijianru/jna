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
;

        setContentView(R.layout.activity_main);
       LAddLib lAddLib = (LAddLib) Native.loadLibrary("myadd", LAddLib.class);
        System.out.println(lAddLib.myadd(1,2));
        System.out.println(lAddLib.myString());
    }
}
