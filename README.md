# TNPG: JWJ
Roster: Jefford Shau, William Vongphanith, William Kirmayer

## ALTester
Basically works by creating an OrderedArrayList, then adds a pile of numbers to it (including one that is out of order, to test our search placer), then prints the OrderedArrayList. After, it removes some numbers from the OrderedArrayList.

## OrderedArrayList
It is basically a wrapper class that creates an ArrayList. It has basic functions like get and set, which work exactly as you would expect them to. It also has an add function, which always adds such that the ArrayList is always sorted. This system makes sure of this because it finds the correct index to put the new element in. There is a remove function, which removes the element by index. Also, we have added the size function, which works exactly as you'd expect, and a toString function which overrides the default one and prints the array in bracket format.