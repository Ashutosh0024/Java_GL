import java.util.HashMap;

class BusReservation{
    HashMap<Integer , String> bus = new HashMap<Integer, String>();
    int bussize = 6;

    public void BookTicket(int seatNumber , String name)
    {
        if(bus.size() > bussize - 1){
            System.out.println("no Seat available");
        }
        else {
            bus.put(seatNumber, name);
        }
    }

    public void showAvailableSeat()
    {
        System.out.println(bus);
    }

    public void CancelTicket(int seatNumber)
    {
        bus.remove(3);

    }
}


public class ReservationSystem {
    public static void main(String[] args) {
        BusReservation book = new BusReservation();
        book.BookTicket(1,"Ashutosh");
        book.BookTicket(2,"Ashutosh");
        book.BookTicket(3,"Ashutosh");
        book.BookTicket(4,"Ashutosh");
        book.BookTicket(5,"Ashutosh");
        book.BookTicket(6,"Ashutosh");
//        book.BookTicket(7,"Ashutosh");

        book.CancelTicket(4);
        book.showAvailableSeat();


    }
}
