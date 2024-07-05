// Java code to illustrate functional
// interface using lambda expression

import java.util.Arrays;
import java.util.List;

class foreach
{
    public static void main(String args[])
    {
        // ArrayList to check the function
    	List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        // forEach() method takes the lambda expression
        // as it is a functional interface
        integerList.forEach(x -> System.out.println(x));
    }
}
