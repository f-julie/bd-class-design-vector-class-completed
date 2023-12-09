### Pre-Activity

Look at the Playlist UML Class Diagram image. Write the class definition, instance variables, and method signatures which could implement the diagram. You will not be implementing the actual methods, just the signatures for each method.

# Creating a Vector Class

Vectors are a useful tool for visualizing abstract concepts across
disciplines. A Vector can be though of as an arrow with both the
length (magnitude) and the direction representing some quantity.

For example, a Vector might represent force in a direction. A longer
arrow might represent a larger force.

Another Vector might be used to represent the speed of a moving
vehicle. Or to simulate the flow of water through a pipe.

The utility of Vectors is ubiquitous, and thus it would be helpful
for us to have a Vector class that we can use in a variety of
projects.

The goal of today's project is to make a Vector class and flesh it
out with a variety of methods, such as arithmetic operations which
we can use in other projects. The example project included in this
repo uses Vectors to compute the amount of light hitting 2D surfaces.

*Lighting technology advances far beyond what this project does, but
this is a start.*

## Your Task

Create a Vector Class

Each Vector will be represented with an `x` and a `y` component.

- Create a constructor which takes an `x` and a `y` number as well as
a default constructor.
- Create Getters and Setters

### Arithmetic Operations

We will design both **mutating** and **non-mutating** class methods
for these operations. `add`, `sub`, and `mult` will be mutating.
`plus`, `minus`, `times`, will be non-mutating.

A **mutator** method changes the state of the object. For example:

```java
Vector a = new Vector(1, 2);
Vector b = new Vector(3, 4);

a.add(b);

System.out.println(a); // Vector: {x: 4, y: 6}
```

A **non-mutating** method returns a new Vector instead of changing
the state of the original object. For example:

```java
Vector a = new Vector(1, 2);
Vector b = new Vector(3, 4);

Vector ab = a.plus(b);

System.out.println(a); // Vector: {x: 1, y: 2}
System.out.println(ab); // Vector: {x: 4, y: 6}
```

## Create the following arithmetic operations

**Mutating**
- `void add(Vector)` adds the components of another Vector to the
original Vector.
- `void sub(Vector)` subtract the components of another Vector to the
original Vector.
- `void mult(float)` multiplies each component of the Vector by a
scalar value.

**Non-Mutating**
- `Vector plus(Vector)` returns a new Vector whose components equal
the sum of the original Vector and the input Vector.
- `Vector minus(Vector)` returns a new Vector whose components equal
the difference of the original Vector and the input Vector.
- `Vector times(float)` returns a new Vector whose components are
equal to the original Vector times the scalar value.

## Override the `toString()` Method

All objects inherit from the Object superclass.

We will learn more about inheritence later in the program. The bottom
line is that all classes have a `toString()` method which is called
by `System.out.println()` automatically (or it can be called manually).

By default, printing an Object simply prints the memory address where
the object is stored. Something like:

`math.Vector@6d06d69c`

We can change this by **overriding** the `toString()` method.
IntelliJ does a good job of this automatically.
From inside the Vector class, right-click and select
`Generate > toString()`.

Choose both the `x` and the `y` field and press Ok. You should
see something like this:

```java
@Override
public String toString() {
    return "Vector{" +
            "x=" + x +
            ", y=" + y +
            '}';
}
```

## Test your Vector class

In the `main` method of the `Main` class, try some Vector arithmetic
and use `System.out.println()` to test the results.

## Vector Math Methods

### magnitude
Use the distance formula (the pythagorean theorem) to compute the
magnitude of a Vector and return it as a float.

```java
Vector a = new Vector(3, 4);
System.out.println(a.magnitude()) //returns 5
```

### Normalizing a Vector

Normalizing a Vector means setting the magnitude to 1 without
changing its direction. For some calculations, the length of the
Vectors involved is irrelevant and thus we want to normalize them
first.

This can be done by dividing each component, `x` and `y` by the
magnitude of the Vector.

Create two methods:

`normalize()` mutates the Vector into a normalized version of itself.
`normalized()` returns a new normalized Vector.

**Hint:** store the result of the magnitude computation before
changing the value of the component fields. The magnitude will change
after the first component changes.

### The dot product

The dot product measures how aligned two Vectors are, and is the key
idea for this simple lighting example.

Each surface has a **normal** (This is unrelated to a normalized
Vector). This is a Vector that points perpendicular to its surface
as shown:

[image]

We create a Vector that points from the lightbulb to the center of
the wall and take the dot product of it and the wall's normal Vector.

The result of the dot product ranges from 0 to 1. With 1 being totally
aligned, and 0 being perpendicular. (Technically the range is from
-1 to +1).

The algebreic definition of the dot product between two *normalized*
Vectors is:

`x1 * x2 + y1 * y2`

**Create a `dot(Vector)` method which returns a float equal to the
  dot product with the second Vector.**

## Test your methods with the following:
```java
Vector a = new Vector(1, 2);
Vector b = new Vector(3, 4);

System.out.println(a.normalized());
System.out.println(a.magnitude());
System.out.println(b.magnitude());

System.out.println(a.dot(b));
```

The output should be:

```java
Vector{x=0.4472136, y=0.8944272}
2.236068
5.0
0.9838699
```

## Open the Github repo for LightVectors and import your Vector class

There will be instructions in the [LightVectors repo](https://github.com/LambdaSchool/bd-methods-scope-and-class-design-light-vectors.git)
if you need additional help.

### A Completed Project Will

Produce the output shown in the above section.

Work properly with the LightVectors repo.

## Extensions 1

In order to make this class more versatile, update the fields with a z component.

Create constructors that allow users to create 2D and 3D vectors, and update the existing methods to consider the z component.

## Extensions 2

There are some more standard Vector methods missing from this class. Implement any of the following suggestions:
- Cross Product, returns a Vector
- getDirection returns the angle of a 2D Vector
- A static method `fromAngle` which creates a new 2D Vector from a given angle and direction
- Rotate methods
  - RotateAround might take in a Vector and a change in angle to rotate around the given vector.
  - RotateX, RotateY, and RotateZ
-
