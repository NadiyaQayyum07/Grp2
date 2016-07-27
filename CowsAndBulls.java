/**
 * Created by ashoka on 7/27/2016.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CowsAndBulls  {

    public static void main(String[] args) throws FileNotFoundException {
        String filepath = "src\\sowpods.txt";
        File file = new File(filepath);
        Scanner scanner = new Scanner(file);

        ArrayList<String> fourLetterWordsDict = readWords(scanner);

        String humnanPlayerWord = args[0];

        Player human = new Player(humnanPlayerWord);
        Player computer = new Player(guessWord(fourLetterWordsDict));

    }

    private static String guessWord(ArrayList<String> fourLetterWordDict) {
        String guessWord = "";

        int randomNumber =(int)(Math.random() * fourLetterWordDict.size());
        guessWord = fourLetterWordDict.get(randomNumber);

        return guessWord;
    }

    private static ArrayList<String > readWords(Scanner scanner) {
        ArrayList<String> words = new ArrayList<>();

        while (scanner.hasNext()){

            String word = scanner.next();
            if(word.length() == 2){
                words.add(word);
            }
        }

        return words;
    }
}
