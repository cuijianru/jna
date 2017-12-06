package com.example.degangtao.myapplication;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Structure;
import com.sun.jna.WString;

import java.util.Arrays;
import java.util.List;

public interface LAddLib extends Library {

	public	int myadd(int x, int y);
	public	String myString();
//	public int getValue(Fp fp,int left,int right);
//	public	String myadd(String x, int y);
//	public String getname(User  user);
//	public  class User extends Structure
//	{
//		//public long id;
//		public int age;
//		public  String name;
//		public 	User ()
//		{
//			super();
//		}
//	public 	User (long id,int age,String name)
//	{
//		//this.id=id;
//		this.age=age;
//		this.name=name;
//
//	}
//		@Override
//		protected List getFieldOrder() {
//			return Arrays.asList( "age","name");
//		}
//		public static class ByReference extends User implements Structure.ByReference { }
//
//		public static class ByValue extends User implements Structure.ByValue
//
//		{ }
//	}

}

