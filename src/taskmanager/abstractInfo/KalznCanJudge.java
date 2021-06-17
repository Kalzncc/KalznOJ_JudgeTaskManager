package taskmanager.abstractInfo;

import java.io.File;
/**
 * The interface define the problem data info
 * @author 22612
 *
 */
public interface KalznCanJudge {
	
	File[] getInputFiles();
	File[] getOutputFiles();
	
	boolean isSPJ();
	File getSPJFile() throws RuntimeException;
}
