package br.com.javacore.Gassociacao.classes;

public class Professor {
    private String nomeProf;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nomeProf, String especialidade) {
        this.nomeProf = nomeProf;
        this.especialidade = especialidade;
    }

    public Professor() {

    }

    public void print() {
        System.out.println("---- RELATORIO PROFESSOR ---- ");
        System.out.println("NOME :" + this.nomeProf);
        System.out.println("ESPECIALIDADE: " + this.especialidade);
        if(this.seminarios != null && seminarios.length != 0) {
            for (int i = 0; i < this.seminarios.length; i++) {
                System.out.println("SEMINARIO : " + this.seminarios[i].getTitulo());
            }
            return;
        }
        System.out.println("Professor nao vinculado !");

    }


    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
