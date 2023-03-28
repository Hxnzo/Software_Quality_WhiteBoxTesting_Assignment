package com.ontariotechu.sofe3980U;
import static org.junit.Assert.*;
import org.junit.Test;

public class CountCharactersTest 
{
    @Test
    public void CountOccurrencesTest1() 
    {
        char[] charArray = { 'a', 'b', 'c' };
        char targetChar = 'd';
        int actualCount = CountCharacters.occurences(charArray, targetChar);
        
        assertEquals(0, actualCount);
    }

    @Test
    public void CountOccurrencesTest2() 
    {
        char[] charArray = { 'a', 'b', 'c', 'd' };
        char targetChar = 'd';
        int actualCount = CountCharacters.occurences(charArray, targetChar);
        
        assertEquals(1, actualCount);
    }

    @Test
    public void CountOccurrencesTest3() 
    {
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f', 'd' };
        char targetChar = 'd';
        int actualCount = CountCharacters.occurences(charArray, targetChar);
        
        assertEquals(2, actualCount);
    }

    @Test
    public void CountOccurrencesTest4() 
    {
        char[] charArray = { 'a', 'b', 'c' };
        char targetChar = 'd';
        int actualCount = CountCharacters.occurences(charArray, targetChar);
        
        assertEquals(0, actualCount);
    }

    @Test
    public void CountOccurrencesTest5() 
    {
        char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'd', 'f', 'd' };
        char targetChar = 'd';
        int actualCount = CountCharacters.occurences(charArray, targetChar);

        assertEquals(3, actualCount);
    }

    @Test
    public void CountOccurrencesTest6() 
    {
        char[] charArray = { 'a', 'b', 'd', 'c', 'd' };
        char targetChar = 'd';
        int actualCount = CountCharacters.occurences(charArray, targetChar);
        
        assertEquals(2, actualCount);
    }

    @Test
    public void CountOccurrencesTest7() 
    {
        char[] charArray = { 'a', 'b', 'c' };
        char targetChar = 'd';
        int actualCount = CountCharacters.occurences(charArray, targetChar);
        
        assertEquals(0, actualCount);
    }

    @Test
    public void CountOccurrencesTest8() 
    {
        char[] charArray = { 'a', 'd', 'd' };
        char targetChar = 'd';
        int actualCount = CountCharacters.occurences(charArray, targetChar);
        
        assertEquals(2, actualCount);
    }

    @Test
    public void CountOccurrencesTest9() 
    {
        char[] charArray = { 'a', 'b', 'd', 'c', 'd' };
        char targetChar = 'd';
        int actualCount = CountCharacters.occurences(charArray, targetChar);
        
        assertEquals(2, actualCount);
    }
}
