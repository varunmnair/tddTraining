package session2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RowTest {
	
	@Test
	public void should_accomadate_characters_within_limit(){
		
		int maxLimit = 2;
		
		Row row = new Row(maxLimit);
		
		boolean flag = row.accept('P');
		assertTrue("Should accomadate P", flag);
		
		flag = row.accept('e');
		assertTrue("Should accomadate e", flag);
		
		flag = row.accept('g');
		assertFalse("Should not accomadate g", flag);
	}

	@Test
	public void should_ignore_leading_space(){
		
		int maxLimit = 2;
		
		Row row = new Row(maxLimit);
		
		boolean flag = row.accept(' ');
		assertTrue("Should ignore leading space", flag);
		
		flag = row.accept('p');
		assertTrue("Should accomodate p", flag);
		
		flag = row.accept(' ');
		assertTrue("Should not ignore space", flag);
	}
}
