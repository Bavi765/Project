import java.util.ArrayList;
import java.lang.StringBuilder;
import java.util.*;
public class question {
    String quest = new String();
    String[] answers = new String[255];
    public void checkChars(){
        quest = quest.substring(0, Math.min(quest.length(), 255));
        for(String a : answers){
            a = a.substring(0,Math.min(a.length(), 255));
        }
    }
}
