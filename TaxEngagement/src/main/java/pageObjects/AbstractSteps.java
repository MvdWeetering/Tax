package pageObjects;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractSteps {
	
	//invoke(SpecificatieAandeelhoudersObjecten.class, "NaamAandeelhouder").sendKeys("nieuwe waarde");
	
	
	//protected static WebDriver driver = Inloggen.GetDriver();

	public static WebElement invoke(@SuppressWarnings("rawtypes") Class objectClass,String lookupName, WebDriver driver) throws Exception{
		try {
			Method foundMethod = getMethodByName(objectClass, lookupName);
			return ((WebElement)foundMethod.invoke(null,driver));
		}
		catch (InvocationTargetException ite) {
			// This is an error situation, occurs when tooltip text balloon is absent 
			return null;
		}
		catch (Exception f) {
			f.printStackTrace();
			throw new Exception(f);
		}
	}
	
	/**
	 * 
	 * @param name
	 * @param objectClass
	 * @return
	 */
	protected static Method getMethodByName(@SuppressWarnings("rawtypes") Class objectClass,String lookupName ){
		
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
