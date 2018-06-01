/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_extraclase01b2;

/**
 *
 * @author Israel
 */
public class Tarea_ExtraClase01B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] meses = {"Agosto", "Octubre", "Diciembre"};                             //  | Arrays de tipo String con sus valores
        String[] sucursales = {"sucursal 1", "sucursal 2", "sucursal 3", "sucursal 4"};  //  |

        double[] ventas_mes_1 = {4500.2, 5500.2, 6500.2, 2500.1};//    |
        double[] ventas_mes_2 = {1500.2, 2500.2, 3500.2, 1500.1};//    | 
        double[] ventas_mes_3 = {2300.2, 1200.2, 4700.2, 3200.1};//    |  Arrays de tipo double con sus valores
        double[] venta_total_sucursal = new double[4];           //    |
        double[] venta_promedio_sucursal = new double[4];        //    |
        double ventas_totales = 0;
        int[] cantidad_sucursales = new int[4];                  //    | Array de tipo int para la cantidad de sucursales          

        for (int i = 0; i < cantidad_sucursales.length; i++) {   //    | Ciclo for para recorrer el número de sucursales
            double venta_total_sucursales = ventas_mes_1[i] + ventas_mes_2[i] + ventas_mes_3[i]; // Variable para sacar el total de las ventas de las sucursales en los 3 mesess
            double venta_promedio_sucursales = (venta_total_sucursales / 3); // Variable para sacar el promedio de  de las ventas de las sucursales en los 3 mesess

            ventas_totales = ventas_totales + venta_total_sucursales; // Variable acumuladora de las ventas de las sucursales

            venta_total_sucursal[i] = venta_total_sucursales;  // Almacenamiento de datos en la posicion del arreglo venta_total_sucursal[i]    
            venta_promedio_sucursal[i] = venta_promedio_sucursales; // Almacenamiento de datos en la posicion del arreglo venta_promedio_sucursal[i]

        }
        System.out.println("Reporte: "); // Presentacion 'Reporte: '

        for (int i = 0; i < 3; i++) { // Ciclo for para recorrer los 3 meses

            System.out.printf("\t\t%s", meses[i]); //Presentación del array meses[i]
        }

        System.out.printf("\t%s\t\t\t%s\n", "Total", "Promedio"); // Concatenación del array con 'Total', 'Promedio'

        for (int i = 0; i < cantidad_sucursales.length; i++) { // Ciclo For para recorrer las sucursales y presentar

            System.out.printf("%s\t%.2f\t\t%.2f\t\t%.2f\t\t%-10.2f\t\t%.2f\t\n", sucursales[i], ventas_mes_1[i], ventas_mes_2[i], ventas_mes_3[i], venta_total_sucursal[i], venta_promedio_sucursal[i]);
            // ⇑ Presentación de la tabla de sucursales, ventas, totales y promedio ⇑
        }
        System.out.println();
        System.out.printf("Totales de ventas de todas la sucursales es: %.2f\n", ventas_totales); // Presentación del total de ventas de todas las sucursales
    }

}
