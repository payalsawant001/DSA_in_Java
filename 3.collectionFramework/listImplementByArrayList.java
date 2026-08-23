import java.util.*;

public class listImplementByArrayList {
    
    public static void main(String args[]){
        List<String> name = new ArrayList<>();
        
        name.add("Alex");
        name.add("Brian");
        name.add("Charlie");
        name.add("David");
        name.add("Ethan");
        
        System.out.println(name);
        
        name.add(3, "Frank");
        name.set(5, "George");
        name.remove(2);
        name.remove(String.valueOf("Frank"));
        
        System.out.println(name);
        
        System.out.println(name.indexOf("Brian"));
        System.out.println(name.contains("Charlie"));
        System.out.println(name.size());
        
        name.removeIf(i -> i.equals("David"));
        
        for(String i : name){
            System.out.println(i);
        }
    }
}
