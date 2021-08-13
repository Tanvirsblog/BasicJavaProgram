class Flower {
String name;
String color;
int noOfPeals;
void blooming(){
System.out.println(color+""+name+"is blooming");
}
void shedfragrance(){
System.out.println(color+""+name+"is shedding fragrance");
}
public static void main(String args[]){
Flower rose =new Flower();
rose.name="Rose";
rose.color="Red";
rose.noOfPeals=15;
rose.blooming();
rose.shedfragrance();
}
}