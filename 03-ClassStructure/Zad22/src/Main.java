public class Main {
    public static class Room{
        int number;
        int beds;
        boolean occupied;
        String guestName;
        Room(int number){
            this.number = number;
            this.beds = 2;
        }
        Room(int number, int beds){
            this.number = number;
            this.beds = beds;
        }
        public String toString(){
            return
                    "Room Number : " + this.number +
                            ", Number of beds : " + this.beds +
                            ", is Occupied? : " + this.occupied +
                            ", Guest name : " + this.guestName;
        }
        void checkin(String guestName){
            this.guestName = guestName;
            this.occupied = true;
        }
        void checkout(){
            this.occupied = false;
        }
        boolean isOccupied(){
            return occupied;
        }
        void displayStatus(){
            System.out.print("Room Number : " + this.number);
            System.out.print(" Number of beds : " + this.beds);
            System.out.print(" is Occupied? " + this.occupied);
            System.out.println(" Guest name : " + this.guestName);
        }
    }
     void displayRoomsReport(Room[] rooms){
        for (Room room : rooms){
            room.displayStatus();
        }
    }

     void displayRoomsReportWithBeds(Room[] rooms, int numberOfeds){
        for (Room room : rooms){
            if (room.beds == numberOfeds){
                room.displayStatus();
            }
        }
    }

     void displayRoomsReportOccupation(Room[] rooms){
        int freeRoom = 0;
        int occupiedRoom = 0;

        for (Room room : rooms){
            if (room.occupied){occupiedRoom ++;}
            else {freeRoom++;}
        }

        System.out.println("Number of occupied rooms : " + occupiedRoom);
        System.out.println("Number of free rooms : " + freeRoom);
    }

    public static void main (String[] args){
        Room room1 = new Room(1);
        Room room2 = new Room(2);
        Room room3 = new Room(3);
        Room room4 = new Room(4, 3);
        Room room5 = new Room(5, 3);
        Room room6 = new Room(6, 1);

        Room[] rooms = {room1, room2, room3, room4, room5, room6};

        r6.displayStatus();

        Room.displayRoomsReport(rooms);
        Room.displayRoomsReportWithBeds(rooms, 2);
        Room.displayRoomsReportOccupation(rooms);

    }
}