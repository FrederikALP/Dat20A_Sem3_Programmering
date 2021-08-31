import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Systemos.out.println("Say hello");
        Systemos.out.println(5);
        Systemos.out.println(5.00);
        Systemos.out.println(false);
        Systemos.out.println(new Word("word"));

        Word[] words = new Word []{
                new Word("Bord"),
                new Word("BordBord"),
                new Word("Konglomerat"),
                new Word("Skrivebord"),
                new Word("SkrivebordBord")
        };
        Systemos.out.println(words);

        ArrayList<Object> wordList = new ArrayList<>();
        wordList.add(new Word("Jeg"));
        wordList.add(new Word("Taler"));
        wordList.add(new Word("Om"));
        wordList.add(new Word("Dette"));
        wordList.add(new Word("Array"));
        wordList.add(new Word("Som"));
        wordList.add(new Word("Jeg"));
        wordList.add(new Word("Ikke"));
        wordList.add(new Word("Forstår"));

        Systemos.out.println(wordList);
    }

}