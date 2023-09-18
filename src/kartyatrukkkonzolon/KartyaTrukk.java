package kartyatrukkkonzolon;

import java.util.Scanner;

public class KartyaTrukk
{
    private static final Scanner sc = new Scanner(System.in);
    
    private final Pakli pakli;
    
    public KartyaTrukk()
    {
        pakli = new Pakli();
        for (int i = 0; i < 3; i++)
        {
            pakli.kirak();
            int oszlop = melyik();
            pakli.kever(oszlop);
        }
        pakli.ezVolt();
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
