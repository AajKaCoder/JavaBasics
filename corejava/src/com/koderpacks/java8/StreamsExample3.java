package com.koderpacks.java8;

import java.util.stream.Stream;

/**
 * 
 * This example shows how the ordering of intermediate operation can reduce 
 * the number of execution of stream operation
 * @author KoderPacks
 *
 */
public class StreamsExample3 {

	public static void main(String[] args) {
		System.out.println("=====using filter after map operation=====");

		/*In the example below,we want to print the name in uppercase which has length greater than 6.
		 *Since we are using Stream filter operation after the map operation,the map operation gets executed for
		 *all the strings even though we only needed to print the ones with length greater than 6.*/
		Stream.of("ajit","raj","sumit","abhishek","uday","avinash").
		map(s->{System.out.println("map: "+s);return s.toUpperCase();}).
		filter(s->{System.out.println("filter: "+s);return s.length()>6;}).
		forEach(s->System.out.println("forEach: "+s));
		
		System.out.println("=====using filter before map operation=====");

		
		
		/*In the example below ,we have used the filter operation before map,which reduces the execution of
		 * map greatly,and only executing it for the values which we want as the output.*/
		Stream.of("ajit","raj","sumit","abhishek","uday","avinash").
		filter(s->{System.out.println("filter: "+s);return s.length()>6;}).
		map(s->{System.out.println("map: "+s);return s.toUpperCase();}).
		forEach(s->System.out.println("forEach: "+s));
		
	}
}
