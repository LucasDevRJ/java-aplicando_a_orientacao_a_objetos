/**
 * 4. Desenvolva uma classe Aluno com os atributos privados nome e notas.
 * Utilize métodos getters e setters para acessar e modificar esses atributos.
 * Adicione um método calcularMedia que retorna a média das notas do aluno.
 */

package desafios.desafio02;

public class Aluno {

    private String nome;
    private double teste;
    private double prova;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTeste() {
        return teste;
    }

    public void setTeste(double teste) {
        this.teste = teste;
    }

    public double getProva() {
        return prova;
    }

    public void setProva(double prova) {
        this.prova = prova;
    }

    public double calcularMedia() {
        double media = (teste + prova) / 2;
        return media;
    }
}
