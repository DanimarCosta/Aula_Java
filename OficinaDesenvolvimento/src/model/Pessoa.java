package model;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    private int id;
    private String nome;
    private String preferencia;
    private String streaming;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Nome da Pessoa=" + nome + "\nPreferência=" + preferencia + "\nStreaming=" + streaming + '}';
    }

    
    public Pessoa() {
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

  

    public String getStreaming() {
        return streaming;
    }

    public void setStreaming(String streaming) {
        this.streaming = streaming;
    }
    
    
}
