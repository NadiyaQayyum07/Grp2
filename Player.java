/**
 * Created by ashoka on 7/27/2016.
 */

public class Player {

    private String myWord;
    public  String guessWord;
    public String opponentword;

    public Player(String myWord) {
        this.myWord = myWord;
    }

    public void play(){


    }



    public boolean isWin(){

        return myWord.equals(opponentword);
    }

    public String guessWord(){

        Arraylist.get((int)(Math.random()ArrayList.length()));

        return null;
    }

    public int tellMatchedCount(String anotherPlayerWord){
        char [] Word = anotherPlayerWord.toLowerCase().toCharArray();
        int count =0;
        for(char alphabet: Word){
            if(myWord.contains(alphabet)) count++;
        }
        return count;
    }
}
