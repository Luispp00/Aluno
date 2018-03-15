/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis.149717
 */
public class Disciplinas {
    public String nome;
    public String departamento;
    public String status;

    @Override
    public String toString() {
        return "Disciplinas{" + "nome=" + nome + ", departamento=" + departamento + ", status=" + status + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Disciplinas(String nome, String departamento, String status) {
        this.nome = nome;
        this.departamento = departamento;
        this.status = status;
    }
    
}
