 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    // Declarando as variaveis
    private int id;
    private String nome;
    private String preferencia;
    private String genero;
    private String streaming;

    public Pessoa() {
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", preferencia=" + preferencia 
                + ", genero=" + genero + ", streaming=" + streaming + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getStreaming() {
        return streaming;
    }

    public void setStreaming(String streaming) {
        this.streaming = streaming;
    }
}
