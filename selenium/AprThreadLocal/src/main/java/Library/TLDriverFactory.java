package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TLDriverFactory {
	
	private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	public synchronized static void setTLDriver(String browser){
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			tlDriver = ThreadLocal.withInitial(() -> new ChromeDriver(OptionsManager.getChromeOptions()));
		} else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			tlDriver = ThreadLocal.withInitial(() -> new FirefoxDriver(OptionsManager.getFirefoxOptions()));
		}
	}
	
	public synchronized static WebDriver getTLDriver(){
		return tlDriver.get();
	}
	
	
	
	

}
