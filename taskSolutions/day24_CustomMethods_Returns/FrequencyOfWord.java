package day24_CustomMethods_Returns;

public class FrequencyOfWord {
    public static void main(String[] args) {
        System.out.println(frequencyOfWord("Java java java python python", "java"));
    }

    public static int frequencyOfWord(String sentence, String word) {
        int numOfWord = 0;

        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        while(sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            numOfWord++;
        }

        return numOfWord;
    }
}

/*
	1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */