package CodingProjectWeek5;
import java.io.*;

public class AsteriskLogger implements Logger{

	String Log = new String();
	String Error = new String();	
	
	@Override
	public void Log(String Log) {
		System.out.println("***"+Log+"***");
		
	}

	@Override
	public void Error(String Error) {

		System.out.println("************************");
		System.out.println("***"+"loop will not work"+"***");
		System.out.println("************************");
		}
		
	
	
	
	
}
