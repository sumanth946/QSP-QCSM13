package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingFlipkartSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/?ef_id=c257359afd4f136253b554d791ff059e:G:s&s_kwcid=AL!739!10!76347474199615!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");
	driver.close();
		

	}

}
