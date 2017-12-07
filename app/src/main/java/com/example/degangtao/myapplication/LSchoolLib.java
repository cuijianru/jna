package com.example.degangtao.myapplication;

import com.sun.jna.Library;
import com.sun.jna.NativeLong;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * Created by degangtao on 2017/12/7.
 */

public interface LSchoolLib extends Library {
    public static class School extends Structure {



        public String  name;


        public int count;
        //public LUserLib.User.ByValue[] users=new LUserLib.User.ByValue[100];

        public  LUserLib.User.ByReference[]  users=new LUserLib.User.ByReference[100];
        @Override
        protected List getFieldOrder() {
            return Arrays.asList("name" ,"count","users");
        }
        public static class ByReference extends School implements Structure.ByReference { }

        public static class ByValue extends School implements Structure.ByValue

        { }
    }
    void setSchool(School.ByReference  school0);
    School getSchool();
}
