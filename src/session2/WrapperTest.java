package session2;

import static org.junit.Assert.*;
import org.junit.Test;

public class WrapperTest {

	@Test
	public void should_split_by_position_with_hyphen() {
		
		String doc = "Pega systems";
		int position = 4;

		Allocator allocater = new Allocator();
		Container container = allocater.allocate(doc,position);
		
		Row row1 = container.getRows().get(0);
		Row row2= container.getRows().get(1);
		Row row3 = container.getRows().get(2);
		
		assertEquals(3,container.getRows().size());	
		assertEquals("Pega",row1.toString());
		assertEquals( "sys-",row2.toString());
		assertEquals( "tems",row3.toString());
		
	}
	
	@Test
	public void should_split_by_position_without_hyphen() {
		
		String doc = "Pega  are fine";
		int position = 4;

		Allocator allocater = new Allocator();
		Container container = allocater.allocate(doc,position);
		
		Row row1 = container.getRows().get(0);
		Row row2= container.getRows().get(1);
		Row row3 = container.getRows().get(2);
		
		assertEquals(3,container.getRows().size());	
		assertEquals("Pega",row1.toString());
		assertEquals( "are ",row2.toString());
		assertEquals( "fine",row3.toString());
		
	}
	

}
