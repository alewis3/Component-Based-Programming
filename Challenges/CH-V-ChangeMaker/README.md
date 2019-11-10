# CH V - ChangeMaker Implementation

In this challenge, we were tasked to create a `ChangeMaker` class that could take in a denomination list (`[100, 50, 25, 10, 5, 1]` would be an example of the US coin denomination system), and provide three main services: 

1. To figure out whether it can make exact change for a given value
2. give the correct change for a "changeable" value (i.e. the method for requirement 1 returns true)
3. calculate the value for a pile of change

Note that the `ChangeMaker`: 
- is told which denominations are available at time of construction
- effecitvely has an infinite supply of "coins" of each denomination
- is required to give change in a "greedy manner (The least amount of coins possible)

Please see [prompt](CHV-Prompt.pdf) and [results](CHV-Results.pdf) for more information.