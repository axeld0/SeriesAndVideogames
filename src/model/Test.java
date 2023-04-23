package model;


import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Test {

    VideoGame[] vg = new VideoGame[5];
    Series[] s = new Series[5];

    public void constructArray ()
    {
        vg[0] = new VideoGame("Las aventuras de Pepe",23, "Capcom", "Horror");
        vg[1] = new VideoGame("Cacona Street II",34, "Konami", "Fight");
        vg[2] = new VideoGame("Cacona Street III",100, "Konami", "Fight");
        vg[3] = new VideoGame("Dinosaurios con diarrea",34, "EA Sports", "Soccer");
        vg[4] = new VideoGame("Robot Wifes",9, "Arcadia Games", "RPG");
        s[0] = new Series("Las viudas alegres",2, "JUan carlos Verga", "horror");
        s[1] = new Series("Las viudas no tan alegres",1, "JUan carlos Verga", "horror");
        s[2] = new Series("Gran peliado",9, "Cielo Negro", "Reality Show");
        s[3] = new Series("AA BB",65, "Charlie Tografia", "Comedy");
        s[4] = new Series("Las viudas ninjas",6, "Hernan Verga", "Action");
    }

    public void lendSomeProducts()
    {
        Random r = new Random();
        for(int i = 0 ; i < vg.length ; i++)
        {
            if(r.nextBoolean())
            {
                vg[i].lendProduct();
                s[i].lendProduct();
            }
        }
    }

    public int howMuchHaveWeLend()
    {
        int lend = 0;
        for(int i = 0 ; i < vg.length ; i++)
            if (vg[i].isLend() || (s[i].isLend() == true)) {
                lend++;
                if (vg[i].isLend() && s[i].isLend()) {
                    lend++;
                }
                vg[i].returnProduct();
                s[i].returnProduct();
            }
        return lend;
    }
}

