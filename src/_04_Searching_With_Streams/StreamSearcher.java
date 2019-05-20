package _04_Searching_With_Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class StreamSearcher {
	// 1. This method takes an array of Strings and a String. The method returns the number
	// of times the String parameter appears in the String array. This method will
	// use Streams to help us out.
	int count = 0;
	public long containsCount(String[] strArr, String strToCount) {
		count = 0;
		//2. Convert the String array to a stream
		Stream<String> streamArr = Arrays.stream(strArr);
		//3. Use the filter method with a lambda to extract all the String
		
		streamArr.forEach((e)->{
			if(e.equals(strToCount)) {
				count++;
			}
		});
		//   elements that match the String parameter.
		
		//4. Return the count of the filtered stream.
		return count;
	}
}
