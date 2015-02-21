package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        HorizontalLine horizontalline = new HorizontalLine();
        VerticalLine verticalline = new VerticalLine();
        Triangle triangle = new Triangle();
        IsoscelesTriangle isoscelestriangle = new IsoscelesTriangle();
        Diamond diamond = new Diamond();
        DiamondWithName diamondwithname = new DiamondWithName();
        FizzBuzzClass fizzbuzzclass = new FizzBuzzClass();
        Star star = new Star();
        PrimeFactor primefactor = new PrimeFactor();
        horizontalline.draw();
        verticalline.draw();
        triangle.draw();
        isoscelestriangle.draw();
        diamond.draw();
        diamondwithname.draw();
        fizzbuzzclass.FizzBuzz();
        star.draw();
        primefactor.generate();
    }


}

class Star {
    public void draw() {
        System.out.println("*");
    }
}

class HorizontalLine {


    public void draw() {

        int i, n;
        n = 8;
        for (i = 0; i < n; i++) {
            System.out.print("*");
        }

    }
}

class VerticalLine {
    public void draw() {
        int i, n;
        n = 8;
        for (i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}

class Triangle {
    public void draw() {
        int i, j, n;
        n = 4;
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


class IsoscelesTriangle {
    public void draw() {
        int i, j, n, k;
        n = k = 4;
        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {
                if (j < k) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            k--;
            System.out.println();
        }
    }
}

class Diamond {
    public void draw() {
        int i, j, n, k;
        n = k = 4;
        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {
                if (j < k) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            k--;
            System.out.println();
        }

        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {
                if (j < k) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            k++;
            System.out.println();
        }

    }
}

class DiamondWithName {
    public void draw() {
        int i, j, n, k;
        n = k = 4;
        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {
                if (j < k) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            k--;
            System.out.println();
        }
        System.out.println("Juhi");
        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {
                if (j < k) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            k++;
            System.out.println();
        }

    }
}

class FizzBuzzClass {
    public void FizzBuzz() {
        int i;
        for (i = 1; i <= 20; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (i % 5 == 0) {
                System.out.println("Buzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else {
                System.out.println(i);

            }

        }
    }
}

class PrimeFactor {
    public void generate() {
        int n, i;
        n = 30;
        for (i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    System.out.println(i);
                }

            }
        }
    }

    public boolean isPrime(int no) {
        int i;
        for (i = 2; i < no / 2; i++) {
            if (no % i == 0 && no != i && no != 1) {
                return false;
            }
        }
        return true;
    }
}