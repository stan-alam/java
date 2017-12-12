# Overview of Hibernate

### Topics ...

## What is Hibernate?

## Benefits of Hibernate?

## Code Snippets?


# What is Hibernate?

**Hibernate is a framework**

it is a framework for persisting or saving java objects into a database. At a
high level Hibernate allows you to save Java data into the database.

**Hibernate handles all of the low-level SQL**

**Minimizes the amount of JDBC code the dev has to work on**

**Hibernate provides the Object-to-Relational Mapping (ORM)**

How does Hibernate work?

## Object-to-Relational Mapping (ORM)

**The Developer defines mapping between Java class and data table.**

Hb provides ORM, as a dev you need to tell Hibernate how to map your java class to map to the database.

e.g. A java class like Student may have the following attributes... you setup the one to one mapping to the table.

The mapping could be xml or Java annotations.

```java

  //create the java objects
  Student theStudent = new Student("Ben", "Adams", "Ben@Adams.com");

  // save it to a database
  int theId = (Integer) session.save(theStudent);


  ```
  Session is a special Hibernate object

  The second statement actually saves the java object and based on the mapping stores it in the appropriate table the rows, and column

  No more having to write manual SQL statements with JDBC.


# Retrieving a Java Object with Hibernate

```java

//create the java objects
Student theStudent = new Student("Ben", "Adams", "Ben@Adams.com");

// save it to a database
int theId = (Integer) session.save(theStudent);


//now retrieve the database using the primary key

Student myStudent = session.get(Student.class, theId);

```

The 'theId' is the primary key

on line 67 we retrieve the data from the database, i.e the java object

the .get method grabs the data and returns it. It is pretty easy-peasy.

**Querying for Java Objects**

```java

Query query = session.createQuery("from Student");

List<Student> students = query.list();


```

WHat if I want all the student objects?

Here the .list() grabs all the objects from the student table and put in a list.

create.Query is the HQL or **hibernate query language.** Once you have the query you can use it in html, or .jsf, or
System.out.println, or java servlet.

# Hibernate CRUD

**cover all in detail**
