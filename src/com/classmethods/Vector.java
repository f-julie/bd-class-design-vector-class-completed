package com.classmethods;

public class Vector {

    private float x;
    private float y;

    public Vector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    //Mutating method.
    public void add(Vector other) {
        this.x += other.x; //same as x += other.x;
        this.y += other.y;
    }

    public void sub(Vector other) {
        this.x -= other.x; //same as x -= other.x;
        this.y -= other.y;
    }

    public void mult(float value) {
        this.x *= value; //same as x *= value;
        this.x *= value;
    }

    //Non-mutating method. Builds a third vector to return rather than changing an existing vector.
    public Vector plus(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

    public Vector minus(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }

    public Vector times(float value) {
        return new Vector(this.x * value, this.y * value);
    }

    @Override
    public String toString() {
        return String.format("<%.1f, %.1f>", x, y);
    }

    public float magnitude() {
        return (float) Math.sqrt(magSq());
    }

    //Non-mutating. Do a math calculation and return an answer.
    public float magSq() {
        return x * x + y * y;
    }

    //Mutating.
    public void normalize() {
        //divide x and y by magnitude
        float mag = magnitude(); //So magnitude is the same both times below.
        this.x /= mag;
        this.y /= mag;
    }

    //Non-mutating. Returns a new vector. Void methods are usually mutating. Non-void are usually non-mutating.
    public Vector normalized() {
        Vector v = new Vector(x,y);
        v.normalize();
        return v;

        //This is okay too
        //float mag = magnitude();
        //Vector v = new Vector(x/mag, y/mag);
        //return v;

        //This is wrong. This would be mutating.
        //normalize();
        //return this;
    }

    public float dot(Vector other) {
        Vector normalizedThis = this.normalized();
        Vector normalizedOther = other.normalized();

        return normalizedThis.x * normalizedOther.x + normalizedThis.y * normalizedOther.y;
    }

}
