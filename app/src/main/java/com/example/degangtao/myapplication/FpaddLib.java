package com.example.degangtao.myapplication;

import com.sun.jna.Library;

/**
 * Created by degangtao on 2017/12/7.
 */

public interface FpaddLib extends Library {
    public int addxy(Fp fp,int left,int right);
}
