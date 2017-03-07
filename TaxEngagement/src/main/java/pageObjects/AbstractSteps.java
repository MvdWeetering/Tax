package pageObjects;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import codebase.Inloggen;

public abstract class AbstractSteps {
	
	protected WebDriver driver = Inloggen.GetDriver();

	public WebElement invoke(@SuppressWarnings("rawtypes") Class objectClass,String lookupName) throws Exception{
		try {
			return ((WebElement)getMethodByName(objectClass, lookupName).invoke(driver));
		} catch (Exception e) {
			throw new Exception(e);
		}
	}
	
	/**
	 * 
	 * @param name
	 * @param objectClass
	 * @return
	 */
	protected Method getMethodByName(@SuppressWarnings("rawtypes") Class objectClass,String lookupName ){


        for (Method method : objectClass.getDeclaredMethods()) {
              if (method.isAnnotationPresent(FieldName.class)) {
                     
            	  method.setAccessible(true);
            	  
            	  // find annotation value
            	  FieldName fieldNameAnnotation = method.getAnnotation(FieldName.class);
            	  
            	  if(fieldNameAnnotation.name().equalsIgnoreCase(lookupName)){
            		  return method;
            	  }
            	  
              }
        }
        return null;

	}
	
}
