import java.util.Scanner;

public class Booking {
	public static void checkAvailability() {
		HotelRooms pankaj = new HotelRooms();
		pankaj.addRooms();
		boolean requireAC;
		int floorChoice;
		boolean roomAvailability = false;
		
		System.out.println("What type of room are you looking for? \n 1. Single Occupancy \n 2. Double Occupancy \n 3. Triple Occupancy \nPls enter 1, 2 or 3.");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		in.close();
		
		String[] inputSplit = input.split(" ");
		int roomTypeValue;
		if(inputSplit[0].toLowerCase().equals("single")) {
			roomTypeValue = 1;
		}else if(inputSplit[0].toLowerCase().equals("double")) {
			roomTypeValue = 2;
		}else {
			roomTypeValue = 3;
		}
		
		if(inputSplit[2].toLowerCase().equals("ac")) {
			requireAC = true;
		}else {
			requireAC = false;
		}
		
		if(inputSplit.length>4) {
			if(inputSplit[3].toLowerCase().equals("first") || inputSplit[4].toLowerCase().equals("first")) {
				floorChoice = 1;
			}else { 
				floorChoice = 2;
			}	
		}else {
			floorChoice = 0;
		}

		for(int i=0; i < HotelRooms.roomsList.size(); i++) {
			Room temp = HotelRooms.roomsList.get(i);
			int price;
			if(temp.getNumOfBeds() == roomTypeValue) {
				if((floorChoice == (int) temp.getRoomNumber()/100) || (floorChoice == 0)) {
					if((!temp.getIsAccomodated()) && (temp.getHasAC() == requireAC)) {
						if(requireAC) {
							price = temp.getBasePrice()+1000;
						} else
						{
							price = temp.getBasePrice();
						}
						System.out.println("Room number: " +temp.getRoomNumber() + "\n"
								+ "Price: " + price);
						roomAvailability = true;
						break;	
					}
				}
			}
		}
		if(!roomAvailability) {
			System.out.println("No available Room found");
		}
	}
}
