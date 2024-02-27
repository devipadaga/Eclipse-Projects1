package Screenshot;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class RetryListenerClass implements IRetryAnalyzer{
	
	int counter=0;
	int retrylimit=3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(counter<retrylimit)
		{
			counter++;
			return true;
		}
		return false;
	}

	
	
	}
	
	


