package privacypolicystatementgenerator.parser;

import privacypolicystatementgenerator.data.Data;

public class Parser {

	private static Parser parser;
	
	private Parser() { 	
	}
	
	public static Parser getInstance() {
		if (parser == null) {
			parser = new Parser();
		}
		return parser;
	}
	
	public Data parse(){
		return new Data();
	}
	
}
