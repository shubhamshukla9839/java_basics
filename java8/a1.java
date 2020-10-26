package java8;

import java.util.stream.IntStream;

public class a1 {
    public static void main(String[] args){
    int total=IntStream.rangeClosed(0, 10)
        .map(Integer:: new)
        .sum();

    System.out.println(total)    ;
    
}
}