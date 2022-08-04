package com.company;
//Abstraction by using abstract keyword
abstract class phone{
    abstract void call(); // ye logo ko dekhegaa..
}

class samsung extends phone
{
    void call()
    {
        System.out.println("Ashutosh is calling");  // yaha par eske implementation hogaa.
    }
}
public class Abstraction {
    public static void main(String[] args) {
        //phone object is created but with samsung class i.e phone object is created with memory allocation of samsumg class....to acheive abstraction
        phone p = new samsung();  //-------******
        p.call();
    }
}
