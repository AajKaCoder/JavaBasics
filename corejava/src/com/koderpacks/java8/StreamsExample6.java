package com.koderpacks.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * 
 * This class illustrates use of reduce and flatmap operation.
 * @author KoderPacks
 *
 */
public class StreamsExample6 {

	
	public static void main(String[] args) {
		
		/*reduce is a terminal operation,
		 * that return an object of optional type,after performing the Bi-Function operation.
		 * In the example below ,we are concatenating the strings with comma in one single string*/
		Optional<String> reduce = Stream.of("ajit","raj","sumit","uday").
									reduce((s1,s2)->{System.out.println("reduce: "+s1+" && "+s2);return s1.concat(",").concat(s2);});
		System.out.println(reduce.get());
		
		/*In the example below ,we used the overloaded reduce method,with 1st argument as the initial value for the 
		 * reduce operation Bi-Function method*/
		Stream.of("ajit","raj","sumit","uday").
		filter(s->{System.out.println("filter: "+s);return s.length()>3;}).
		reduce("kumar",(s1,s2)->{System.out.println("reduce: "+s1+" && "+s2);return s1.concat(",").concat(s2);});
		
		List<Integer> list1=Arrays.asList(1,2,3,4);
		List<Integer> list2=Arrays.asList(12,21,32,42);
		List<Integer> list3=Arrays.asList(18,26,32,41);
		List<List<Integer>> finalList=Arrays.asList(list1,list2,list3);
		finalList.stream().
		flatMap(s->{System.out.println("flatMap: "+s);return s.stream();}).
		forEach(s->System.out.println("forEach: "+s));
		
		
		
		
	}
}
