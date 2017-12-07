//
// Created by degang tao on 2017/12/5.
//

#include<myadd.h>
#include<string.h>

//简单例子

User *user=new User();
School * school =new School();
int myadd(int x, int y)
{
return x+y;
}
 char * myString()
{
return "这是从c文件中返回的字符串";
}





void setuser(User * user1)
{
user=user1;
}
void setUserName(char * name)
{
user->name=name;
}

User* getuser()
{
return user;
}






void setSchool(School * school0)
{
school=school0;
}
School * getSchool()
{
return school;
}


int addxy(int (*fp)(int left,int right),int left,int right){

   return fp(left,right);

}