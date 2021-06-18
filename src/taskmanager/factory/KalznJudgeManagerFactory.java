package taskmanager.factory;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import taskmanager.exception.JudgeManagerException;
import taskmanager.manager.KalznJudgeManager;
import taskmanager.util.KalznConfigFileAnalyser;

public class KalznJudgeManagerFactory {
	public static KalznJudgeManager createKalznJudegManager(Map<String, String> configMap) throws JudgeManagerException{
		return null;
		
	}
	public static KalznJudgeManager createKalznJudegManager(File config) throws IOException, JudgeManagerException{
		return createKalznJudegManager(KalznConfigFileAnalyser.analyseFile(config));
	}
	
	public static KalznJudgeManager createKalznJudegManager(String path) throws IOException, JudgeManagerException{
		return createKalznJudegManager(new File(path));
	}
}
