package docwrapper;

import static org.junit.Assert.*;

import org.junit.Test;

public class FillerTest {

	@Test(expected=FillerException.class)
	public void should_fill_row_with_char() {
		Filler filler = new Filler();
		int maxLimit = 2;
		Row row = new Row(maxLimit);
		filler.fill(row, 'P');
		filler.fill(row, 'E');
		filler.fill(row, 'G');
	}

}
