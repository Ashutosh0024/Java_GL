package com.company;
abstract class calculator
{
    abstract void result(int a , int b);  // this is what shows to the user.
}
class addition extends calculator
{
    void result(int a , int b)
    {
        System.out.println("Result is :" + " " + (a + b)); // this is the implementation of above method.
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        calculator c1 = new addition();
        c1.result(3, 4);
    }
}
