package hashmap;

import java.util.HashMap;

public class HashMapDemo {
    @SuppressWarnings("unchecked")
    public static void main(String args[]) {
        // create hash map
        @SuppressWarnings("rawtypes")
        HashMap newmap = new HashMap();      
        
        // populate hash map
        newmap.put(1, "tutorials");
        newmap.put(2, "point");
        newmap.put(3, "is best");
        
        System.out.println("Values before remove: "+ newmap);
        
        // remove value for key 2
        newmap.remove(8);

        System.out.println("Values after remove: "+ newmap);
     }    
  }
