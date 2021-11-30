package ru.afanasev.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Fraction extends Number {
    private int numerator;
    private int denominator;
    private static List<Fraction> fractions = new ArrayList<>();

   private Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;

    }

    private Fraction(int numerator, int denominator) {

        if (denominator < 0) throw new IllegalArgumentException("is not a legal denominator;");

        this.numerator = numerator;
        this.denominator = denominator;
    }

    //
    public static Fraction createFraction(int num, int den) {
        /*int nod = nod(num, den);
       int den1= den / nod;
       int num1 =  num / nod;*/
        Fraction bf = fractions.stream()
                .filter(x -> (x.denominator == den && x.numerator == num))
                .findFirst()
                .orElse(null);
        if (bf != null) return bf;
        bf = new Fraction(num, den);
        fractions.add(bf);
        return bf;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction sum(Fraction fr) {
        int denominator = this.denominator * fr.denominator;
        int numerator = this.numerator * fr.denominator + fr.numerator * this.denominator;
        int nod1 = nod(numerator, denominator);
        denominator /= nod1;
        numerator /= nod1;
        return new Fraction(numerator, denominator);
    }

    public Fraction div(Fraction fr) {
        int denominator = this.denominator * fr.numerator;
        int numerator = this.numerator * fr.denominator;
        int nod1 = nod(numerator, denominator);
        denominator /= nod1;
        numerator /= nod1;
        return new Fraction(numerator, denominator);

    }

    public Fraction mult(Fraction fr) {
        int denominator = this.denominator * fr.denominator;
        int numerator = this.numerator * fr.numerator;
        int nod1 = nod(numerator, denominator);
        denominator /= nod1;
        numerator /= nod1;
        return new Fraction(numerator, denominator);
    }

    public Fraction minus(Fraction fr) {
        int denominator = this.denominator * fr.denominator;
        int numerator = this.numerator * fr.denominator - fr.numerator * this.denominator;
        int nod1 = nod(numerator, denominator);
        denominator /= nod1;
        numerator /= nod1;
        return new Fraction(numerator, denominator);
    }


    public static Fraction sum(Fraction fr1, Fraction fr2) {

        int denominator = fr1.denominator * fr2.denominator;
        int numerator = fr1.numerator * fr2.denominator + fr2.numerator * fr1.denominator;
        int nod1 = nod(numerator, denominator);
        denominator /= nod1;
        numerator /= nod1;
        Fraction sumFr = new Fraction(numerator, denominator);
        return sumFr;


    }

    public static int nod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return nod(b, a % b);
    }

    @Override
    public int intValue() {
        return (int) numerator / denominator;
    }

    @Override
    public long longValue() {
        return numerator / (long) denominator;
    }

    @Override
    public float floatValue() {
        return numerator / (long) denominator;
    }

    @Override
    public double doubleValue() {
        return numerator / (double) denominator;
    }

    @Override
    protected Fraction clone() throws CloneNotSupportedException {
        return new Fraction(this.numerator, this.denominator);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    /* считать hash сразу при создании */
    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }


    @Override
    public String toString() {
        return numerator + "/"
                + denominator;
    }
}

