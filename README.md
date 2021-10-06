# SheepCounter

Simple Java program for demonstrating of the difference between fields of instances and fields of a class (static fields). Access modifications is shown too.

The BadSheep class has insufficient restriction in access to the field named count. Ahy instance can change it.

The GoodSheep class has a getter for reading and incrementing of this static field. The class Counter is not a public class. It has only package access. So it can not be read or modified by the Main class.
