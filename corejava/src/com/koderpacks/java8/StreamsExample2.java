package com.koderpacks.java8;

import java.util.stream.Stream;

/**
 * 
 * Class to show a stream operation without a terminal operation and with one terminal operation.
 * filter is used as the intermediate function and foreach is used as terminal function in this example.
 * @author KoderPacks
 *
 */
public class StreamsExample2 {
public static void main(String[] args) {
	
	Stream.of("ajit","kumar","singh","rai","shukla")			//stream of multiple strings,when 
	  .filter(s -> {
					System.out.println("filter :"+s);			//nothing gets printed here,as we have not given a terminal operation
					return s.startsWith("a");
					});
	
	Stream.of("ajit","kumar","singh","rai","shukla")			//stream of multiple strings,when 
	  .filter(s -> {
					System.out.println("filter :"+s);		//here the the processing of string starts vertically,
					return s.startsWith("a");				//for example, first ajit gets passed through filter and then foreach is called 
					})										//and then the same for each string.
	  .forEach((s)->System.out.println("for each : "+s));	
}
}
