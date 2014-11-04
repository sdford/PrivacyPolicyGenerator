package privacypolicystatementgenerator.coordinator;

import privacypolicystatementgenerator.data.Data;
import privacypolicystatementgenerator.generator.Generator;

public class Coordinator {

	public void generatePrivacyPolicy(String path) {
		
		//Data data = Parser.getData();
		Generator.generate(new Data(), path);
	}
	
}
