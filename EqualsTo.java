import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


class Line 
{
	public static final Logger Log=LogManager.getLogger(Line.class);
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
class Length extends Line
{
	public void lengthOf()
	{
    	LengthOfFirstLine = (int) Math.sqrt((FirstLineX2 - FirstLineX1) * (FirstLineX2 - FirstLineX1) + (FirstLineY2 - FirstLineY1) * (FirstLineY2 - FirstLineY1));
        Log.debug(LengthOfFirstLine);
        
         LengthOfSecondLine=(int) Math.sqrt((SecondLineX2 - SecondLineX1) * (SecondLineX2 - SecondLineX1) + (SecondLineY2 - SecondLineY1) * (SecondLineY2 - SecondLineY1));
        Log.debug(LengthOfSecondLine);
        
	}
	
	public void equals(int LengthOfFirstLine, int  LengthOfSecondLine)
	{
		this.LengthOfFirstLine=LengthOfFirstLine;
		this.LengthOfSecondLine= LengthOfSecondLine;
	}
	
}

public class EqualsTo 
{	
	private static final Logger Log=LogManager.getLogger(Line.class);
	public static void main(String args[]) 
	{
		Length obj = new Length() ;

		obj.getData();
		obj.lengthOf();
		obj.equals(obj.LengthOfFirstLine,obj.LengthOfSecondLine);

		if (obj.LengthOfFirstLine == obj.LengthOfSecondLine) 
		{
			Log.debug("\n Lines are equals");
		}
		else
		{
			Log.debug("\n Lines are not equals");
		}
	}
	

}
