package br.com.javacore.Gassociacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Seminario() {
    }

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Aluno[] alunos, Professor professor, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.professor = professor;
        this.local = local;
    }

    public void print() {
        System.out.println("======== RELATORIO SEMINARIO =======");
        System.out.println("TITULO : " + this.titulo);

        if (this.alunos != null && this.alunos.length != 0) {
            System.out.println("LISTA DE ALUNOS: ");
            for (int i = 0; i < this.alunos.length; i++) {
                System.out.println(this.alunos[i].getNomeAluno());
            }
        } else {
            System.out.println("Nenhum aluno cadastrado! ");
        }
        System.out.println("PROFESSOR : " + this.professor.getNomeProf());
        if (this.local != null) {
            System.out.println("LOCAL : " + this.local.getRua() + "\nBAIRRO: " + this.local.getBairro());
        } else {
            System.out.println("Nenhum local vinculado ! ");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
