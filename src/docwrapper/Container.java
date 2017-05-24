package docwrapper;

import java.util.ArrayList;
import java.util.List;

public class Container {

	List<Row> rows;
	
	Row currentRow;

	public Container() {
		rows = new ArrayList<>();
	}

	public List<Row> getRows() {
		return rows;
	}

	public void populateRow(String doc, int position) {
		currentRow = new Row(position);
		for (int index = 0; index < doc.length(); index++) {
			char c = doc.charAt(index);
			boolean flag = currentRow.accept(c);
			if (!flag) {
				rows.add(currentRow);
				currentRow = new Row(position);
				currentRow.accept(c);
			}
		}
		rows.add(currentRow);
	}

}
