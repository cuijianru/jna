package com.example.degangtao.myapplication;

import com.sun.jna.Library;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * Created by degangtao on 2017/12/7.
 */

public interface LUserLib extends Library {
    public static class User extends Structure{

        public String name;
        public int age;
        @Override
        protected List getFieldOrder() {
             return Arrays.asList("name", "age");
        }
public  User()
{
    super();
}
public User(String name,int age)
{
    super();
    this.name=name;
    this.age=age;
}
        public static class ByReference extends User implements Structure.ByReference { }

        public static class ByValue extends User implements Structure.ByValue

        { }

    }
    void setuser(User  user1);
     void setUserName(String name);
      User  getuser();

}
