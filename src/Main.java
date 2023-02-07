import java.util.*;
public class Main {
    public static void main(String[]args) {

        //1
        /*
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Abby");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");
        names.add("Jim");

        System.out.println("BEFORE: " + names);

        // write a loop below to traverse names and insert "hi!" after any
        // name that contains the letter "i"

         for (int i =0;i<names.size();i++){
             if (names.get(i).contains("i")){
                 names.add(i+1,"hi!");
                 i++;

             }
         }

        System.out.println("AFTER: " + names);
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jesse");
        names.add("Bart");
        names.add("David");
        names.add("Abigail");
        names.add("Frank");
        names.add("Steph");
        names.add("Thomas");
        names.add("Jimmy");
        names.add("Joe");
        names.add("Klein");
        names.add("Daisy");

        System.out.println("BEFORE: " + names);

        // write a loop below to traverse names and REMOVE each name that
        // is exactly 5 letters
        for (int i =0; i<names.size();i++){
            if (names.get(i).length()==5){
                names.remove(names.get(i));
                i--;
            }
        }

        System.out.println("AFTER: " + names);*/
        ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("this", "list", "contains", "several", "words"));
        boolean contains = ArrayListAlgorithms.containsTarget(stringList, "is");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "v");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "words");
        System.out.println(contains);
        contains = ArrayListAlgorithms.containsTarget(stringList, "ia");
        System.out.println(contains);



    }
}
