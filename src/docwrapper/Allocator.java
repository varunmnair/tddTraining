package docwrapper;

public class Allocator {

	public Container allocate(String doc, int position) {
		Container container= new Container();
		container.populateRow(doc, position);		
		return container;
	}

	
}
