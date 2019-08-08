## 04

## Agenda 


Java was the solution for platform independence 

* Compilation

* Interpretation  -- JVM is like the soul of Java

* Platform Independence


Java software platform provides many types of platforms 

Java SE platform is one of these platforms

# 005

**Java is**

General-purpose 

Object-oriented -- model real world sceneries/problem solving

Platform independent 

Concurrent -- multithreading

Very fast -- Speed is almost indistinguishable from C and C++ ?

Java uses automatic memory management

Java is secure

Has a wealthy API libraries

**less reinvent the wheel**

Java was initially designed for embedded applications but later evolved for browser, console/client and mobile.

Java is using Google, Linkedin, apple, amazon, ebay 

## The Mars Rover Spirit

and open source such apache solr, hadoop, mahout

Java is also used in machine learning, data mining.

## 006

Compared to languages such as C and C ++

Motivation : C ++  is not platform independent, Java was first called Oak by James Gosling in 1992

e.g. gosling star7

**The www a collection of heterogeneous hardware talking with each other a perfect fit for Java**

Sun created **HotJava** browser presented at SunWorld conference

	HTML + programs that contain tags with applets allow for dynamic web app

	Applets are platform independent

NetScape navigator supported Java.

**FIrst version released in 1996, I remember this !**


# 007 Compilation

Platform dependency -- 

Machine language -- fixed set of instructions, computer understands this

Program -- set of of instructions

Instructions are binary

Machine language or machine code or **native code**

e.g. 0000 0000 0001 0001 etc.

**Assembly Language**

li $t1, 5

add $t0, $t1, 6 

used in assembler

Both are low-level languages

e.g. specifying memory locations 

**High-level languages** 

**Fortran, C, C++, Java, C#**

hide low-level details

assembler is good for OS, and embedded devices


After the source code goes through the compiler it is made into a **target language** 

In c, c++ -> machine code, java -> byte code

Compiler verifies syntax & semantics of source code

e.g. every statement ends with a semicolon

Compiler also created code optimizations, generates machine code

# 008

**Platform Dependency**

Usually any project consists of many source code files, done by linking

binary on linux cannot be executed on a windows machine 

If the program was compiled on one **processor A** will not work on **processor B**


# 009

**Interpreter**

CPU turns machine code to results, while interpreter turns source code into results, the CPU executes the interpreter and then the interpreter executes the source code.

**THe interpreter is a virtual machine, just like the CPU fetch-and-execute Cycle**







