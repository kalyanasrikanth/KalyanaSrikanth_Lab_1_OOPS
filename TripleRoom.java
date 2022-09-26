
public class TripleRoom extends Room{
	TripleRoom(int roomNumber, boolean isAccomodated, boolean hasAC) {
		this.roomNumber = roomNumber;
		this.isAccomodated = isAccomodated;
		this.hasStudyTable = true;
		this.hasCouch = true;
		this.hasAC = hasAC;
		this.numOfBeds = 3;
		this.basePrice = 4000;
	}
}
