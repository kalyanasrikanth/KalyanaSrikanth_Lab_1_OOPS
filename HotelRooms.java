import java.util.ArrayList;
import java.util.List;

public class HotelRooms {
	static List<Room> roomsList = new ArrayList<> ();
	
	//Adding different kind of rooms in Hotel
	void addRooms() {
		roomsList.add(new SingleRoom(101, true, true));
		roomsList.add(new DoubleRoom(102, true, true));
		roomsList.add(new DoubleRoom(103, true, false));
				
		roomsList.add(new SingleRoom(201, true, true));
		roomsList.add(new SingleRoom(202, true, false));
		roomsList.add(new DoubleRoom(203, true, true));
		roomsList.add(new TripleRoom(204, true, true));
		
	}

}
