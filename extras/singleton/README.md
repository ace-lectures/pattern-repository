# Singleton

  * Famille : Création

## Description du patron 

### Structure

<div align="center">

![singleton class diag](./uml/singleton_cd.png)

</div>

### Comportement

<div align="center">

![singleton class diag](./uml/singleton_sd.png)

</div>

## Exemple

<div align="center">

![singleton class diag](./uml/_example.png)

</div>

## Démonstration

  * Pour compiler le code : 
    * `lucifer:singleton mosser$ mvn -q clean package`
  * Pour exécuter la démonstration :
    * `lucifer:singleton mosser$ mvn -q exec:java`

### Code

```java
System.out.println("###\n# Regular usage\n###");
Product reg1 = new Regular();
reg1.doSomething();
Product reg2 = new Regular();
reg2.doSomething();
Product reg3 = new Regular();
reg3.doSomething();
System.out.println("Number of instances created: " + Regular.howManyCreated()+"\n");

System.out.println("\n###\n# Singleton usage\n###");
// Product sing1 = new Unique(); // Does not compile, thanks to the private constructor
Product sing1 = Unique.build();
sing1.doSomething();
Product sing2 = Unique.build();
sing2.doSomething();
Product sing3 = Unique.build();
sing3.doSomething();
System.out.println("Number of instances created: " + Unique.howManyCreated()+"\n");
```

### Trace

```
###
# Regular usage
###
==>> A new regular product is instantiated  <<==
I am a regular product doing something
==>> A new regular product is instantiated  <<==
I am a regular product doing something
==>> A new regular product is instantiated  <<==
I am a regular product doing something
Number of instances created: 3

###
# Singleton usage
###
==>> A new unique product is instantiated <<==
I am an unique product doing something
I am an unique product doing something
I am an unique product doing something
Number of instances created: 1
```