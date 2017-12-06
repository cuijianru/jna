package com.example.degangtao.myapplication;

import com.sun.jna.Callback;

/**
 * Created by degangtao on 2017/12/6.
 */

public  interface Fp extends Callback {
    int invoke(int a,int b);
}
