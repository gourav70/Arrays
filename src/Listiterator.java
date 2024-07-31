import java.util.*;

class Gfg{
    public static void main (String[] args) {
        
        // Create a List
        List<Integer> list = new ArrayList<Integer>();
    
        // Add element to List
        list.add(10);
        list.add(20);
        list.add(30);
        
        // Iterator pointing to position just after 
        // last element
        ListIterator<Integer> it = list.listIterator(list.size());
        
        // While there is a previous element of the 
        // current iterator
        while(it.hasPrevious())
        {   
            // Print the previous element and decrement
            // iterator by one position
            System.out.println(it.previous());
        }
    }
}
