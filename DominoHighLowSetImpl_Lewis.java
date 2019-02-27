package dominoes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DominoHighLowSetImpl_Lewis implements Domino {

	// private instance variables
	private Set<Integer> highLowSet;

	// pre: MINIMUM_PIP_COUNT <= highPipCount <= MAXIMUM_PIP_COUNT
	// pre: MINIMUM_PIP_COUNT <= lowPipCount <= MAXIMUM_PIP_COUNT
	// pre: lowPipCount <= highPipCount
	// post: 1 <= highLowSet.size() <= 2
	public DominoHighLowSetImpl_Lewis(int highPipCount, int lowPipCount)
	{

		assert (lowPipCount >= Domino.MINIMUM_PIP_COUNT && lowPipCount <= Domino.MAXIMUM_PIP_COUNT) : "ERROR: LOW PIP COUNT MUST BE BETWEEN 0 AND 6";

		assert(highPipCount >= Domino.MINIMUM_PIP_COUNT && highPipCount <= Domino.MAXIMUM_PIP_COUNT) : "ERROR: HIGH PIP COUNT MUST BE BETWEEN 0 AND 6";

		assert (lowPipCount <= highPipCount) : "ERROR: PLEASE SEND IN FORMAT: (HIGH, LOW)";

		// initialize the set
		highLowSet = new TreeSet<Integer>();

		// add hpc and lpc to set
		highLowSet.add(highPipCount);
		highLowSet.add(lowPipCount);

	}

	public static final char SUM_DIFFERENCE_DELIMITER = ',';

	// private helper method find
	// will return the position of a char in a string	
	private static int find(char ch, String str)
	{
		int pos = -1;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == ch)
			{
				pos = i;
				break;
			}
		}
		return pos;
	}

	// isSumDifferenceString checks strings for format "00,00"
	public static boolean isSumDifferenceString(String str)
	{
		str = str.trim();
		boolean retBool = false; // setting return variable to false
		int pos = find(SUM_DIFFERENCE_DELIMITER, str);
		if(pos != -1) // if the ":" is in the string
		{									// else go straight to return
			for(int i = 0; i < str.length(); i++)
			{
				char ch = str.charAt(i);		// get the current char, 
				if(i != pos)		// all chars except the delimiter should be digits
				{
					if(Character.isDigit(ch)) // check if it is a digit
					{
						retBool = true; // change to true if so
					}
					else
					{
						retBool = false; // else change to false and exit loop
						break;
					}
				}
			} // end of for loop
		} // end of if statement

		return retBool; // return the final boolean value
	}

	// pre: String sent in is a sumDifference String and
	// returns true for isSumDifferencestring()
	// pre: sum >= difference, difference > 0
	public DominoHighLowSetImpl_Lewis(String sumDifferenceString)
	{
		assert (isSumDifferenceString(sumDifferenceString)): "PLEASE SEND A VALID STRING!!";

		// initialize the set
		highLowSet = new TreeSet<Integer>();
		// find the position of the sum-difference delimiter
		// int pos = find(SUM_DIFFERENCE_DELIMITER, sumDifferenceString);
		int pos = sumDifferenceString.indexOf(SUM_DIFFERENCE_DELIMITER);
		// temporary string to hold the sum
		String tempSum = sumDifferenceString.substring(0, pos);
		int sum = Integer.parseInt(tempSum); // get the int value of string
		String tempDiff = sumDifferenceString.substring(pos + 1);
		int difference = Integer.parseInt(tempDiff); // get the int value of the string

		// turn sum and difference into high and low pip counts
		int lowPipCount = (difference - sum) / (-2);
		int highPipCount = (difference + sum) / (2);

		// add these numbers to highLowSet
		highLowSet.add(lowPipCount);
		highLowSet.add(highPipCount);
	}

	// pre: 0 <= k <= 54 (54 is the highest int you can have with the 6/6 domino)
	// post: returns true if remainder and quotient < 6
	// false if one or both are greater than 6
	public static boolean isLowPlus8TimesHighInteger(int k)
	{
		int remainder = k % 8; // remainder will be low pip count
		int quotient = k / 8; // quotient will be high pip count
		boolean retBool = false;
		// if both are below 6 return true
		if(remainder <= MAXIMUM_PIP_COUNT && quotient <= MAXIMUM_PIP_COUNT && quotient >= MINIMUM_PIP_COUNT)
		{
			retBool = true;
		}
		return retBool;
	}

	// pre: 0 <= lowPlus8TimesHigh <= 54
	// pre: lowPlus8timesHigh % 8 <= MAXIMUM_PIP_COUNT
	// pre: lowPlus8TimesHigh / 8 <= MAXIMUM_PIP_COUNT
	public DominoHighLowSetImpl_Lewis(int lowPlus8TimesHigh)
	{
		assert (isLowPlus8TimesHighInteger(lowPlus8TimesHigh)): "PLEASE SEND A VALID INTEGER!!";

		highLowSet = new TreeSet<Integer>();
		// the low pip count will be the remainder, and it should be < 6
		int lowPipCount = lowPlus8TimesHigh % 8;
		// the high pip count will be the quotient
		int highPipCount = lowPlus8TimesHigh / 8;

		// add high and low pip counts
		highLowSet.add(lowPipCount);
		highLowSet.add(highPipCount);

	}

	// private helper method finds the max of two ints
	private int getMax(int a, int b)
	{
		int retVal = 0;
		if(a >= b)
		{
			retVal = a;
		}
		else
		{
			retVal = b;
		}
		return retVal;
	}

	// private helper method finds the min of two ints
	private int getMin(int a, int b)
	{
		int retVal = 0;
		if(a <= b)
		{
			retVal = a;
		}
		else
		{
			retVal = b;
		}
		return retVal;
	}

	// pre: none
	// post: the high pip count is returned
	public int getHighPipCount() {
		Iterator<Integer> iterator = highLowSet.iterator();
		int max = iterator.next();
		if(iterator.hasNext())
		{
			int num = iterator.next();
			max = getMax(max, num);
		}

		return max;
	}

	// pre: none
	// post: the low pip count is returned
	public int getLowPipCount() {
		Iterator<Integer> iterator = highLowSet.iterator();
		int min = iterator.next();
		if(iterator.hasNext())
		{
			int num = iterator.next();
			min = getMin(min, num);
		}

		return min;
	}


}