import java.util.*;;

public class iterable {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Joe");
        list.add("Luna");
        list.add("Peter");
        list.add("Noah");
        list.add("Nick");
        //Using Iterator traverse through list and print all list elements.
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //For each loop also uses Iterator inside it so it dependent on iterator.
        for(String name : list){
            System.out.println(name);
        }
    }
}
