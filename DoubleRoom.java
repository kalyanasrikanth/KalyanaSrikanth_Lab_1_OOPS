
public class DoubleRoom extends Room {
		
	DoubleRoom(int roomNumber, boolean isAccomodated, boolean hasAC) {
		this.roomNumber = roomNumber;
		this.isAccomodated = isAccomodated;
		this.hasStudyTable = true;
		this.hasCouch = true;
		this.hasAC = hasAC;
		this.numOfBeds = 2;
		this.basePrice = 3000;
	}
}
