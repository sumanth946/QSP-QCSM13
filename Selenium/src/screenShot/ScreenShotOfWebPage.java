package screenShot;

import java.time.LocalDateTime;
import java.util.Date;

public class ScreenShotOfWebPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String timeStamp = LocalDateTime.now().toString().replace(":", "-") ;
		System.out.println(timeStamp);

		//Alternative class for LocalDateTime
		
		Date date = new Date();
		System.out.println(date);
	}

}
