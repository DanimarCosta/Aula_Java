/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01danimar;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Imc {
    public static void main(String[] args) {
        // Parametros da classe
        float peso = Float.parseFloat(JOptionPane.showInputDialog(null,
                "Escreva seu peso utilizando o ponto em vez da virgula"));
        
        float altura = Float.parseFloat(JOptionPane.showInputDialog(null, 
                "Insira a altura em Metros e utilizando o ponto"));
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Insira a idade um numero inteiro"));
        
        // Faz a função de print do sistema
        
        System.out.println("A sua  idade é de: "+idade+"anos, sua altura é de: "
                +altura+" CM, e você tem um peso de: "+peso+" KG");
        
        float imc = peso / (altura * altura);
        
        System.out.println("Seu IMC é igual a: "+imc);
    }
}