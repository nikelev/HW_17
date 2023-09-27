package ait.equation;

import ait.equation.model.QuadraticEquation;

public class EquationAppl {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation1=new QuadraticEquation(2,2,2);
        QuadraticEquation quadraticEquation2=new QuadraticEquation(5,5,5);
        QuadraticEquation quadraticEquation3=new QuadraticEquation(6,7,-100);

        quadraticEquation1.display();
        System.out.println("D = "+quadraticEquation1.delta());
        System.out.println("The number of solutions is "+quadraticEquation1.quantityRoots());
        System.out.println("===============================================================");

        quadraticEquation2.display();
        System.out.println("D = "+quadraticEquation2.delta());
        System.out.println("The number of solutions is "+quadraticEquation2.quantityRoots());
        System.out.println("===============================================================");

        quadraticEquation3.display();
        System.out.println("D = "+quadraticEquation3.delta());
        System.out.println("The number of solutions is "+quadraticEquation3.quantityRoots());
        System.out.println("===============================================================");

    }
}
