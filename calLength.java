package Line_Comparsion_length.Day5UC1_LengthOfLine;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import LineCoordinates.Set2UC_1.App;


class Base
{	private static final Logger Log=LogManager.getLogger(App.class);
	int x1=2,y1=3,x2=6,y2=12;
	double length;
	public void show()
	{
	    length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        Log.debug("\nLength of line will be::"+length);

	}
}

public class calLength {

	public static void main(String[] args) 
	{
        Base obj = new Base();
        obj.show();
	}

}
