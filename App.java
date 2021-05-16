package Line_CComparator.Day5_UC3_LineComparision;

import java.util.Scanner;
import java.util.logging.LogManager;
import org.apache.logging.log4j.core.Logger;

class Line1
{
	Logger Log = LogManager.getLogger(Line1.class);
	public Scanner scan = new Scanner(System.in);
	
	int FirstLineX1, FirstLineY1, FirstLineX2, FirstLineY2, LengthOfFirstLine, LengthOfSecondLine;
	int SecondLineX1, SecondLineY1, SecondLineX2, SecondLineY2;
	int FirstLine,SecondLine;
	
	public void getData()
	{	
		Log.debug("\nEnter x1,y1 for First Line:");
		FirstLineX1 = scan.nextInt();
		FirstLineY1 = scan.nextInt();
		
		Log.debug("\nEnter x2,y2 for First Line:");
		FirstLineX2 = scan.nextInt();
		FirstLineY2 = scan.nextInt();
		
		Log.debug("\nEnter x1,y1 for Second Line:");
		SecondLineX1 = scan.nextInt();
		SecondLineY1 = scan.nextInt();
		
		Log.debug("\nEnter x2,y2 for Second Line:");
		SecondLineX2 = scan.nextInt();
		SecondLineY2 = scan.nextInt();
		
	}

}

class Length1 extends Line1 implements Comparable<Length1>
{
	public void lengthOf()
	{
    	LengthOfFirstLine = (int) Math.sqrt((FirstLineX2 - FirstLineX1) * (FirstLineX2 - FirstLineX1) + (FirstLineY2 - FirstLineY1) * (FirstLineY2 - FirstLineY1));
        Log.debug(LengthOfFirstLine);
        
         LengthOfSecondLine=(int) Math.sqrt((SecondLineX2 - SecondLineX1) * (SecondLineX2 - SecondLineX1) + (SecondLineY2 - SecondLineY1) * (SecondLineY2 - SecondLineY1));
        Log.debug(LengthOfSecondLine);
        
	}

	@Override
	public int compareTo(Length1 o) 
	{
		if (o.LengthOfFirstLine == o.LengthOfSecondLine) 
		{
			return 1;
		} 
		else
		{
			return -1;
		}
		
		
	}	
	
}

public class App 
{
	public static final Logger Log = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	
    	  	Length1 l1 = new Length1();
  		Length1 l2 = l1;	
  		l1.getData();
  		l1.lengthOf();
  		int compareResult = l1.compareTo(l2);
		
		if(compareResult>0) 
		{
			System.out.println("Line 2 is lengthy");
		}
		else if(compareResult<0) 
		{
			System.out.println("Line 1 is lengthy");
		}else {
			System.out.println("Lines are same");
		}

    }
}
