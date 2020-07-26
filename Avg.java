package epam.lambdaproject;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Avg {
	 public static void main(String args[])
	    {
	        IntStream stream1=IntStream.of(10,20,35,40,95,60,70,80,88);

	        OptionalDouble obj=stream1.average();

	        if(obj.isPresent())
	        {
	            System.out.println(obj.getAsDouble());
	        }
	        else
	        {
	            System.out.println(-1);
	        }
	    }
}
