package modell;

public class Pakli
{
    private Lap[] pakli;
    
    public Pakli()
    {
        feltolt();
    }
    
    public Lap[] getPakli()
    {
        return pakli;
    }
    
    private void feltolt()
    {
        pakli = new Lap[22];
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};
        int i = 1;
        for (String szin : szinek)
        {
            for (int e = 0; e < ertekek.length && i < pakli.length; e++)
            {
                pakli[i++] = new Lap(szin + "_" + ertekek[e]);
            }
        }
    }

    public void kever(int oszlop)
    {
        // mindig középre a választott
        Lap[] ujPakli = new Lap[22];
        switch (oszlop)
        {
            case 1:
                for (int i = 1; i <= 7; i++)
                {
                    ujPakli[i] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[21 - (i - 1) * 3];
                }
                break;
            case 2:
                for (int i = 1; i <= 7; i++)
                {
                    ujPakli[i] = pakli[21 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[20 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[19 - (i - 1) * 3];
                }
                break;
            case 3:
                for (int i = 1; i <= 7; i++)
                {
                    ujPakli[i] = pakli[19 - (i - 1) * 3];
                    ujPakli[i + 7] = pakli[21 - (i - 1) * 3];
                    ujPakli[i + 14] = pakli[20 - (i - 1) * 3];
                }
                break;
        }
        pakli = ujPakli;
    }
}
