package genericLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	
	public int generateRandomNumber(int limit)
	{
		Random random = new Random();
		return random.nextInt(limit);
				
	}
	
	public String getCurrenttime()
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd_mm_yyyy_hh_mm_sss");
		return sdf.format(date);
		
	}

}
