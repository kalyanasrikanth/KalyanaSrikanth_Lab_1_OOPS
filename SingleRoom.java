
public class SingleRoom extends Room {
		
	SingleRoom(int roomNumber, boolean isAccomodated, boolean hasAC) {
		this.roomNumber = roomNumber;
		this.isAccomodated = isAccomodated;
		this.hasStudyTable = true;
		this.hasCouch = true;
		this.hasAC = hasAC;
		this.numOfBeds = 1;
		this.basePrice = 2000;
	}
	
}
