
abstract class Car {

    public abstract void price();

    public abstract void runs();
}

class Sedan extends Car {

    @Override
    public void price() {
        System.out.println("Price of the verna is 20 lakhs");
    }

    @Override
    public void runs() {
        System.out.println("The ride of verna is a level below perfect driving experience");
    }

}

class Suv extends Car {

    @Override
    public void price() {
        System.out.println("Price of the harrier is 25 lakhs");
    }

    @Override
    public void runs() {
        System.out.println("The ride of harrier is a bit hard");
    }

}

class Hatchback extends Car {

    @Override
    public void price() {
        System.out.println("Price of the i20 is 10 lakhs");
    }

    @Override
    public void runs() {
        System.out.println("The ride of i20 is good");
    }
}

class Showroom {

    public void carDetails(Car car) {
        car.price();
        car.runs();

    }
}

public class Poly2 {

    public static void main(String[] args) {

        Sedan sedan = new Sedan();
        Suv suv = new Suv();
        Hatchback hatchback = new Hatchback();

        Showroom showroom = new Showroom();
        showroom.carDetails(sedan);
        showroom.carDetails(suv);
        showroom.carDetails(hatchback);

    }

}

/* 

So here, To achieve real time polymorphism am using 3 classes namely Sedan,Suv,Hatchback and all the three are extending Car class
i.e Car class is the parent class
now, there are 2 methods in Car class which are inherited and by all the other classes and they are overridden as well
now in order to perfrom real time polymorphism i created  a class called as showroom and using this we will achieve it
Now in main class am creating objects for all the 3 classes.
In-order to achieve real time polymorphism there are 2 mandatory conditions 
  1.Parent class ref type should be created
  2.Methods from the parent class which are inherited must be over-ridden 

Now in class Showroom, am using a method called as carDetails and passing parent ref as a parameter to it. 
We are well known that a parent type ref variable can hold a child objects address, like
          Parent ref = new Child();

Now, in main class am creating instances for all the child classes/ classes that are extending Car class 

        Sedan sedan = new Sedan();
        Suv suv = new Suv();
        Hatchback hatchback = new Hatchback();

Here , (sedan,suv,hatchback) are the ref variables which contains the address of the child objects

So, as Car is the parent class am creating a Parent ref and passing it as parameter to the carDetails method so that it can hold the address of the child objects 

                public void carDetails(Car car)

Now, in main class am creating an instance for Showroom class and calling carDetails method passing Child Ref variables as arguments

        Showroom showroom = new Showroom();
        showroom.carDetails(sedan);
        showroom.carDetails(suv);
        showroom.carDetails(hatchback);


The output will be 

Price of the verna is 20 lakhs
The ride of verna is a level below perfect driving experience
Price of the harrier is 25 lakhs
The ride of harrier is a bit hard
Price of the i20 is 10 lakhs
The ride of i20 is good


Hence, real time polymorphism is achieved.

 */
