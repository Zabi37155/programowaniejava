package pl.lublin.wsei.java.cwiczenia.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {


    public static void main(String[] args) {

        String exItem = "\t\t<item>\n" +
                "\t\t\t<title><![CDATA[Infografika - Powszechny Spis Ludności 1921]]></title>\n" +
                "\t\t\t<media:content>\n";

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*\\]\\");
        Matcher m = pat.matcher(exItem);
        if (m.find())
            System.out.println("Znaleziono tytuł: " + m.group(1));
        else
            System.out.println("Nie znaleziono tytułu . . .");

    }
}
