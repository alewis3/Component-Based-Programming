# CH III - Domino Constructorpalooza

This challenge required us to figure out and be able to translate between eight different representations of a Domino: 

- `int highPipCount, int lowPipCount`
- `String highLowString`
- `int[] sumDifference`
- `Set<Integer> highLowSet`
- `String sumDifferenceString`
- `int lowPlus8TimesHigh`
- `String lowDifferenceString`
- `List<Integer> highSum`

A domino is defined as having a high pip count and a low pip count. The max for each is six and the min is zero. high and low pip counts can be equal. 

Note that each Domino instance:
- receives its high and low pip counts at time of construction
- is not mutable: there is not a method in the interface that causes a change to what the instance would return in response to `getHighPipCount()` or `getLowPipCount()`

Please see [prompt](CHIII-Prompt.pdf) and [results](CHIII-Results.pdf) for more information.