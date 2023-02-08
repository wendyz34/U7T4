import java.util.ArrayList;

public class ArrayListAlgorithms {
/*
    /**
     * Returns true if any of the elements in stringList contain
     * target as a substring; false otherwise.  Use indexOf instead of contains
     * for AP practice! (although in reality, contains is preferred)
     * <p>
     * Does NOT mutate (modify) elements of stringList.
     * PRECONDITION: stringList.size() > 0
     *
     * @param stringList original arraylist of Strings
     * @return true if target is found in any of the strings, false otherwise
     */
    /*public static boolean containsTarget(ArrayList<String> stringList, String target) { /* implement this method!
        for (String word : stringList) {
            if (word.indexOf(target) != -1) {
                return true;
            }
        }
        return false;
    }
    /** Returns number of elements in intList that are less than the
     *  average of all elements.
     *
     *  Does NOT mutate (modify) elements of intList.
     *  PRECONDITION: intList.size() > 0
     *
     *  @param intList  original arraylist of Integers
     *  @return  the number of ints in intList that are less than the average
     */
  /*  public static int belowAverage(ArrayList<Integer> intList)
    { /* implement this method!
        int sum =0;
        for(int i : intList){
            sum+=i;
        }
        double average = (double)sum/intList.size();
        int count =0;
        for (int x: intList){
            if(x<average){
                count++;
            }
        }
        return count;
    }
public static void replaceWithCaps(ArrayList<String> wordList) {
    for(int i=0; i<wordList.size();i++){
        String word =wordList.get(i);
        String lastLetter = word.substring(word.length()-1);
        if(lastLetter.equals("s")){
           wordList.set(i,word.toUpperCase());
        }
    }
}
    public static int indexOfMinimum (ArrayList<Integer> intList){
        int min = intList.get(0);
        int index=0;
        for(int i=1;i<intList.size();i++){
            if(intList.get(i)<min){
                min = intList.get(i);
                index =i;
            }
        }
        return index;
    }
public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2) {
    for (int i =0; i<numList1.size();i++){
        if (numList1.get(i)!=numList2.get(i)){
            return false;
        }
    }
    return true;
}
public static void removeOdds(ArrayList<Integer> numList) {
    for(int i =0; i<numList.size();i++){
        if (numList.get(i)%2!=0){
            numList.remove(i);
            i--;
        }
    }

}
public static void wackyVowels(ArrayList<String> wordList) {
    for (int i =0; i<wordList.size();i++){
        String w= wordList.get(i);
        if (w.indexOf("a")!=-1||(w.indexOf("e")!=-1||(w.indexOf("i")!=-1||(w.indexOf("o")!=-1||(w.indexOf("a")!=-1))))){
            wordList.remove(i);
            i--;
        }else{
            wordList.add(i,wordList.get(i));
            i++;
        }
    }
}
public static void duplicateUpperAfter(ArrayList<String> wordList) {
    for(int i =0; i<wordList.size();i++){
        wordList.add(i+1, wordList.get(i).toUpperCase());
        i++;
    }
}
public static void duplicateUpperEnd(ArrayList<String> wordList) {
    int size = wordList.size();
    for (int i =0; i<size;i++){
        String word = wordList.get(i).toUpperCase();
        wordList.add(word);
    }
}

    //continue
public static ArrayList<String> parseWordsAndReverse(String sentence) {
    ArrayList<String> sen = new ArrayList<String>();
    while(sentence.indexOf(" ")==0){
      int index = sentence.indexOf(" ");
      sen.add(sentence.substring(index));
      index++;

    }
    return sen;
}
*/
public static void removeDuplicates(ArrayList<Integer> intList) {
for(int i =0; i<intList.size();i++){
    for (int j = i+1; j<intList.size()-1;i++){
        if(intList.get(i)==intList.get(j)){
            intList.remove(j);
        }
    }
}
}
}