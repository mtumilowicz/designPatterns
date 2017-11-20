# designPatterns
The main goal of this project is to show basic design 
patterns and provide real-life examples.  
Solutions provided in the code are inspired by the wide-ranging internet
search and know-how of the author.

## behavioural
All behavioural design patterns are in package: behavioural.*.  
Package of specific pattern is obtained using camel-case.
### chain of responsibility
### command
### interpreter
### mediator
### memento
### strategy
### template method
### visitor

## creational
All creational design patterns are in package: creational.*.  
Package of specific pattern is obtained using camel-case.
### abstract factory
### builder
### factory method
### prototype
### singleton

## structural
All structural design patterns are in package: creational.*.  
Package of specific pattern is obtained using camel-case.
Package of specific pattern is obtained using camel-case.
### adapter
* theory: `adapter` is used when we have two incompatible types and we 
want to have a communication between them. When one class relies on 
the interface that the other doesn't implement - `adapter` is a 
translator between them.  
* example: We have two incompatible interfaces of the same purpose: one in 
english (`IPerson`), one in french (`IFrenchPerson`) - we integrate 
these two system into one - using adapter `FrenchPersonAdapter` that 
implements `IPerson`. So we have easy way to transform every Frenchman 
to Englishman.
### bridge
### composite
### decorator
### facade
### flyweight
### proxy