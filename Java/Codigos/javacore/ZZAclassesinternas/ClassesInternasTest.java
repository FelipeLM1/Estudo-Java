package br.com.javacore.ZZAclassesinternas;

public class ClassesInternasTest {
    private String nome = "Felipe Lima de Medeiros";

    class Interna {
        public void verClasseExterna() {
            System.out.println(nome);
            System.out.println(this);
            System.out.println(ClassesInternasTest.this);
        }
    }

    public static void main(String[] args) {
        ClassesInternasTest externa = new ClassesInternasTest();
        ClassesInternasTest.Interna in = externa.new Interna();
        ClassesInternasTest.Interna in2 = new ClassesInternasTest().new Interna();
        in.verClasseExterna();
//      in2.verClasseExterna();
    }
}
