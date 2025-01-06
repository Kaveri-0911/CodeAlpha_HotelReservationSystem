import java.util.*;
class Room 
{
    private int roomNumber;
    private String category;
    private double price;
    private boolean isAvailable;

    public Room(int roomNumber, String category, double price)
    {
        this.roomNumber = roomNumber;
        this.category = category;
        this.price = price;
        this.isAvailable = true;
    }

    public int getRoomNumber() 
    {
        return roomNumber;
    }

    public String getCategory() 
    {
        return category;
    }

    public double getPrice() 
    {
        return price;
    }

    public boolean isAvailable() 
    {
        return isAvailable;
    }

    public void setAvailable(boolean available) 
    {
        isAvailable = available;
    }

    @Override
    public String toString() 
    {
        return "Room " + roomNumber + " (" + category + ") - $" + price + (isAvailable ? " [Available]" : " [Booked]");
    }
}

class Reservation 
{
    private static int idCounter = 1;
    private int reservationId;
    private String guestName;
    private Room room;

    public Reservation(String guestName, Room room)
    {
        this.reservationId = idCounter++;
        this.guestName = guestName;
        this.room = room;
        this.room.setAvailable(false);
    }

    public int getReservationId() 
    {
        return reservationId;
    }

    public String getGuestName()
    {
        return guestName;
    }

    public Room getRoom() 
    {
        return room;
    }

    
    public String toString() 
    {
        return "Reservation ID: " + reservationId + "\nGuest Name: " + guestName + "\nRoom Details: " + room;
    }
}

public class HotelReservationSystem 
{
    private List<Room> rooms = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    public HotelReservationSystem() 
    {
        initializeRooms();
    }

    private void initializeRooms() 
    {
        rooms.add(new Room(101, "Single", 100.0));
        rooms.add(new Room(102, "Double", 150.0));
        rooms.add(new Room(103, "Suite", 300.0));
        rooms.add(new Room(104, "Single", 100.0));
        rooms.add(new Room(105, "Double", 150.0));
    }

    public void searchRooms(String category)
    {
        System.out.println("Available rooms in category: " + category);
        boolean found = false;
        for (Room room : rooms) {
            if (room.getCategory().equalsIgnoreCase(category) && room.isAvailable())
            {
                System.out.println(room);
                found = true;
            }
        }
        if (!found) 
        {
            System.out.println("No rooms available in this category.");
        }
    }

    public void makeReservation(String guestName, int roomNumber)
    {
        for (Room room : rooms) 
        {
            if (room.getRoomNumber() == roomNumber) 
            {
                if (room.isAvailable())
                {
                    Reservation reservation = new Reservation(guestName, room);
                    reservations.add(reservation);
                    System.out.println("Reservation successful!\n" + reservation);
                }
                else
                {
                    System.out.println("Room is not available.");
                }
                return;
            }
        }
        System.out.println("Room not found.");
    }

    public void viewReservations() 
    {
        if (reservations.isEmpty()) 
        {
            System.out.println("No reservations found.");
        } 
        else 
        {
            for (Reservation reservation : reservations)
                {
                System.out.println(reservation);
                System.out.println("-------------------");
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        HotelReservationSystem system = new HotelReservationSystem();

        while (true) {
            System.out.println("\nHotel Reservation System");
            System.out.println("1. Search Rooms");
            System.out.println("2. Make a Reservation");
            System.out.println("3. View Reservations");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter room category (Single/Double/Suite): ");
                    String category = scanner.nextLine();
                    system.searchRooms(category);
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter room number to reserve: ");
                    int roomNumber = scanner.nextInt();
                    system.makeReservation(name, roomNumber);
                    break;
                case 3:
                    system.viewReservations();
                    break;
                case 4:
                    System.out.println("Thank you for using the Hotel Reservation System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
