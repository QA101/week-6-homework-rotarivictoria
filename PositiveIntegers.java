package src;

import java.util.Arrays;

public class PositiveIntegers
{
    private static final int INPUT[] = {1,5,1,-1,1,1,1,1};

    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(findPositiveSequence(INPUT)));
    }

    public static int[] findPositiveSequence(int[] array)
    {
        int maxSequenceStartIndex = 0;
        int maxSequenceLength = 0;
        int currentSequenceStartIndex = 0;
        int currentSequenceLength = 0;
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] < 0)
            {
                if(currentSequenceLength > maxSequenceLength)
                {
                    maxSequenceLength = currentSequenceLength;
                    maxSequenceStartIndex = currentSequenceStartIndex;
                }
                currentSequenceStartIndex = i + 1;
                currentSequenceLength = 0;
            }
            else
            {
                currentSequenceLength++;
            }
        }

        if(currentSequenceLength > maxSequenceLength)
        {
            maxSequenceStartIndex = currentSequenceStartIndex;
            maxSequenceLength = currentSequenceLength;
        }

        int maxSequenceEndIndex = maxSequenceStartIndex + maxSequenceLength;
        return Arrays.copyOfRange(array, maxSequenceStartIndex, maxSequenceEndIndex);
    }

}