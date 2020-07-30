
package truckdemo;


class Vehicle {
   private int passengers; //количество пассажиров
   private int fuelcap; //емеость топливного бака
   private int mpq; //потребление топлива в милях на галлон
   
   
   //конструктор класса Vehicle
   Vehicle (int p, int f, int m) {
   passengers = p;
   fuelcap=f;
   mpq = m;   
   }
           
           
           
   //определить дальность поездки
   int range () {
   return fuelcap*mpq;
   }
   
   //расчитать объем топлива необходимый тс для преодоления заданного растояния
   double fuelneeded (int miles) {
   return (double) miles / mpq;
   }
   
 }
 
 //расширение класса Vehicle для грузовиков
  class Truck extends Vehicle {
   private int cargocap; //грузоподъемность в фунтах
   
   //конструктор класса Truck
   Truck(int p, int f, int m, int c) {
   //инициализация членов суперкласса с использованием конструктора суперкласа
    super (p,f,m);
    cargocap = c;
   }
   
   //методы доступа к cargocap
   int gerCargo() {return cargocap;}
   void putCargo(int c) {cargocap = c;}
  }

public class TruckDemo {
 
    public static void main(String[] args) {
     Truck semi = new Truck(2,200,7,44000); 
     Truck pickup = new Truck (3,28,15,2000);
     double gallons;
     int dist = 252;
     gallons = semi.fuelneeded(dist);
        System.out.println("Грузовик может перевезти "+ semi.gerCargo()+ " фунтов.");
        System.out.println("Для преодоления "+ dist + " миль грузовику требуется "+
                gallons + " галлонов топлива.\n");
        gallons = pickup.fuelneeded(dist);
        
        System.out.println("Пикап может перевезти "+ pickup.gerCargo()+ " фунтов.");
        System.out.println("Для преодоления "+ dist + " миль пикапу требуется "+
                gallons + " галлонов топлива.\n");
        
        
    }
    
}
