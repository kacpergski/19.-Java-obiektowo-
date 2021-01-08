import java.sql.SQLOutput;

public class HotelProgram {
    public static void main(String[] args) {

        HotelRoom room1= new HotelRoom();
        room1.roomNumber = 1;
        room1.roomOccupancy = true;

        HotelRoom room2= new HotelRoom();
        room2.roomNumber = 2;
        room2.roomOccupancy = false;

        HotelRoom room3= new HotelRoom();
        room3.roomNumber = 3;
        room3.roomOccupancy = true;

            HotelRoom rooms []  = new HotelRoom[3];
           rooms[0] = room1;
           rooms[1] = room2;
           rooms[2] = room3;

        for (HotelRoom a: rooms) {

            System.out.println("Pokoje w hotelu i ich statusy:");
            System.out.println("Pokój nr: " + a.roomNumber);
            if (a.roomOccupancy == true) {
                System.out.println("zajęty");
            } else {
                System.out.println("wolny");
            }
        }


    }
}
