# A Strategy Pattern example as shown in the Head First Design Pattern Book

## Strategy pattern's definition

> The Strategy pattern alows you to define a family of algorithms, encapsulates each one, and makes then interchangeable.
> It lets the algorithm vary independently from the clients that use it.

## Tech 

This example uses the following technologies:

- [Java] - Java programming language
- [Docker] - An open source containerization platform.


## Installation

You only need [Docker] installed to run this example.

After installing [Docker], follow to the the root folder of the cloned project.
<br/>
Then, run the following command to build the [docker] image:

```sh
docker build -t strategy-pattern .

```

After the step above, run the following code to run the image as a container:

```sh
docker run strategy-pattern
```

## Application explained

After running the image as a container, you will see the following output:

```
I am a Rubber duck!
Quack! Quack!!
Damn! I can't fly!

=====Rubber Duck now get on a space rocket!====

I am a Rubber duck!
I AM ONNNN A ROCKKETTT!
QUAAACKKKKKKKK! QUAAACKKKKKKKK!

=====Rubber Duck now gets back on Earth!====

I am a Rubber duck!
Damn! I can't fly!
Quack! Quack!!
```

The rubber duck initially has a quack behaviour and a fly behavior.
<br/>
When the rubber ducks get on a space rocket, it's flying and quack behavior change at runtime.
<br/>
The same happens when it gets back on Earth.

###### READMD done with [dillinger]


## License

MIT


[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job. There is no need to format nicely because it shouldn't be seen. Thanks SO - http://stackoverflow.com/questions/4823468/store-comments-in-markdown-syntax)

   [dillinger]: <https://dillinger.io/>
   [Java]: <https://www.java.com/>
   [Docker]: <https://www.docker.com/>
   
