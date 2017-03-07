package pageObjects;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import codebase.Inloggen;

public abstract class AbstractSteps {
	
	//invoke(SpecificatieAandeelhoudersObjecten.class, "NaamAandeelhouder").sendKeys("nieuwe waarde");
	
	protected WebDriver driver = Inloggen.GetDriver();

	public WebElement invoke(@SuppressWarnings("rawtypes") Class objectClass,String lookupName) throws Exception{
		try {
			Method foundMethod = getMethodByName(objectClass, lookupName);
			return ((WebElement)foundMethod.invoke(null,driver));
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
            		  //method.getName()
              		  return method;
            	  }
              }
        }
        return null;
	}
	
}
