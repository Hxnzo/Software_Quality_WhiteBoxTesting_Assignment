package com.ontariotechu.sofe3980U;

public class CountCharacters 
{
    public static int occurences(char[] charArray, char targetChar) 
    {
        //initialize variable
        int count = 0;

        //loop through amount of characters
        for (int i = 0; i < charArray.length; i++)
        {
            //check if character is the target character
            if (charArray[i] == targetChar)
            {
                //increment count
                count++;
            }
        }

        //return count
        return count;
    }
}
