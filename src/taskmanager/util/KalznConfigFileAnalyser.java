package taskmanager.util;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class KalznConfigFileAnalyser {
	public static Map<String, String> analyseFile(File file) throws IOException {
		return null;
	}
	public static Map<String, String> analyseFile(String filePath) throws IOException {
		return analyseFile(new File(filePath));
	}
	
}
