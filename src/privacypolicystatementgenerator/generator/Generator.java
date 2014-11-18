package privacypolicystatementgenerator.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import privacypolicystatementgenerator.data.ParsedInfo;

public class Generator {
	
	private static Generator generator;
	
	private Generator() {
	}
	
	public static Generator getInstance() {
		if (generator == null) {
			generator = new Generator();
		}
		return generator;
	}
	
	public void generatePolicy(ParsedInfo data, String path) {
		return;
		/*
		File policy = createPolicyFile(path);
		writePolicy(data, policy);
		*/
	}
	
	public void writePolicy(ParsedInfo data, File policy) {
		List<String> infoShared = data.getData();
		try {
			FileWriter fw = new FileWriter(policy.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private File createPolicyFile(String path) {
		File policy = new File(path);
		
		try {
			if (!(policy.createNewFile())) { 
				replaceExistingPolicyFile(policy);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return policy;
	}

	private void replaceExistingPolicyFile(File policy) {
		policy.delete();
		try {
			policy.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
