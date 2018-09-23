// Shihab Faruk 9/20/18
package sfaruk;

public class sfarukLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    public static boolean isPalindrome(String word)
    {
        String Back = "";
        boolean Same = true;
        if(word.length() == 1)
        {
            Same = true;
        }

        for(int x = word.length() - 1 ; x >= 0 ; x--)
        {
            Back = Back + word.substring(x,x + 1);
        }

        if(word.equals(Back) == true)
        {
            Same = true;
        }
        else
        {
            Same = false;
        }

        return Same;
    }

    public static String dateStr(String mdy)
    {
        String Part1 = "";
        String Part2 = "";
        String Part3 = "";
        String dmy = "";

        Part1 = mdy.substring(0,2);
        Part2 = mdy.substring(3,5);
        Part3 = mdy.substring(6,10);

        dmy = Part2 + "-" + Part1 + "-" +Part3;

        return dmy;
    }

    public static int sumUpTo(int Sint, int upto )
    {
        Sint = 0;

        for(int x = 1;x <= upto ; x++)
        {
            Sint = Sint + x;
        }

        return Sint;
    }

    public static int multiplicationTable(int base ,int range)
    {

        for(int x = 0; x <= range; x++)
        {
            int product = base * x;

            println(Integer.toString(product));

        }
        return void;
    }

    public static String cutOut()
    {

    }

}
