
package aula01;
//Simule uma situação de solicitação de dados
//Imprima na tela os resultados.

import javax.swing.JOptionPane;

public class ExercicioEntradaSaida {
//    String - Texto
//    int - Número Inteiro sem vírgula
//    float ou double = Valores com casa decimal
//            Informações de uma cadeira
// 
    public static void main(String[] args) {
    
    String cor = JOptionPane.showInputDialog(null,"Qual a cor da cadeira?");
    float peso = Float.parseFloat(JOptionPane.showInputDialog(null,"Qual o peso da cadeira em gramas?(Ex: 125"));
    double altura = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a altura da cadeira"));
    int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"informe sua altura"));
    int opc = JOptionPane.showConfirmDialog(null, "Deseja Exibir?");
    if(opc == 0){
    JOptionPane.showMessageDialog(null, "A cadeira é da cor "+cor+ "\npossui peso de "+ peso+"gramas."
            + "\n A altura é de: "+altura+" \nIdade é de: "+idade+" anos");
    }
    
    }        
}
