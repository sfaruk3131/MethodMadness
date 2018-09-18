package sfaruk;

public class sfarukLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    public static boolean is Palendrome(String word)
    {
        String Back = "";
        boolean Same = true;
        if(word.length() == 1)
        {
            return true;
        }

        for(int x = word.length() - 1 ; x >= 0 ; x--)
        {
            Back = Back + word.substring(x,x + 1);
        }

        while(Same == true)
        {
            
        }
    }
}
