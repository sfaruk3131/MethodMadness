// Shihab Faruk 9/20/18
//Need java comments and revisions
package sfaruk;

public class sfarukLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    /**
     * program checks if word is a palindrome through for loop by using index
     * uses substring and subtracts one each loop until length of the word
     * @param word
     * @return true or false boolean
     */

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

    /**
     * takes date format and seperates the date in 3 and concatenates the order
     * @param mdy
     * @return String
     */

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

    /**
     * finds the sum up to a certain number by using a for loop until chosen number keeps adding
     * @param Sint
     * @return int
     */

    public static int sumUpTo(int Sint)
    {
        int Sum = 0;

        for(int x = 0;x <= Sint ; x++)
        {
            Sum = Sum + x;
        }

        return Sum;
    }

    /**
     * multiplies the base with number up to the range by using a for loop until you reach the range
     * will print the numbers until loop ends
     * @param base
     * @param range
     * @return String
     */

    public static String multiplicationTable(int base ,int range)
    {
        String end = "the end";
        for(int x = 0; x <= range; x++)
        {
            int product = base * x;

            System.out.println(product);

        }
        return end;
    }



    /**
     * checks if the number is in the sequence by assigning previous values to new ones and adding while condition
     is true
     * @param Check
     * @return boolean
     */

    public static boolean isFibonnaci(int Check)
    {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;

        while(num3 < Check)
        {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        if(num3 == Check)
        {
            return true;
        }

        return false;
    }
}
