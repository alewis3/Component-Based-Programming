package bingo;

import java.util.Set;

public class BingoCardUtils_Skeleton
{
	public static boolean areEqual(BingoCard bingoCard1, BingoCard bingoCard2)
	{
		throw new RuntimeException("NOT IMPLEMENTED");
	}
	
	//part of pre: bingoCard != null
	//part of post: rv != bingoCard
	//part of post: areEqual(bingoCard, rv)
	public static BingoCard copy(BingoCard bingoCard)
	{
		throw new RuntimeException("NOT IMPLEMENTED");
	}
	
	//part of pre: bingoCard != null
	//part of post: 1 <= rv <= 75
	public static int markCount(BingoCard bingoCard)
	{
		return 1;
	}
	
	//part of pre: bingoCardSet != null
	//part of pre: !bingoCardSet.contains(null)
	//part of pre: bingoCard in bingoCardSet ==> markCount(bingoCard) == 1
	//part of pre: 0 <= bingoCardNumbersNoDuplicates.length <= 75
	//part of pre: bingoCardNumbersNoDuplicates doesn't have duplicates
	//part of post: rv != null
	//part of post: bingoCard in rv ==> markCount(bingoCard) == 1
	public static Set<BingoCard> getProjectedWinners(Set<BingoCard> bingoCardSet, int[] bingoCardNumbersNoDuplicates)
	{
		throw new RuntimeException("NOT IMPLEMENTED");
	}
	
	//EXTRA CREDIT getTorusBingoProjectedWinners(): DON'T DO UNLESS YOU HAVE COMPLETED THE REST OF THIS CHALLENGE!
	//part of pre: bingoCardSet != null
	//part of pre: !bingoCardSet.contains(null)
	//part of pre: bingoCard in bingoCardSet ==> markCount(bingoCard) == 1
	//part of pre: 0 <= bingoCardNumbersNoDuplicates.length <= 75
	//part of pre: bingoCardNumbersNoDuplicates doesn't have duplicates
	//part of post: rv != null
	//part of post: bingoCard in rv ==> markCount(bingoCard) == 1
	public static Set<BingoCard> getTorusBingoProjectedWinners(Set<BingoCard> bingoCardSet, int[] bingoCardNumbersNoDuplicates)
	{
		//EXTRA CREDIT getTorusBingoProjectedWinners(): DON'T DO UNLESS YOU HAVE COMPLETED THE REST OF THIS CHALLENGE!
		throw new RuntimeException("NOT IMPLEMENTED");
	}
}
