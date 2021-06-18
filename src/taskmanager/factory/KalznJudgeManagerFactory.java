package taskmanager.factory;

import java.io.File;
import java.io.IOException;

import taskmanager.exception.JudgeManagerException;
import taskmanager.manager.KalznJudgeManager;

public class KalznJudgeManagerFactory {
	public static KalznJudgeManager createKalznJudegManagerFromFile(File config) throws IOException, JudgeManagerException{
		return null;
	}
	
	public static KalznJudgeManager createKalznJudegManagerFromFile(String path) throws IOException, JudgeManagerException{
		return createKalznJudegManagerFromFile(new File(path));
	}
}
