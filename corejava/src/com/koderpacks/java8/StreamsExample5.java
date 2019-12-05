package com.koderpacks.java8;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This class illustrates few other popular terminal operation(collect,allMatch)
 * 
 * @author KoderPacks
 *
 */
public class StreamsExample5 {

	public static void main(String[] args) {
		
		/* Collect is terminal operation that lets you store the stream as data structure,
		 * on which you can do additional activities,
		 * in the example below we are collecting the modified stream in a list */
		List<String> collect = Stream.of("ajit","raj","sumit","uday","abhishek","avinash").
		sorted((s1,s2)->s1.length()-s2.length()).collect(Collectors.toList());
		
		collect.forEach(s->System.out.println(s));
		
		
		/*allMatch return true if all elements matches the condition or if the stream is empty*/
		System.out.println(collect.stream().allMatch(s->s.length()>=3));
		
		
		/*distinct is an intermediate operation ,return stream of distinct elements and count is a terminal 
		 *operation return the count of elements in the stream*/
		System.out.println(Stream.of("ajit","raj","sumit","uday","ajit","uday").distinct().count());
		
		
		/*findAny is terminal operation that return object of type Optional,which 
		 * may or may not contain non null values.*/
		Optional<String> optional = Stream.of("ajit","raj","sumit","uday","ajit","uday").findAny();
		System.out.println(optional.get());
		
		
	}
}
