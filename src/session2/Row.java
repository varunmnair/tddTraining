package session2;

public class Row {
	
	public enum State {
		HYPHENATE,
		NORMAL
	};
	
	int maxLimit;
	StringBuilder value;

	public Row(int maxLimit) {
		this.maxLimit = maxLimit;
		this.value = new StringBuilder();
	}

	@Override
	public String toString() {
		return value.toString();
	}

	public boolean accept(char c) throws FillerException {
		
		if (hasReachedCapacity()) {
			throw new FillerException();
		}
		value.append(c);
		return true;
	}

	private boolean isLeadingSpace(char ch) {
		return (ch == ' ' && value.length() == 0);
	}

	
}
