class Xworkz{
String name;
String batch;
int rollno;
void Devloper(){
System.out.println(rollno + name + batch +""+" is Devloper");
}
public static void main (String args []){
Xworkz Tanvir = new Xworkz();
Tanvir.name= "Tanvir";
Tanvir.batch="from2018batch";
Tanvir.rollno=11;
Tanvir.Devloper();
Xworkz Manjunath = new Xworkz();
Manjunath.name= "Manjunath";
Manjunath.batch="from2019batch";
Manjunath.rollno=12;
Manjunath.Devloper();
Xworkz Muskan = new Xworkz();
Muskan.name= "Muskan";
Muskan.batch="from2019batch";
Muskan.rollno=13;
Muskan.Devloper();
Xworkz Pooja = new Xworkz();
Pooja.name= "Pooja";
Pooja.batch="from2018batch";
Pooja.rollno=14;
Pooja.Devloper();
Xworkz Kushi = new Xworkz();
Kushi.name= "Kushi";
Kushi.batch="from2020batch";
Kushi.rollno=15;
Kushi.Devloper();
}
}
