package taskmanager.manager;

import java.util.PriorityQueue;

import taskmanager.info.KalznJudgeResult;
import taskmanager.info.KalznJudgeTask;
import taskmanager.manager.callbackInterface.ReceiveJudgeResult;
import taskmanager.runbox.callbackInterface.ReceiveRunResult;

public class KalznJudgeManager implements ReceiveRunResult, Runnable{
	
	private ReceiveJudgeResult pushUp;
	
	private int maxQueueNum;
	
	private int curQueueNum;
	
	private PriorityQueue<KalznJudgeTask> judgeQueue;
	
	public void addJudgeTask(KalznJudgeTask task) {
		synchronized (judgeQueue) {
			
			
			
		}
	}
	
	
	@Override
	public void receive(KalznJudgeResult result) {
		
		
		
		pushUp.receiveJudgeResult(result);
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
