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

}

