package br.com.javacore.Zgenerics;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consulta Cachorro");
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consulta GATO");
    }
}

public class WildCardTest {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        consultarAnimais(cachorros);
        consultarAnimais(gatos);
    }

    public static void consultarAnimais(Animal[] animais) {
        for (Animal animal : animais
        ) {
            animal.consulta();
        }
    }
}