/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aumentodesalariobeecrowd1048;

import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class AumentoDeSalarioBeecrowd1048 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        double sal = teclado.nextDouble();
        
        if (sal >=0 && sal <= 400) {            
            double novosal = sal*1.15;
            double reajuste = novosal - sal;
            System.out.println(String.format("Novo salario: %.2f", novosal));
            System.out.println(String.format("Reajuste ganho: %.2f", reajuste));
            System.out.println("Em percentual: 15 %");
        } else if (sal > 400 && sal <= 800) {
            double novosal = sal*1.12;
            double reajuste = novosal - sal;
            System.out.println(String.format("Novo salario: %.2f", novosal));
            System.out.println(String.format("Reajuste ganho: %.2f", reajuste));
            System.out.println("Em percentual: 12 %");
        } else if (sal > 800 && sal <= 1200) {
            double novosal = sal*1.1;
            double reajuste = novosal - sal;
            System.out.println(String.format("Novo salario: %.2f", novosal));
            System.out.println(String.format("Reajuste ganho: %.2f", reajuste));
            System.out.println("Em percentual: 10 %");
        } else if (sal > 1200 && sal <= 2000) {
            double novosal = sal*1.07;
            double reajuste = novosal - sal;
            System.out.println(String.format("Novo salario: %.2f", novosal));
            System.out.println(String.format("Reajuste ganho: %.2f", reajuste));
            System.out.println("Em percentual: 7 %");
        } else {
            double novosal = sal*1.04;
            double reajuste = novosal - sal;
            System.out.println(String.format("Novo salario: %.2f", novosal));
            System.out.println(String.format("Reajuste ganho: %.2f", reajuste));
            System.out.println("Em percentual: 4 %");
        }
        
    
    }
    
}
