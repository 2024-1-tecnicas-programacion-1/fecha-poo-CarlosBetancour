package com.mycompany.fecha.poo;

public class Fecha {

    Fecha(int dia, int mes, int año) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean fechaLarga() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // TODO: Aquí va el código de la clase fechas

    boolean validarFecha() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public class FechaM {

        private int dia;
        private int mes;
        private int año;

        public FechaM(int dia, int mes, int año) {
            this.dia = dia;
            this.mes = mes;
            this.año = año;
        }
//Dado que no hay bucles ni operaciones que dependan del tamaño de los datos de entrada, la complejidad es constante. 1

        public String fechaCorta() {
            return dia + "/" + mes + "/" + año;
        }
//la complejidad es lineal. N

        public boolean validarFecha() {
            if (mes < 1 || mes > 12 || dia < 1) {
                return false;
            }
            int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
                diasPorMes[2] = 29; // Año bisiesto
            }
            return dia <= diasPorMes[mes];
        }

        public String mesLetra() {
            String[] meses = {"", "enero", "febrero", "marzo", "abril", "mayo", "junio",
                "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
            return meses[mes];
        }

        public String fechaLarga() {
            return dia + " de " + mesLetra() + " de " + año;
        }
    }
//El constructor Fecha tiene complejidad O(1).
//La función validarFecha() tiene complejidad O(N).
//No hay partes en tu código con complejidad O(N^2).
}
