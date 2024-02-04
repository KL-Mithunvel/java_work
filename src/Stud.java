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

 public String grade(){
  int gp=this.cgpa();
  if(gp <=4){
   return "F";
  }
  if (gp>4 && gp<=5){
   return "D";
  }
  if (gp>5 && gp<=6){
   return "C";
  }if (gp>6 && gp<=7.5){
   return "B";
  }if (gp>7.5 && gp<=9){
   return "A";
  }else {
   return "S";
  }
 }
 public void display(){
  System.out.println(this.regno+" "+this.name+" "+this.age+" "+this.m1+" "+this.m2+" "+this.m3+" "+(this.m1+this.m2+this.m3)+" "+this.avg()+" "+this.cgpa()+" "+this.grade());
 }
}
