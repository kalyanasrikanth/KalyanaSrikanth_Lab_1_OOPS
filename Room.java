
public class Room {
	protected int roomNumber;
	protected boolean isAccomodated;
	protected boolean hasStudyTable;
	protected boolean hasCouch;
	protected boolean hasMiniKitchen;
	protected boolean hasAC;
	protected int numOfBeds;
	protected int basePrice;
	protected int roomType;
	
	int getRoomNumber() {
		return this.roomNumber;
	}
	
	boolean getIsAccomodated() {
		return this.isAccomodated;
	}
	
	boolean getHasMiniKitchen() {
		return this.hasMiniKitchen;
	}
	
	boolean getHasAC() {
		return this.hasAC;
	}
	
	int getBasePrice() {
		return this.basePrice;
	}
	
	int getNumOfBeds() {
		return this.numOfBeds;
	}
	
}

