package taskmanager.info;

import java.util.Date;

public class KalznJudgeResult {
	
	private long taskID;
	
	private short singleModeResult;
	
	private String logInfo;
	
	private String compilerOutput;
	
	private int runTime;
	
	private int runMemory;
	
	private Date finishDate;
	
	private int gainPoint[];
	
	private int totalPoint;
	
	
	
	public long getTaskID() {
		return taskID;
	}

	public short getSingleModeResult() {
		return singleModeResult;
	}

	public String getLogInfo() {
		return logInfo;
	}

	public String getCompilerOutput() {
		return compilerOutput;
	}

	public int getRunTime() {
		return runTime;
	}

	public int getRunMemory() {
		return runMemory;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public int[] getGainPoint() {
		return gainPoint;
	}

	public int getTotalPoint() {
		return totalPoint;
	}
	
	
	
}
