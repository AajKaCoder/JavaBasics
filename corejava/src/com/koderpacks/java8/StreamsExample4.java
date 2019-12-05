package com.koderpacks.java8;

import java.util.stream.Stream;

/**
 * This class illustrates the usage of sorted intermediate operation.sorted gets executed horizontally ,
 * unlike map and filter which gets executed once for each element when terminal operation are invoked.
 * sorted gets executed completely before invoking any other intermediate or terminal operation occurring after it.
 * @author KoderPacks
 *
 */
public class StreamsExample4 {

	
	public static void main(String[] args) {
		
		System.out.println("=========natural order sorting================");
		
		/*the below example shows the sorting using natural order.
		 * sorted gets executed completely,only after that ,foreach gets called. */
		Stream.of("ajit","raj","avinash","uday","sumit","abhishek").
		sorted().forEach(s->System.out.println("forEach: "+s));	
		
		System.out.println("=========sorting based on length ,in descending order===========");
		
		/*In the below example,we can see the execution of sorted method happening before*/
		Stream.of("ajit","raj","avinash","uday","sumit","abhishek").
		sorted((s1,s2)->{System.out.println("comparing: "+s1 +" && "+ s2);return s2.length()-s1.length();}).
		forEach(s->System.out.println("forEach: "+s));
		
		
	}
}
