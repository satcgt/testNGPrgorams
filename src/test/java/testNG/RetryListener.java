package testNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListener implements IAnnotationTransformer {
 
	@Override
	public void transform(ITestAnnotation annotation , Class TestNGExp12_retry , Constructor testConstructor , Method login){
		annotation.setRetryAnalyzer(IRetryClass.class);
	}
}
