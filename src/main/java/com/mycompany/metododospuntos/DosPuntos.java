/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.metododospuntos;

import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class DosPuntos {
    static void calcularDistanciaDosPunto(double x1, double y1, double x2, double y2) {
        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;
        diferenciaX = Math.pow(diferenciaX, 2);
        diferenciaY = Math.pow(diferenciaY, 2);
        double distancia = Math.sqrt(diferenciaX + diferenciaY);
        System.out.println("La distancia es: " + distancia);
    }
    public static void main(String[] args) {
        System.out.println("Introduce X1: ");
        Scanner inputX1 = new Scanner(System.in);
        double x1 = inputX1.nextDouble();
        System.out.println("Introduce Y1: ");
        Scanner inputY1 = new Scanner(System.in);
        double y1 = inputY1.nextDouble();
        System.out.println("Introduce X2: ");
        Scanner inputX2 = new Scanner(System.in);
        double x2 = inputX2.nextDouble();
        System.out.println("Introduce Y2: ");
        Scanner inputY2 = new Scanner(System.in);
        double y2 = inputY2.nextDouble();
        calcularDistanciaDosPunto(x1, y1, x2, y2);
    }
}
