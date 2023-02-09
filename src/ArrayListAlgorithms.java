import java.util.*;

public class ArrayListAlgorithms {


    public static boolean containsTarget(ArrayList<String> stringList, String target) {
        for (String word : stringList) {
            if (word.indexOf(target) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int belowAverage(ArrayList<Integer> intList) {
        int sum = 0;
        for (int i : intList) {
            sum += i;
        }
        double average = (double) sum / intList.size();
        int count = 0;
        for (int x : intList) {
            if (x < average) {
                count++;
            }
        }
        return count;
    }

    public static void replaceWithCaps(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            String word = wordList.get(i);
            String lastLetter = word.substring(word.length() - 1);
            if (lastLetter.equals("s")) {
                wordList.set(i, word.toUpperCase());
            }
        }
    }

    public static int indexOfMinimum(ArrayList<Integer> intList) {
        int min = intList.get(0);
        int index = 0;
        for (int i = 1; i < intList.size(); i++) {
            if (intList.get(i) < min) {
                min = intList.get(i);
                index = i;
            }
        }
        return index;
    }

    public static boolean areIdentical(ArrayList<Integer> numList1, ArrayList<Integer> numList2) {
        for (int i = 0; i < numList1.size(); i++) {
            if (numList1.get(i) != numList2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static void removeOdds(ArrayList<Integer> numList) {
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 != 0) {
                numList.remove(i);
                i--;
            }
        }
    }

    public static void wackyVowels(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            String w = wordList.get(i);
            if (w.indexOf("a") != -1 || (w.indexOf("e") != -1 || (w.indexOf("i") != -1 || (w.indexOf("o") != -1 || (w.indexOf("a") != -1))))) {
                wordList.remove(i);
                i--;
            } else {
                wordList.add(i, wordList.get(i));
                i++;
            }
        }
    }

    public static void duplicateUpperAfter(ArrayList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            wordList.add(i + 1, wordList.get(i).toUpperCase());
            i++;
        }
    }

    public static void duplicateUpperEnd(ArrayList<String> wordList) {
        int size = wordList.size();
        for (int i = 0; i < size; i++) {
            String word = wordList.get(i).toUpperCase();
            wordList.add(word);
        }
    }

    public static ArrayList<String> parseWordsAndReverse(String sentence) {
        ArrayList<String> sen = new ArrayList<String>();
        String newSen = sentence;
        int index = 0;
        while (newSen.indexOf(" ") != -1) {
            index = newSen.indexOf(" ");
            String word = newSen.substring(0, index);
            sen.add(0, word);
            newSen = newSen.substring(index + 1);
        }
        sen.add(0, newSen);
        return sen;
    }

    public static void removeDuplicates(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size(); i++) {
            for (int j = i + 1; j < intList.size(); j++) {
                if (intList.get(i) == intList.get(j)) {
                    intList.remove(j);
                    j--;
                }
            }
        }


    }

    public static void moveBWords(ArrayList<String> wordList) {
        int next = 0;
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).substring(0, 1).equals("b")) {
                String remove = wordList.remove(i);
                wordList.add(next, remove);
                next++;
            }

        }
    }

    public static ArrayList<Integer> modes(int[] numList) {
         List num = Arrays.asList(numList);
        //ArrayList<Integer> mode = new ArrayList<Integer>();
        int mostCommon = 0;
        int mostCommonFrequency = 0;
        for (int i = 0; i < num.size() - 1; i++) { //traverse through the ArrayList
            int currentFrequency = 1;
            for (int j = i + 1; j < num.size(); j++) { //traverse through rest of ArrayList
                if (num.get(j) == num.get(i)) {
                    // if any element matches current element being checked, add 1 to frequency
                    currentFrequency++;
                }
            }
            if (currentFrequency > mostCommonFrequency) {
                mostCommon = num.get(i);      // replaces current mode if new most common element
                mostCommonFrequency = currentFrequency;
            }
        }
        return mostCommon;

    }

}



