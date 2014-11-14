package privacypolicystatementgenerator.coordinator;

import privacypolicystatementgenerator.data.Data;
import privacypolicystatementgenerator.generator.Generator;
import privacypolicystatementgenerator.parser.Parser;

public class Coordinator {
	
	private Data parsedInfo;
	private Generator generator;
	private Parser parser;
	
	public Coordinator() {
		generator = Generator.getInstance();
		parser = Parser.getInstance();
		parsedInfo = parser.parse();
	}
	
	public Data getParsedInfo() {
		return parsedInfo;
	}
	
	public void generatePolicy() { 
		generator.generatePolicy(parsedInfo, null);
	}

}
