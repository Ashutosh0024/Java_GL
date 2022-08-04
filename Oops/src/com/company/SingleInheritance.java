package com.company;
//single inheritance
//multilevel inheritance


class Name
{
   String firstname = "Ashutosh";
   String lastname = "Sharma";

   void show()
   {
       System.out.println(firstname + lastname);
   }

}

class id extends Name
{
    int id = 10011;
    void show()
    {
        System.out.println("Name :" + " " + super.firstname + " " + super.lastname + "\nId :" + id);
    }

}
class occupation extends id {
    String occupation = "Java developer";

    @Override
    void show() {
        super.show();
        System.out.println("occupation :" +" " + occupation );
    }
}
class details extends occupation{
    double salary = 45000;

    @Override
    void show() {
        super.show();
        System.out.println("Salary :" + " " + salary);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        details d1 = new details();
        d1.show();

    }

}
