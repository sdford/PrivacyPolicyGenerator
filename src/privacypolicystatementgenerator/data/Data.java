package privacypolicystatementgenerator.data;

import java.util.ArrayList;
import java.util.List;

public class Data {

	private String appName;
	private String appDescription;
	private List<String> data = new ArrayList<String>();
	
	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppDescription() {
		return appDescription;
	}

	public void setAppDescription(String appDescription) {
		this.appDescription = appDescription;
	}

	public void add(String information) {
		data.add(information);
	}
	
	public List<String> getData() {
		return data;
	}
}
