package taskmanager.factory;


import java.io.File;
import java.io.IOException;
import java.util.Map;

import taskmanager.exception.JudgeTaskException;
import taskmanager.info.KalznJudgeTask;
import taskmanager.util.KalznConfigFileAnalyser;

public class KalznJudgeTaskConfigFactory {
	public static KalznJudgeTask createKalznJudgeTask( Map<String, String> config) throws JudgeTaskException {
		return null;
	}
	public static KalznJudgeTask createKalznJudgeTask( File configFile) throws IOException, JudgeTaskException {
		return createKalznJudgeTask(KalznConfigFileAnalyser.analyseFile(configFile));
	}
	public static KalznJudgeTask createKalznJudgeTask( String configFilePath) throws IOException, JudgeTaskException {
		return createKalznJudgeTask(new File(configFilePath));
	}
}
