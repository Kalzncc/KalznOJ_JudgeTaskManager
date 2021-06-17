package taskmanager.info;
/**
 * 
 * 
 * @param args
 */

import java.io.File;

import taskmanager.abstractInfo.KalznCanJudge;

public class KalznJudgeTask {
	
	final static short STRICT_MODE = 1, NOT_STRICT_MODE = 0; // The sign that suggest the judge mode.
	
	private long taskID; // the unique task id
	private KalznCanJudge problem; // the problem
	private File codeFile; // the submit code
	private KalznCompiler selectedCompiler; // the selected compiler;
	
	public KalznJudgeTask(long taskID, KalznCanJudge problem, File codeFile, KalznCompiler selectedCompiler) {
		this.codeFile=codeFile;
		this.problem = problem;
		this.taskID = taskID;
		this.selectedCompiler = selectedCompiler;
	}
	
	
	public static void main(String[] args) {
		

	}

}
