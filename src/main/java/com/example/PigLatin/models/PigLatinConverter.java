package com.example.PigLatin.models;

public class PigLatinConverter {

    public String convertToPigLatin(String text){
        String[] words = text.split(" ");
        String pigSentence = "";

        for (String word : words){
            String punctuation = getPunctuation(word);
            word = word.replaceAll("[^a-zA-Z]+", "");
            if (startsWithVowel(word)){
                pigSentence += word + "ay" + punctuation + " ";
            } else {
                pigSentence += swapConsonants(word) + punctuation + " ";
            }
        }
        pigSentence = capitalizeFirstLetter(pigSentence);
        return pigSentence;
    }

    /**
     *
     * @param text
     * @return returns true if text starts with vowel
     */
    public boolean startsWithVowel(String text){
        return text.matches("^[aeiouAEIOU].*");
    }

    public String swapConsonants(String text){
        String beginning = text.replaceAll(".*?([aeiouAEIOU].*)", "$1");
        String end = text.replaceAll("([^aeiouAEIOU]*).*", "$1");
        return beginning + end + "ay";
    }


    public String capitalizeFirstLetter(String text){
        text = text.substring(0, 1).toUpperCase() + text.substring(1);
        return text;
    }

    public String getPunctuation(String text){
        if (text.matches(".*[.,!?]+$")){
            return text.replaceAll(".*([.,!?]+$)", "$1");
        } else {
            return "";
        }
    }
}
