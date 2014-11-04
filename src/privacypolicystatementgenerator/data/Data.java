package privacypolicystatementgenerator.data;

import java.util.ArrayList;
import java.util.List;

public class Data {

	List<String> data = new ArrayList<String>();
	
	public void add(String information) {
		data.add(information);
	}
	
	public List<String> getData() {
		return data;
	}
}
