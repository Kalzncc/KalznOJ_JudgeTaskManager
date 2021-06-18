package taskmanager.info;
/**
 * 
 * 
 * @param args
 */

import java.io.File;

import taskmanager.abstractInfo.KalznCanJudge;
import taskmanager.exception.JudgeTaskException;
/**
 * 
 * @author 22612
 *
 */
public class KalznJudgeTask {
	
	public final static short STRICT_MODE = 1, NOT_STRICT_MODE = 0; 
	// the judge mode.
	
	public final static short SINGLE_RESULT_WAY = 0, CALCULATE_POINT_WAY = 1; 
	// the judge way
	
	private long taskID; 
	// the unique task id
	
	
	private KalznCanJudge problem; 
	// the problem
	
	private File codeFile; 
	// the submit code
	
	private KalznCompiler selectedCompiler; 
	// the selected compiler;
	
	private short judgeMode; 
	// The sign suggest the judge mode 
	// (strict or not)
	
	private short judgeWay; 
	// The sign suggest the judge way 
	// ( single result (like ICPC mode) or calculate total point(like IOI) )
	
	
	public KalznJudgeTask(long taskID, KalznCanJudge problem, File codeFile, KalznCompiler selectedCompiler, short judgeMode, short judgeWay) throws RuntimeException {
		this.codeFile=codeFile;
		this.problem = problem;
		if (taskID < 0) throw new JudgeTaskException("TaskID is negative.", JudgeTaskException.TASK_CONSTRUCT_ERROR);
		this.taskID = taskID;
		this.selectedCompiler = selectedCompiler;
		this.judgeMode = judgeMode;
		this.judgeWay = judgeWay;
	}
	
	public long getTaskID() {
		return taskID;
	}

	public void setTaskID(long taskID) {
		this.taskID = taskID;
	}

	public KalznCanJudge getProblem() {
		return problem;
	}

	public void setProblem(KalznCanJudge problem) {
		this.problem = problem;
	}

	public File getCodeFile() {
		return codeFile;
	}

	public void setCodeFile(File codeFile) {
		this.codeFile = codeFile;
	}

	public KalznCompiler getSelectedCompiler() {
		return selectedCompiler;
	}

	public void setSelectedCompiler(KalznCompiler selectedCompiler) {
		this.selectedCompiler = selectedCompiler;
	}

	public short getJudgeMode() {
		return judgeMode;
	}

	public void setJudgeMode(short judgeMode) {
		this.judgeMode = judgeMode;
	}

	public short getJudgeWay() {
		return judgeWay;
	}

	public void setJudgeWay(short judgeWay) {
		this.judgeWay = judgeWay;
	}
	
}
