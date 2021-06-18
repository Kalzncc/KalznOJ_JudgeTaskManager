package taskmanager.info;
/**
 * 
 * @author 22612
 *
 */
public class KalznCompiler {
	public final static short COMPILE=0, INTERPRETED = 1, COMPILE_THEN_INTERPRETED = 3;
	// language  type
	
	private int compilerID;
	
	private String compilerName;
	
	private short languageCompilerMode;
	
	private String compilerFileDirectory;
	
	private String interpreterFileDirectory;
	
	
}
