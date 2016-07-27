/**
 * Created by ashoka on 7/27/2016.
 */

public class Player {

    private String myWord;
    public  String guessWord;

    public Player(String myWord) {
        this.myWord = myWord;
    }

    public void play(){


    }

    public boolean isWin(){

        return false;
    }

    public String guessWord(){

        return null;
    }

    public int tellMatchedCount(String anotherPlayerWord){

        return 1;
    }
}
