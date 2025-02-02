class HotelBooking{
    private String guestName;
    private String roomType;
    private int nights;

    //Default constructor
    public HotelBooking(){
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 2;
    }

    //Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    //Copy constructor
    public HotelBooking(HotelBooking other){
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBookingInfo(){
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args){
        //Using default constructor
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBookingInfo();

        System.out.println();

        //Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("Aditya", "Deluxe", 3);
        booking2.displayBookingInfo();

        System.out.println();

        //Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBookingInfo();
    }
}
