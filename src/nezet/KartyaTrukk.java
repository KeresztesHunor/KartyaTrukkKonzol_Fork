package nezet;

import modell.Pakli;
import java.util.Scanner;
import modell.Lap;

public class KartyaTrukk
{
    private static final Scanner sc = new Scanner(System.in);
    
    private final Pakli pakli;
    
    public KartyaTrukk()
    {
        pakli = new Pakli();
        for (int i = 0; i < 3; i++)
        {
            kirak();
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        ezVolt();
    }
    
    private void kirak()
    {
        Lap[] pakliTomb = this.pakli.getPakli();
        for (int i = 1; i < pakliTomb.length; i++)
        {
            System.out.printf("%-8s", pakliTomb[i]);
            if (i % 3 == 0)
            {
                System.out.println("");
            }
        }
    }
    
    private void ezVolt()
    {
        System.out.println("A választott lap: " + pakli.getPakli()[11]);
    }
    
    private int melyik()
    {
        boolean jo;
        int oszlop;
        do
        {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        }
        while (!jo);
        return oszlop;
    }
}
