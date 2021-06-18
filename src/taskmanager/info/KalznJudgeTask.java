package taskmanager.info;
/**
 * 
 * 
 * @param args
 */

import java.io.File;
import java.util.Date;

import taskmanager.abstractInfo.KalznCanJudge;
import taskmanager.exception.JudgeTaskException;
/**
 * 
 * @author 22612
 *
 */
public class KalznJudgeTask implements Comparable<KalznJudgeTask> {
	
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
	// ( single result (like ICPC mode) or calculate total point (like IOI) )
	
	private short priority;
	// The priority value = 0~10, and a task that have bigger value have higher priority. 
	
	private Date submitDate;
	// The submit date of the task (The time that the task is received by web server)
	
	private Date constructDate;
	// The construct date of the task (The time that the task is received by judge server)
	
	public KalznJudgeTask(long taskID, KalznCanJudge problem, File codeFile, KalznCompiler selectedCompiler, short judgeMode, short judgeWay, short priority, Date submitDate ) throws RuntimeException {
		this.codeFile=codeFile;
		this.problem = problem;
		if (taskID < 0) throw new JudgeTaskException("TaskID is negative.", JudgeTaskException.TASK_CONSTRUCT_ERROR);
		this.taskID = taskID;
		this.selectedCompiler = selectedCompiler;
		this.judgeMode = judgeMode;
		this.judgeWay = judgeWay;
		this.priority = priority;
		this.submitDate = submitDate;
		this.constructDate = new Date();
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
	
	public short getPriority() {
		return priority;
	}

	public void setPriority(short priority) {
		this.priority = priority;
	}

	public Date getSubmitDate() {
		return submitDate;
	}

	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}

	public Date getConstructDate() {
		return constructDate;
	}

	public void setConstructDate(Date constructDate) {
		this.constructDate = constructDate;
	}

	@Override
	public int compareTo(KalznJudgeTask o) {
		if (this.priority!=o.priority) {
			return - this.priority - o.priority;
		}  else if (this.submitDate.compareTo(o.submitDate) != 0) {
			return this.submitDate.compareTo(o.submitDate);
		} else {
			return this.constructDate.compareTo(o.constructDate);
		}
	}
	
}
