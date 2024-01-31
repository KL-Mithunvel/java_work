class Stud{String name;
int regno;
int age;
int m1;
int m2;
int m3;
void stud(String name, int regno,int age,int m1,int m2,int m3){
this.name=name;
this.regno=regno;
this.age=age;
this.m1=m1;
this.m2=m2;
this.m3=m3;

}
public int avg(){
int a= (m1+m2+m3)/3;
return a;
 }
public int cgpa(){
int gpa=this.avg()/10;
return gpa;
}
}
