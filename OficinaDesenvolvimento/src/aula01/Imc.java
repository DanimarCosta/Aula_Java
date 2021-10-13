/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Aluno
 */
public class Imc {
    public static void main(String[] args) {
        
        //Nesta parte vai imprimir as mensagens na tela
        //Quando tem o println ele imprime e cria uma linha nova
        //Imprimindo o Hellow World no terminal
        System.out.println("Senai");
        System.out.println("Olá Mundo");
        
        //Imprimindo utilizando Janela(SWING)
        JOptionPane.showMessageDialog(null, "Hellow World");
        
        //Coletando Informações do Usuário
        //Coletando informações com objeto da classe Scanner
        Scanner abc = new Scanner(System.in);
        System.out.println("Informe sua cidade");
        String cidade = abc.next();
        System.out.println("Você mora na cidade "+cidade);
        //Coletando informações com JOPTIONPANE
        String nome = JOptionPane.showInputDialog(null,"Informe seu nome");
        JOptionPane.showMessageDialog(null,"Seu nome é: "+nome);
        
        
        
     }
}
