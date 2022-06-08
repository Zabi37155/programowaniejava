package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {

    public Infografika(String tekst){

        String tytul;
        String adresstrony;
        int szerokosc;

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*\\]\\");
        Matcher m = pat.matcher(tekst);
        if (m.find())
            tytul = m.group(1);
        else
            tytul = "";
        pat = Pattern.compile("<link>(.*)</link>)");
        Matcher m = pat.matcher(tekst);
        if (m.find())
            adresstrony = m.group(1);
        else
            adresstrony = "";
        pat = Pattern.compile("<width=\"(.*)\" height);
        Matcher m = pat.matcher(tekst);
        if (m.find())
            szerokosc = Integer.parseInt(m.group(1));
        else
            szerokosc = 0;

    }
}





    }
}
