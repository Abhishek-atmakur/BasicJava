class Car{
  double carPrice;
  String carName;
  
  void run(){
    System.out.println("The car runs so good");
  }

  //Over-ridden
  void fuelUsed(){
    System.out.println("The fuel used is either petrol or diesel");
  }

}

class Bike extends Car{
  double bikePrice;
  String bikeName;

  //Over-ridding 
  void fuelUsed(){
    System.out.println("Only petrol is used as a fuel in bike");
  }

  void ride(){
    System.out.println("The bike rides so Goated");
  }

  void bikeColour(){
    System.out.println("My bike colour was metallic grey");
  }
}

public class Poly1 {
  public static void main(String[] args) {

    Bike b1 = new Bike();
    b1.run();
    b1.fuelUsed();
    Car c1 = new Bike(); // This is called as upcasting and using this we can achieve polymorphism
    c1.fuelUsed();
    ((Bike)c1).bikeColour(); // downcasting --> Basically here we are downcasting our parent class ref to child class object so that we can access child class specialised methods

  

    
  }
}
