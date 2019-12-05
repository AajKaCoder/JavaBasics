package com.koderpacks.java8;

import java.util.stream.Stream;

/**
 * Class illustrates stream of single empty string and streams are closed 
 * once a terminal operation is called on them and throws exception after it gets used again.
 * 
 * @author KoderPacks
 *
 */
public class StreamsExample1 {
	
public static void main(String[] args) {
	Stream<String> streamOfString = Stream.of("");//using just one value
	streamOfString.filter(s->s.length()==0).forEach((s)->System.out.println("we have one empty String")); //prints the string
	streamOfString.filter(s->s.length()>0).forEach((s)->System.out.println("we have one empty String"));	//throws exception as stream is closed in above line
}
}
