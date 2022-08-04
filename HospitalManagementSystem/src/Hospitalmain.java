import java.util.HashMap;
class Hospital{
    HashMap<Integer, String> map = new HashMap<>();
    int number_of_Wards = 4;

    public void addPatient(int id , String name){

        if(map.size() > number_of_Wards){
            System.out.println("Ward is full");
        }
        else {
            map.put(id , name);
            System.out.println("Patient added!!!");
        }
    }

    public void discharge(int id ){
        if(map.containsKey(id) == true){
            map.remove(id);
        }
        else{
            System.out.println("Invalid input");
        }
    }

    public void seePatient()
    {
        System.out.println(map);
    }
}
public class Hospitalmain {
    public static void main(String[] args) {
        Hospital obj = new Hospital();
        obj.addPatient(1,"Ankush");
        obj.addPatient(2,"Amrit");
        obj.addPatient(3,"Amit");
        obj.addPatient(3,"Anuj");
        obj.addPatient(3,"Adarsh");

        obj.seePatient();
//        obj.discharge(1);
//        obj.seePatient();




    }
}
