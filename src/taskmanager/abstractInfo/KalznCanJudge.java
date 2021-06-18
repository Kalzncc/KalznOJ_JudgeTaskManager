package taskmanager.abstractInfo;

import java.io.File;
import java.io.IOException;
/**
 * The interface define the problem data info
 * @author 22612
 *
 */
public interface KalznCanJudge {
	
	
	int getCaseNumber(); // get the number of cases
	File[] getInputFiles() throws IOException; // get the input files
	File[] getOutputFiles() throws IOException; // get the output files
	int[] getCasePoints(); // get the each cases' points, if the CanJudge is expected to judge with ACM-ICPC way, default all is 0
	int getTimeLimit(); // get the CanJudge's CPU time limit
	int getMemLimit(); // get the CanJudge's memory limit
	
	
	
	boolean isSPJ(); // whether the "Can Judge" need to be judged with special judge; 
	File getSPJFile() throws RuntimeException; // get the spj judge executable file, if the CanJudge is not spj problem, throws the RuntinmeException.
}
