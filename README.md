# Exercises to Java 8 workshop

## Exercises

All exercises are in src/main/java/pl/touk/warsjawa/java8 directory. Every exercise is contained in separate directory
(ex01, ex02 etc.). Every folder has description.txt with the contents of exercise. Some have also hint.txt files, but I
encourage you not to use it. Be ambitious!

## Run tests

To run all test type in command line:

```
gradle clean test
```

To run single exercise test type (for MovieServiceTest from ex01 package):

```
gradle -Dtest.single=ex01/MovieServiceTest test
```
