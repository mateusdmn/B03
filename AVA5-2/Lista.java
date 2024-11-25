import javax.swing.*;

public abstract class Lista implements Pessoa {
    protected final JFrame principal;

    public Lista(JFrame principal) {
        this.principal = principal;
    }

    // Implementando os métodos da interface Pessoa
    @Override
    public String getNome() {
        return "Nome não definido";  // Como exemplo, um nome padrão
    }

    @Override
    public int getIdade() {
        return 0;  // Retornando 0 como idade padrão
    }

    @Override
    public void exibirInfo() {
        // Exibe uma mensagem simples com o nome e idade
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade());
    }

    public abstract void exibir();  // Método abstrato para as subclasses implementarem
}