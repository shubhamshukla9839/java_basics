package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class a2 {


    public static void main(String[] args)
    {
         List<String> names=Arrays.asList("sam","peter","sam","shubham","saurabh","shubham");

         //before
         List<String> uniquelist = new ArrayList<>();
         for(String name:names)
         {
             if(!uniquelist.contains(name))
             {
                  uniquelist.add(name);
             }
         }
         System.out.println("unique list:    "+uniquelist);


         //after
         List<String> unique1=names.stream()
                          .distinct()
                          .collect(Collectors.toList());
         System.out.println("unique1:   "+unique1);                 
         
    }
    
}