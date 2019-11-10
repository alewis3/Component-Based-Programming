# CH VI - BingoCard Implementations

A Bingo Card has 5 rows of and 5 columns, and has the following conditions: 

```
// column == 1 ("B") ==> 1 <= rv <= 15
// column == 2 ("I") ==> 16 <= rv <= 30
// column == 3 ("N") ==> ((31 <= rv <= 45) || ((row = 3) && (rv == FREE_SPACE)));
// column == 4 ("G") ==> 46 <= rv <= 60
// column == 5 ("O") ==> 61 <= rv <= 75
```

We were tasked to create four different implementations with varying internal representations: 

- `BingoCardRowListBasedImpl.java`
- `BingoCardRowSetBasedImpl.java`
- `BingoCardColumnListBasedImpl.java`
- `BingoCardDiagonalListBasedImpl.java`

Our teacher tested using his own constructor, so this assignment did not require us to create a constructor for any impl, but he encouraged us to create our own for test purposes.

A BingoCard provides three main services, it can: 

- report on what number is in each row and column
- mark entries
- report on whether it contains a certain number
- report on which numbers are marked
- report on whether it is in a winning configuration

Note that the BingoCard: 
- is told which numbers are on the card in each row and column via a client-facing constructor call
- always reports that the free space is marked
- needs to have something added to the precondition for the `mark()` method

Please see [prompt](CHVI-Prompt.pdf) for more information.