import parsers.ParserFile;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)  {

        ParserFile parserFile = new ParserFile();
        List<String> list = new ArrayList<>();
        list.add("listOne.xml");
        list.add("listTwo.xml");
        list.add("listThree.xml");

        for(String string : list){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    parserFile.startParse(string);
                }
            });
            thread.start();
        }



    }

}
