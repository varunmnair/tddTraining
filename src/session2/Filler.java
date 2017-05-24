package session2;

public class Filler {

	public void fill(Row row, char c){
		row.accept(c);
	}
	
	private boolean hasReachedCapacity() {
		return row.length() == maxLimit;
	}

}
