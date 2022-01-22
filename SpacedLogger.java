package CodingProjectWeek5;



public class SpacedLogger implements Logger{

	String Log = new String();
	String Error = new String();	
	
	@Override
	public void Log(String Log) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < Log.length(); i++) {
		   if (i > 0) {
		      result.append(" ");
		    }

		   result.append(Log.charAt(i));
		}

		System.out.println(result.toString());
		
	}

	@Override
	public void Error(String Error) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < Error.length(); i++) {
		   if (i > 0) {
		      result.append(" ");
		    }

		   result.append(Error.charAt(i));
		}

		System.out.println("Error: " + result.toString());
		
	}

}
