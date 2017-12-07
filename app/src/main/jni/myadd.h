//
// Created by degang tao on 2017/12/5.
//


#include <stdlib.h>
#include <stdio.h>

#include "jni.h"

#ifndef MYAPPLICATION_MYADD_H
#define MYAPPLICATION_MYADD_H
#ifdef __cplusplus
extern "C" {
#endif

//结构体
struct User{
   char*  name;
   int age;
};


//1，简单例子
	int myadd(int x, int y);
    char * myString();




//2结构体例子
void setuser( User * user1);
void setUserName(char * name);
User*  getuser();



#ifdef __cplusplus
};
#endif






#endif

//#endif //MYAPPLICATION_CCC_H