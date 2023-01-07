
public class MyOwnAutoShop {
   
           public static void main(String[] args) {

 Sedan mySedan = new Sedan(110, 30000, "Red", 20);
 Ford myFord1 = new Ford (146,3463.0,"Black",2015, 30);
 Ford myFord2 = new Ford (155,2555.0,"Pink",2001, 5);
 Car myCar = new Car (135, 2545.0, "Red"); 


 System.out.println("Sedan Sale Price" + mySedan.getSalePrice());
 System.out.println("Ford 1 Sale Price" + myFord1.getSalePrice());
 System.out.println("Ford 2 Sale Price" + myFord2.getSalePrice());
 System.out.println("Car Sale Price" + myCar.getSalePrice());
 }
}