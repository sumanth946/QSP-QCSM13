package selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchingTheEdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.edge.driver", "./driver.msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        }

}
