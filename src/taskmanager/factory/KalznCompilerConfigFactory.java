package taskmanager.factory;


import java.io.File;
import java.io.IOException;
import java.util.Map;

import taskmanager.exception.CompilerException;
import taskmanager.info.KalznCompiler;
import taskmanager.util.KalznConfigFileAnalyser;

public class KalznCompilerConfigFactory {
	public static KalznCompiler createKalznCompiler(Map<String, String> config) throws CompilerException {
		return null;
		
	}
	public static KalznCompiler createKalznCompiler(File compilerConfigFile) throws IOException{
		return createKalznCompiler(KalznConfigFileAnalyser.analyseFile(compilerConfigFile));
	}
	public static KalznCompiler createKalznCompiler(String compilerConfigFilePaths) throws IOException{
		return createKalznCompiler(new File(compilerConfigFilePaths));
	}
	public static KalznCompiler[] createKalznCompilers(String directory) throws IOException{
		return null;
	}
}
