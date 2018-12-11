[![Build Status](https://travis-ci.com/mtumilowicz/designPatterns.svg?branch=master)](https://travis-ci.com/mtumilowicz/designPatterns)
# designPatterns
The main goal of this project is to show basic design 
patterns and provide real-life examples.  
Solutions provided in the code are inspired by the wide-ranging internet
search and know-how of the author.  
Valuable references:  
http://www.blackwasp.co.uk/GofPatterns.aspx  
http://www.oodesign.com/  
Most of design patterns are given with the example from Java SE.

## behavioural
All behavioural design patterns are in package: behavioural.*.  
Package of specific pattern is obtained using camel-case.  
Every design pattern has been tested in `test` package (same naming 
convention).
### chain of responsibility
* theory: `chain of responsibility` is used to process varied requests, 
each of which may be dealt with by a different handler.
The most usual example of a machine using the `chain of 
responsibility` is the vending machine coin slot: rather than having a 
slot for each type of coin, the machine has only one slot for all of 
them.
* code: We have `Request` with `size` field, and handlers extending 
`Handler` (with `Handler` field `successor`): `HandlerFirstImpl` process
requests of positive size otherwise pushes them to the `successor`: 
`HandlerSecondImpl`, which process requests of negative size (note that 
at that point, all requests with either `size > 0 & size < 0` where 
handled, so the last case is `size = 0`) otherwise pushes them to the 
end-point `successor`: `HandlerThirdImpl`.
* Java SE example: `java.util.logging.Logger#log()`

### command
* theory: `command` is used to encapsulate all information needed to 
perform an action. Four terms always associated with the command pattern 
are `command`, `receiver`, `invoker` and `client`:  
`command` object knows about `receiver` and invokes a method of the 
`receiver`.  
`receiver` is stored in the `command` object by aggregation and  does 
the work when the `execute()` method in `command` is called.  
`invoker` object knows how to execute a `command`, but does not know 
anything about a concrete `command`, it knows only about `command`
interface.  
`client` holds `invoker`, `command` and `receiver` objects.
* code: We have different platforms (Mac and Windows) and we want to
perform action on files (open, write, close). We have platform 
dependent `FileSystemReceiver` (interface with methods
open, write, close) implementations: `MacFileSystemReceiver` and 
`WindowsFileSystemReceiver`. For invoking commands: `FileInvoker`.
* Java SE example: `all implementations of java.lang.Runnable`

### interpreter
* theory: `interpreter` is used to define easily-extendable grammar for 
instructions that form part of a language or notation.
* code: We have an `expression` containing words and spaces, and we want
to develop a grammar that enables us to answer such questions: check if
`expression` contains specific word `LiteralExpression` and furthermore 
we could connect questions with basic binary operators: 
`or` (`OrExpression`) & `and` (`AndExpression`) to compose more complex 
questions like: check if `expression` contains 
`word1 and (word2 or (word3 or word4))` (`SpecificInterpreter`).
* Java SE example: `java.util.Pattern`

### mediator
* theory: `mediator` is used to reduce coupling between classes that 
communicate with each other by developing mechanism to facilitate the 
interaction between objects in a manner in which objects are not aware 
of the existence of other objects.
* code: We have a `ChatMediator` that facilitates sending messages 
between `Users`.
* Java SE example: `java.util.concurrent.ExecutorService (submit() 
methods)`

### memento
* theory: `memento` is used to save the current state of an object 
in such a manner that it can be restored at a later time without 
breaking the rules of encapsulation.
* code: We have a `TextEditor` with functionality of 
`addWord(String word)`. If we make a mistake we call `undo()`.

### observer
* theory: In the observer pattern, an object, called the
subject, maintains a list of other objects, which are its 
observers. When the state of the subject changes, its 
observers are notified.
* code: We have subject `Earth` with observers: `AsteroidObserver`, 
`SpaceStationObserver` that observe `FlyingObject` with specific
`FlyingObjectType`.

### strategy
* theory: `strategy` is used to create an interchangeable family of 
algorithms from which the required process is chosen at run-time. Most
known example of `strategy` is 
`Collections.sort(List<T> list, Comparator<? super T> c)`.
* code: We have a `ShoppingCart` and we pay using `CreditCardPayment` or
`PayPalPayment` (different algorithms). In the `ShoppingCart` we have a 
method `pay(Payment method)` where we put appropriate payment 
algorithm.
* Java SE example: `java.util.Collections#
sort(List<T> list, Comparator<? super T> c)`

### template method
* theory: `template method` is used to define an algorithm in a base 
class using abstract operations that subclasses override to provide 
concrete behavior.
* code: We have a class `Trip` with `template method`: `performTrip()`
that call three abstract methods: `comingTransport()`, `daysSchedule()`,
`returningTransport()`. As we see - `Trip` could be easily 
extended to `TwoDayTrip` (and in future, possibly `ThreeDayTrip` and so 
on...).
* Java SE example: `java.io.InputStream
#read(byte b[], int off, int len)`

### visitor
* theory: `visitor` is a way of separating an algorithm from an object 
structure on which it operates. A practical result of this separation is 
the ability to add new operations to existent object structures without 
modifying the structures.
* code: We have different configurations (`LinuxConfigurator`, 
`MacConfigurator`) of different routers (`DLinkRouter`, `LinkSysRouter`)
and we could easily add another type configuration 
(ex. `MSConfigurator`) 
without changing code of `Routers`, and we could add another type of 
`Router` by simply modifying code of `Configurator` (`RouterVisitor`).
* Java SE example: `java.nio.file.SimpleFileVisitor`

## creational
All creational design patterns are in package: creational.*.  
Package of specific pattern is obtained using camel-case.  
Every design pattern has been tested in `test` package (same naming 
convention).

### abstract factory
* theory: `abstract factory` is an interface for creating families of 
related or dependent objects without specifying their concrete classes.
* code: We have two possible platforms - `Mac` and `MS`, and we have to
produce desktop application that runs on either of them. As we know 
widgets implementation differ on different platforms, so we have to
encapsulate production of `windows` and `buttons` into 
`PlatformDependentWidgetProducer` and in run-time we decide which 
factory (`MsWindowsWidgetFactory` or `MacOSXWidgetFactory`) should be 
used (it depend on which platform we are).

### builder
* theory: `builder` is an external class that facilitates the 
construction of an object. Note that we could have two different types
of objects (by their ability to change state): `immutable` and 
`mutable`.
* code: For `immutable` we have: `ImmutableWithBuilder` - we have 
private constructor that has a builder argument constructor and we have 
static class `Builder` (with same fields that an original class) that 
have setters that allow chaining.  
For `mutable` objects we have `GenericBuilder` (using `java 8`) that 
could be used for every `mutable` class.
* Java SE example: `java.lang.StringBuilder#append()`

### factory method
* theory: `factory method` defines an interface for creating an object, 
but leaves the choice of its type to the subclasses, creation being 
deferred at run-time.
* code: `ShapeFactory` produces different `Shapes` depending on 
`ShapeType`.
* Java SE example: `java.util.ResourceBundle#getBundle()`

### prototype
* theory: `prototype` is used to instantiate a new object by copying all 
of the fields of an existing object (construction of a new object could
be time consuming).
* code: We have `TimeConsumingCreationBaseFont` that construction takes
two seconds (`TimeUnit.SECONDS.sleep(2)` in constructor), but this has 
also `clone()` method, so we have to `prototype` object only once and 
then copy whenever we need new object (`HelveticaFont`).
* Java SE example: `java.lang.Object#clone() 
(the class has to implement java.lang.Cloneable)`

### singleton
* theory: `singleton` is used when we have to ensure that only one 
object of a particular class is ever created, and all references refer
to the same object.
* code: `ThreadSafeSingleton`. Note that not every `singleton` 
is thread safe, which is common mistake.
* Java SE example: `java.lang.System#console()`

## structural
All structural design patterns are in package: creational.*.  
Package of specific pattern is obtained using camel-case.  
Every design pattern has been tested in `test` package (same naming 
convention).

### adapter
* theory: `adapter` is used when we have two incompatible types and we 
want to have a communication between them. When one class relies on 
the interface that the other does not implement - `adapter` is a 
translator between them.  
* example: We have two incompatible interfaces of the same purpose: one in 
english (`IPerson`), one in french (`IFrenchPerson`) - we integrate 
these two system into one - using adapter `FrenchPersonAdapter` that 
implements `IPerson`. So we have easy way to transform every Frenchman 
to Englishman.
* Java SE example: `java.util.Arrays#asList()`

### bridge
* theory: `bridge` is used when we want to separate abstractions from 
technical implementation - implementation details could be changed 
easily then.
* example: We have two different implementations of music player: 
`Spotify` and `Tidal` that differs in technical implementations, but 
`AbstractMusicPlayer` that is used as a `bridge`, provides that we could
easy switch between them.

### composite
* theory: `composite` is used when creating hierarchical object models.
It is used to provide that the individual objects and groups can be 
accessed in the same manner.
* example: We have `ComplexShape` that is a composition of `Shapes`, and
every `Shape` could be decomposed to `BasicShapes`.
* Java SE example: `java.util.Pattern`

### decorator
* theory: `decorator` is used when we want to extend implementation in
run-time (as an alternative to inheritance). It is obtain by wrapping
classes in an object called `decorator`.
* example: We have `BasicCar implements Car`, and we want to have two 
upgrades: `LuxuryCar` and `SportsCar`. Using inheritance will cause a 
lot of problems - for example wiring dependencies between them (what in 
the case of another types, for example `ConvertibleCar`?!), so we decide
to use `CarDecorator` and two appropriate classes that extends it: 
`LuxuryCar`, `SportsCar`. Dependency is decoupled then - we could easily 
make Luxury-Sport car and Sport-Luxury car (and they are, like in real 
life, not the same thing!).
* Java SE example: `I/O Streams`

### facade
* theory: `facade` is used to define a simplified interface to a more 
complex subsystem. It is also very useful when `API` is still under 
construction and change rapidly, and we don't want to make perpetual 
changes in our code.
* code: We want to book hotel (`HotelBooking`) and flight 
(`FlightBooking`) in one place (`TravelBooking`). More sophisticated and
real life example is in my another project: 
https://github.com/mtumilowicz/reports#pdf-1
`PdfCellBuilder` - easy builder for very complex task of building a pdf
call.

### flyweight
* theory: `flyweight` is used to reduce the memory (and time consuming 
creation) usage for complex models using numerous, but the same objects.
* code: We have immutable `Font` that has three factors: `name`, `size`,
`color`. Creation of font could be time consuming task, so it's better 
to cache already created fonts and reuse them. Simple reports could 
demand thousands of different fonts. In `Font` class we have static 
class `FlyweightFactory` that is responsible for creating and caching 
`Font` object. Note that good practice is that `Font` is immutable and 
has private constructor.
* Java SE example: `java.lang.Integer#valueOf(int)`

### proxy
* theory: `proxy` is a placeholder class that has plenty applications. 
There are many different kind of `proxy`, but we decide to show only 
`Cache Proxy`. A `cache proxy` improves the performance of long-running 
tasks by caching request-answer. Note that answer should be always the 
same for specific input. Good example are problems with prime numbers.  
Other type of `proxy` is described here:
https://developer.jboss.org/blogs/stuartdouglas/2010/10/12/weld-cdi-and-proxies
* code: We have algorithm from my another project 
(https://github.com/mtumilowicz/poligon#CountPrimes) that is already 
optimal and lightning-fast, but we could shorten the time of receiving
count using `proxy` (only first request is evaluated, others are taken
from cache).

# tests
*Coverage*: `91%`