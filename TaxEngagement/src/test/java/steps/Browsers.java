package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public enum Browsers {
	IE("ie",InternetExplorerDriver.class),
	CHROME("chrome", ChromeDriver.class),
	FIREFOX("firefox", FirefoxDriver.class);
	
    private String browserInCucumber="";
    private Class<? extends WebDriver> browserWebDriver;
    
    private Browsers(String browser,Class<? extends WebDriver> browserWebDriver){        
          this.setBrowerInCucumber(browser);    
          this.setBrowserWebDriver(browserWebDriver);
    } 

    @Override
    public String toString(){
         return getBrowserInCucumber();
    }  

    public static Browsers toEnum(String paramString) throws EnumConstantNotPresentException {
        for (Browsers c : Browsers.values()) {
            if (c.toString().equalsIgnoreCase(paramString)) {
                return c;
            }
        }                          
        throw new EnumConstantNotPresentException(Browsers.class,paramString);
    }

	public Class<? extends WebDriver> getBrowserWebDriver() {
		return browserWebDriver;
	}

	public void setBrowserWebDriver(Class<? extends WebDriver> browserWebDriver) {
		this.browserWebDriver = browserWebDriver;
	}

	public String getBrowserInCucumber() {
		return browserInCucumber;
	}

	public void setBrowerInCucumber(String browserInCucumber) {
		this.browserInCucumber = browserInCucumber;
	}
}
