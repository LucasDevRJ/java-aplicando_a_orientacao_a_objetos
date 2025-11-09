/**
 * Crie uma classe Aluno com atributos nome, idade,
 * e um método para exibir informações.
 * Crie uma instância da classe Aluno, atribua valores aos seus atributos
 * e utilize o método para exibir as informações.
 */

package desafios;

public class Aluno {

    String nome;
    int idade;

    public void exibeInformacoesDoAluno() {
        System.out.println("----------|Aluno|----------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }
}
