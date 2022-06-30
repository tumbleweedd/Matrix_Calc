package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    public TextField a11;

    @FXML
    public TextField a12;

    @FXML
    public TextField a13;

    @FXML
    public TextField a21;

    @FXML
    public TextField a22;

    @FXML
    public TextField a23;

    @FXML
    public TextField a31;

    @FXML
    public TextField a32;

    @FXML
    public TextField a33;

    @FXML
    public TextField b1;

    @FXML
    public TextField b2;

    @FXML
    public TextField b3;

    @FXML
    private Button gauss;

    @FXML
    private Button progon;

    @FXML
    private TextField x1;

    @FXML
    private TextField x2;

    @FXML
    private TextField x3;
    @FXML
    private Button geg;
    @FXML
    private Button yzcob;
    @FXML
    private Button lu;
    @FXML
    private Button obrM;
    @FXML
    private Button opred;
    @FXML
    private TextField opr;


    @FXML
    void initialize() {
        geg.setOnAction(actionEvent -> {
            double A11 = Double.parseDouble(a11.getText());
            double A12 = Double.parseDouble(a12.getText());
            double A13 = Double.parseDouble(a13.getText());
            double A21 = Double.parseDouble(a21.getText());
            double A22 = Double.parseDouble(a22.getText());
            double A23 = Double.parseDouble(a23.getText());
            double A31 = Double.parseDouble(a31.getText());
            double A32 = Double.parseDouble(a32.getText());
            double A33 = Double.parseDouble(a33.getText());
            double B1 = Double.parseDouble(b1.getText());
            double B2 = Double.parseDouble(b2.getText());
            double B3 = Double.parseDouble(b3.getText());


            double[][] aaStr = {
                    {A11, A12, A13},
                    {A21, A22, A23},
                    {A31, A32, A33}
            };
            double[] bb = {B1, B2, B3};

            int n = 3;
            int m = 3;

            double eps = 0.001;

            double[][] A = new double[100][100];
            double[] b = new double[100];


            for (int i = 0; i < n; i++) {
                A[i] = new double[100];
                for (int j = 0; j < m; j++) {
                    A[i][j] = aaStr[i][j];
                }
                b[i] = bb[i];
            }


            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = 1;
            }

            double[] xn = new double[n];

            do {
                for (int i = 0; i < n; i++) {
                    xn[i] = b[i] / A[i][i];
                    for (int j = 0; j < n; j++) {
                        if (i == j) {
                            continue;
                        } else {
                            xn[i] -= A[i][j] / A[i][i] * res[j];
                        }
                    }
                }

                boolean flag = true;
                for (int i = 0; i < n - 1; i++) {
                    if (Math.abs(xn[i] - res[i]) > eps) {
                        flag = false;
                        break;
                    }
                }
                for (int i = 0; i < n; i++) {
                    res[i] = xn[i];
                }

                if (flag) {
                    break;
                }
            } while (true);


            x1.setText(String.valueOf(xn[0]));
            x2.setText(String.valueOf(xn[1]));
            x3.setText(String.valueOf(xn[2]));
        });


        yzcob.setOnAction(actionEvent -> {
            double A11 = Double.parseDouble(a11.getText());
            double A12 = Double.parseDouble(a12.getText());
            double A13 = Double.parseDouble(a13.getText());
            double A21 = Double.parseDouble(a21.getText());
            double A22 = Double.parseDouble(a22.getText());
            double A23 = Double.parseDouble(a23.getText());
            double A31 = Double.parseDouble(a31.getText());
            double A32 = Double.parseDouble(a32.getText());
            double A33 = Double.parseDouble(a33.getText());
            double B1 = Double.parseDouble(b1.getText());
            double B2 = Double.parseDouble(b2.getText());
            double B3 = Double.parseDouble(b3.getText());


            double[][] aaStr = {
                    {A11, A12, A13},
                    {A21, A22, A23},
                    {A31, A32, A33}
            };
            double[] bb = {B1, B2, B3};

            int n = 3;
            int m = 3;

            double xi = 0;
            double eps = 0.001;
            double x0 = 0;

            double[][] A = new double[100][100];
            double[] b = new double[100];


            for (int i = 0; i < n; i++) {
                A[i] = new double[100];
                for (int j = 0; j < m; j++) {
                    A[i][j] = aaStr[i][j];
                }
                b[i] = bb[i];
            }

            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = b[i] / A[i][i];
            }

            double[] xn = new double[n];

            do {
                for (int i = 0; i < n; i++) {
                    xn[i] = b[i] / A[i][i];
                    for (int j = 0; j < n; j++) {
                        if (i == j) {
                            continue;
                        } else {
                            xn[i] -= A[i][j] / A[i][i] * res[j];
                        }
                    }
                }

                boolean flag = true;
                for (int i = 0; i < n - 1; i++) {
                    if (Math.abs(xn[i] - res[i]) > eps) {
                        flag = false;
                        break;
                    }
                }
                for (int i = 0; i < n; i++) {
                    res[i] = xn[i];
                }

                if (flag) {
                    break;
                }
            } while (true);


            x1.setText(String.valueOf(xn[0]));
            x2.setText(String.valueOf(xn[1]));
            x3.setText(String.valueOf(xn[2]));

        });


        gauss.setOnAction(actionEvent -> {
            double A11 = Double.parseDouble(a11.getText());
            double A12 = Double.parseDouble(a12.getText());
            double A13 = Double.parseDouble(a13.getText());
            double A21 = Double.parseDouble(a21.getText());
            double A22 = Double.parseDouble(a22.getText());
            double A23 = Double.parseDouble(a23.getText());
            double A31 = Double.parseDouble(a31.getText());
            double A32 = Double.parseDouble(a32.getText());
            double A33 = Double.parseDouble(a33.getText());
            double B1 = Double.parseDouble(b1.getText());
            double B2 = Double.parseDouble(b2.getText());
            double B3 = Double.parseDouble(b3.getText());


            double[][] aaStr = {
                    {A11, A12, A13},
                    {A21, A22, A23},
                    {A31, A32, A33}
            };
            double[] bb = {B1, B2, B3};

            int n = 3;
            int m = 3;

            double[][] A = new double[100][100];
            double[] b = new double[100];


            for (int i = 0; i < n; i++) {
                A[i] = new double[100];
                for (int j = 0; j < m; j++) {
                    A[i][j] = aaStr[i][j];
                }
                b[i] = bb[i];
            }

            //Прямой ход
            int N = n;
            for (int p = 0; p < N; p++) {
                for (int i = p + 1; i < N; i++) {
                    double alpha = A[i][p] / A[p][p];
                    b[i] -= alpha * b[p];
                    for (int j = p; j < N; j++) {
                        A[i][j] -= alpha * A[p][j];
                    }
                }
            }

            //Обратный ход
            double[] x = new double[N];
            for (int i = N - 1; i >= 0; i--) {
                double sum = 0.0;
                for (int j = i + 1; j < N; j++) {
                    sum += A[i][j] * x[j];
                }
                x[i] = (b[i] - sum) / A[i][i];
            }

            x1.setText(String.valueOf(x[0]));
            x2.setText(String.valueOf(x[1]));
            x3.setText(String.valueOf(x[2]));

        });

        progon.setOnAction(actionEvent -> {
            double A11 = Double.parseDouble(a11.getText());
            double A12 = Double.parseDouble(a12.getText());
            double A13 = Double.parseDouble(a13.getText());
            double A21 = Double.parseDouble(a21.getText());
            double A22 = Double.parseDouble(a22.getText());
            double A23 = Double.parseDouble(a23.getText());
            double A31 = Double.parseDouble(a31.getText());
            double A32 = Double.parseDouble(a32.getText());
            double A33 = Double.parseDouble(a33.getText());
            double B1 = Double.parseDouble(b1.getText());
            double B2 = Double.parseDouble(b2.getText());
            double B3 = Double.parseDouble(b3.getText());


            double[][] aaStr = {
                    {A11, A12, A13},
                    {A21, A22, A23},
                    {A31, A32, A33}
            };
            double[] bb = {B1, B2, B3};

            int n = 3;
            int m = 3;

            double[][] A = new double[100][100];
            double[] b = new double[100];

            for (int i = 0; i < n; i++) {
                A[i] = new double[100];
                for (int j = 0; j < m; j++) {
                    A[i][j] = aaStr[i][j];
                }
                b[i] = bb[i];
            }

            //Прогонка
            double y1, a1, bb1, y2, a2, bb2, y3, bb3;

            y1 = A11;
            a1 = -A12 / y1;
            bb1 = b[0] / y1;
            y2 = A22 + A21 * a1;
            a2 = -A23 / y2;
            bb2 = (b[1] - A21 * bb1) / y2;
            y3 = A33 + A32 * a2;
            bb3 = (b[2] - A32 * bb2) / y3;

            double xx3 = bb3;
            double xx2 = a2 * xx3 + bb2;
            double xx1 = a1 * xx2 + bb1;

            x1.setText(String.valueOf(xx1));
            x2.setText(String.valueOf(xx2));
            x3.setText(String.valueOf(xx3));
        });

        lu.setOnAction(actionEvent -> {
            double A11 = Double.parseDouble(a11.getText());
            double A12 = Double.parseDouble(a12.getText());
            double A13 = Double.parseDouble(a13.getText());
            double A21 = Double.parseDouble(a21.getText());
            double A22 = Double.parseDouble(a22.getText());
            double A23 = Double.parseDouble(a23.getText());
            double A31 = Double.parseDouble(a31.getText());
            double A32 = Double.parseDouble(a32.getText());
            double A33 = Double.parseDouble(a33.getText());
            double B1 = Double.parseDouble(b1.getText());
            double B2 = Double.parseDouble(b2.getText());
            double B3 = Double.parseDouble(b3.getText());

            double[][] aStr = {
                    {A11, A12, A13},
                    {A21, A22, A23},
                    {A31, A32, A33}
            };
            double[] bb = {B1, B2, B3};
            int n = 3;
            double[][] array = new double[100][100];
            double[] b = new double[100];

            for (int i = 0; i < n; i++) {
                array[i] = new double[100];
                for (int j = 0; j < n; j++) {
                    array[i][j] = aStr[i][j];
                }
                b[i] = bb[i];
            }

            double[][] L = new double[100][100];
            double[][] U = new double[100][100];
            double sum;
            double[] x = new double[100];


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



            x1.setText(String.valueOf(x[0]));
            x2.setText(String.valueOf(x[1]));
            x3.setText(String.valueOf(x[2]));

        });

        opred.setOnAction(actionEvent -> {
            double c;
            double max;
            double det = 1;
            int n = 3;
            double A11 = Double.parseDouble(a11.getText());
            double A12 = Double.parseDouble(a12.getText());
            double A13 = Double.parseDouble(a13.getText());
            double A21 = Double.parseDouble(a21.getText());
            double A22 = Double.parseDouble(a22.getText());
            double A23 = Double.parseDouble(a23.getText());
            double A31 = Double.parseDouble(a31.getText());
            double A32 = Double.parseDouble(a32.getText());
            double A33 = Double.parseDouble(a33.getText());
            double B1 = Double.parseDouble(b1.getText());
            double B2 = Double.parseDouble(b2.getText());
            double B3 = Double.parseDouble(b3.getText());

            double[][] aStr = {
                    {A11, A12, A13},
                    {A21, A22, A23},
                    {A31, A32, A33}
            };
            double[] bb = {B1, B2, B3};
            double[][] A = new double[100][100];

            for (int i = 0; i < n; i++) {
                A[i] = new double[100];
                for (int j = 0; j < n; j++) {
                    A[i][j] = aStr[i][j];
                }
            }

            for (int i = 0; i < n; i++) {
                max = Math.abs(A[i][i]);
                int index = i;
                //Находим максимальный элемент строки по модулю
                for (int j = i + 1; j < n; j++) {
                    if (max < Math.abs(A[i][j])) {
                        index = j;
                        max = Math.abs(A[i][index]);
                    }
                }
                //Меняем элементы строки от большего к меньшему
                if (index != i) {
                    for (int j = i; j < n; j++) {
                        c = A[j][i];
                        A[j][i] = A[j][index];
                        A[j][index] = c;
                    }
                    det = -det;
                }
                //Прямой ход Гаусса
                for (int k = i + 1; k < n; k++) {
                    c = A[k][i] / A[i][i];
                    for (int j = i; j < n; j++) {
                        A[k][j] -= A[i][j] * c;
                    }
                }
            }

            //Определитель равен произведению главных элементов
            for (int i = 0; i < n; i++) {
                det *= A[i][i];
            }
            opr.setText(String.valueOf(det));
        });

        obrM.setOnAction(actionEvent -> {
            double A11 = Double.parseDouble(a11.getText());
            double A12 = Double.parseDouble(a12.getText());
            double A13 = Double.parseDouble(a13.getText());
            double A21 = Double.parseDouble(a21.getText());
            double A22 = Double.parseDouble(a22.getText());
            double A23 = Double.parseDouble(a23.getText());
            double A31 = Double.parseDouble(a31.getText());
            double A32 = Double.parseDouble(a32.getText());
            double A33 = Double.parseDouble(a33.getText());
            double B1 = Double.parseDouble(b1.getText());
            double B2 = Double.parseDouble(b2.getText());
            double B3 = Double.parseDouble(b3.getText());

            double[][] aStr = {
                    {A11, A12, A13},
                    {A21, A22, A23},
                    {A31, A32, A33}
            };
            double[] bb = {B1, B2, B3};
            int n = 3;
            double[][] array = new double[100][100];
            double[] b = new double[100];

            for (int i = 0; i < n; i++) {
                array[i] = new double[100];
                for (int j = 0; j < n; j++) {
                    array[i][j] = aStr[i][j];
                }
                b[i] = bb[i];
            }

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
            double[] x = new double[100];
            for (int i = n - 1; i >= 0; i--) {
                sum3 = 0;
                for (int j = n - 1; j > i; j--) {
                    sum3 += U[i][j] * x[j];
                }
                x[i] = y[i] - sum3;
            }

            double temp;
            float[][] E = new float[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) {
                    E[i][j] = 0f;

                    if (i == j)
                        E[i][j] = 1f;
                }

            for (int k = 0; k < n; k++) {
                temp = array[k][k];

                for (int j = 0; j < n; j++) {
                    array[k][j] /= temp;
                    E[k][j] /= temp;
                }

                for (int i = k + 1; i < n; i++) {
                    temp = array[i][k];

                    for (int j = 0; j < n; j++) {
                        array[i][j] -= array[k][j] * temp;
                        E[i][j] -= E[k][j] * temp;
                    }
                }
            }

            for (int k = n - 1; k > 0; k--) {
                for (int i = k - 1; i >= 0; i--) {
                    temp = array[i][k];

                    for (int j = 0; j < n; j++) {
                        array[i][j] -= array[k][j] * temp;
                        E[i][j] -= E[k][j] * temp;
                    }
                }
            }

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    array[i][j] = E[i][j];


            a11.setText(String.valueOf(array[0][0]));
            a12.setText(String.valueOf(array[0][1]));
            a13.setText(String.valueOf(array[0][2]));
            a21.setText(String.valueOf(array[1][0]));
            a22.setText(String.valueOf(array[1][1]));
            a23.setText(String.valueOf(array[1][2]));
            a31.setText(String.valueOf(array[2][0]));
            a32.setText(String.valueOf(array[2][1]));
            a33.setText(String.valueOf(array[2][2]));
            b1.clear();
            b2.clear();
            b3.clear();


        });


    }


    public void pere1(ActionEvent event) {
    }
}