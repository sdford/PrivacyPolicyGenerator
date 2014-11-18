package privacypolicystatementgenerator.coordinator;

import privacypolicystatementgenerator.data.ParsedInfo;
import privacypolicystatementgenerator.data.PolicyInfo;
import privacypolicystatementgenerator.generator.Generator;
import privacypolicystatementgenerator.parser.Parser;

public class Coordinator {
	
	private ParsedInfo parsedInfo;
	private PolicyInfo policyInfo;
	private Generator generator;
	private Parser parser;
	
	public Coordinator() {
		generator = Generator.getInstance();
		parser = Parser.getInstance();
		parsedInfo = parser.parse();
		policyInfo = new PolicyInfo();
	}
	
	public ParsedInfo getParsedInfo() {
		return parsedInfo;
	}
	
	public void generatePolicy() { 
		generator.generatePolicy(parsedInfo, null);
	}
	
	public void setAppName(String appName) { 
		policyInfo.setAppName(appName);
	}
	
	public void setAppDescription(String appDescription) { 
		policyInfo.setAppDescription(appDescription);
	}

}
