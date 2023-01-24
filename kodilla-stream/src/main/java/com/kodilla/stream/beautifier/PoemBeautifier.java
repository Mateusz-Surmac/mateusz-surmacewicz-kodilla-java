package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String tekst, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(tekst);
        System.out.println(result);
    }
    public static String bigLetters(String tekst) {
        String result = tekst.toUpperCase();
        return result;
    }
    public static String loudEnd(String tekst) {
        String result = tekst + "!!!";
        return result;
    }
    public static String fullOfEmotions(String tekst) {
        String result = ":( :|" + tekst + ":) :0";
        return result;
    }
    public static String hide(String tekst) {
        String result = "hide";
        return result;
    }
}
