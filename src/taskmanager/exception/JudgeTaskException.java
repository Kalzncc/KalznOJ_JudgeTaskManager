package taskmanager.exception;
/**
 * This is judge task exception.
 * include task construct and run time exception
 * @author 22612
 *
 */
public class JudgeTaskException extends RuntimeException{
	/**
	 * 
	 */
	public final static short TASK_CONSTRUCT_ERROR = 0;
	public final static short TASK_RUN_ERROR = 0;
	
	private static final long serialVersionUID = 1L;
	
	public JudgeTaskException(String message, short errorCode) {
		super(message );
	}
	public JudgeTaskException(String message) {
		super(message);
	}
}
