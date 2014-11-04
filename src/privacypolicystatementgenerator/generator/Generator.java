package privacypolicystatementgenerator.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import privacypolicystatementgenerator.data.Data;

public class Generator {
	
	public static void generate(Data data, String path) {
		File policy = createPolicyFile(path);
		writePolicy(data, policy);
	}
	
	public static void writePolicy(Data data, File policy) {
		List<String> infoShared = data.getData();
		try {
			FileWriter fw = new FileWriter(policy.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static File createPolicyFile(String path) {
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

	private static void replaceExistingPolicyFile(File policy) {
		policy.delete();
		try {
			policy.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
