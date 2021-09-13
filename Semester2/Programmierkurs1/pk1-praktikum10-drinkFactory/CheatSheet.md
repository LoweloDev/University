### Conveyor belt
A conveyor belt is probably best working in FIFO (first-in-first-out),
thus we need something FIFO-Capable and rather performant.

Double-ended queues are perfect for this.

Java provides a class ArrayDeque, which is our choice, because it is faster than 
LinkedList, for regular operations on both ends.

LinkedList is only then faster, when it is about removing the current node while iterating over the List.

### Functionality
Potentially from another or the same conveyor belt or any other device bottles go into:
1. the BottlingPlant. What comes out of the BottlingPlant goes onto 2.
2. the Conveyor belt. What is on the conveyor belt gets removed into 3.
3. the LabelingMachine. What goes into the labelMachine will be put into something else 4.
4. in this case, it will simply be printed into the console / disappear


### Threads

BottlingPlant runs in an exclusive thread.
LabelingMachine runs in an exclusive thread.

This means they run asynchronously.
If the conveyor is empty, the LabelingMachine Thread is told to wait.

It does not resume until it is explicitly notified. It is not busy waiting as far as I understand.
When it gets notified, it prints labels as long as there are bottles left on the belt.

The LabelingMachine gets notified every time something gets loaded onto the belt.

The BottlingPlant doesnt need to wait, nor notify at any point. Because it simply magically produces Bottles,
it isn't actually fed by something, since this is just an abstract example.

###Enumeration

Well, given the fact that one constraint in the UML diagram in class Label was a type of drink (in the example
beer) it is implied that an actual bottlingFactory would have multiple types of drinks.
Thus, it is useful to have an enumeration for said types.

### Records vs classes

Records basically simplify the appearance of a certain layout/stucture/format and usage of
normal java classes.

In this case, records are probably the cleanest.

Read more: [https://openjdk.java.net/jeps/359]()

### Synchronized

notify() and wait()

Needs synchronization to work properly.

Synchronous cause/effect. The thread actually should be waiting to be notified.

After notify() thread may resume waiting. 

