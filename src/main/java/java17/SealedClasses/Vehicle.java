package java17.SealedClasses;

public sealed class Vehicle permits Car, Bike {

    public void drive(){
        System.out.println("Vehicle drive...");
    }

}
