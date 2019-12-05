package com.koderpacks.java8;

import java.util.stream.Stream;

/**
 * 
 * Class to show the parallel stream in 
 * @author Koderpacks
 *
 */
public class StreamsExample7 {

	public static void main(String[] args) {
		Stream.of("1","2","4","12","13","8","9","0","45","78","32","21").parallel().
		map(s->{System.out.format("Mapper: Thread [%s] working on value [%s] \n",Thread.currentThread().getName(),s);return Integer.valueOf(s);}).
		sorted((s1,s2)->{System.out.format("sort: Thread [%s] printing value [%d,%d] \n",Thread.currentThread().getName(),s1,s2);return s2-s1;}).
		forEach(s->{System.out.format("forEach: Thread [%s] printing value [%d] \n",Thread.currentThread().getName(),s);});
	}
}
