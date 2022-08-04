package com.company;
// this example covers
//1. inheritance
//2. constructor
//3. super class

// Java program to illustrate the
// concept of inheritance

// base class
class Bicycle {        //base class
    // the Bicycle class has two fields
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed)  //----------*
    {
        this.gear = gear;
        this.speed = speed;
    }

    // the Bicycle class has three methods
    public void applyBrake(int decrement)
    {
        speed -= decrement;   //speed = decrement--;
    }

    public void speedUp(int increment)
    {
        speed += increment;   //speed = increment++;
    }

    // toString() method to print info of Bicycle
    public String toString()      // we call this method in last
    {
        return ("No of gears are " + gear + "\n"
                + "speed of bicycle is " + speed);
    }
}

// derived class
class MountainBike extends Bicycle {

    // the MountainBike subclass adds one more field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        // invoking base-class(Bicycle) constructor
        super(gear, speed);   // base class constructor is called
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one more method
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }

    // overriding toString() method
    // of Bicycle to print more info
    @Override public String toString()
    {
        return (super.toString() + "\nseat height is "
                + seatHeight);
    }
}

// driver class
public class Inheritance {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());


    }
}
