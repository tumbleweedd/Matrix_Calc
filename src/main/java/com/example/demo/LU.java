package com.example.demo;

public class LU extends HelloController {
    double n = 3;
    public static double[] x = new double[100];

    double[] lu(double[][] aStr, double[] b, double[] x) {
        double[][] L = new double[100][100];
        double[][] U = new double[100][100];
        double sum;


        //Определение элементов матрицы L
        for (int j = 0; j < n; j++) {
            for (int i = j; i < n; i++) {
                sum = 0;
                for (int k = 0; k < j; k++) {
                    sum += L[i][k] * U[k][j];
                }
                L[i][j] = aStr[i][j] - sum;
            }

            //Определение элементов матрицы U
            for (int i = j; i < n; i++) {
                sum = 0;
                for (int k = 0; k < j; k++) {
                    sum += L[j][k] * U[k][i];
                }
                U[j][i] = (aStr[j][i] - sum) / L[j][j];
            }
        }


        //Так как LU разложение получено, то решение исходной системы сводится к
        //последовательному решению двух систем уравнений
        //Ниже - система LY = B, где Y = [y1, y2, ..., yn]
        double sum2;
        double[] y = new double[100];
        for (int i = 0; i < n; i++) {
            sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum2 += y[j] * L[i][j];
            }
            y[i] = (b[i] - sum2) / (L[i][i]);

        }

        //Находим значения X
        double sum3;
        for (int i = (int) (n - 1); i >= 0; i--) {
            sum3 = 0;
            for (int j = (int) (n - 1); j > i; j--) {
                sum3 += U[i][j] * x[j];
            }
            x[i] = y[i] - sum3;
        }
        return x;
    }
}

