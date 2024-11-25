import javax.swing.*;
import java.awt.*;

public class ListaPessoas extends Lista implements Pessoa {

    public ListaPessoas(JFrame principal) {
        super(principal);
    }

    @Override
    public void exibir() {
        JDialog dialog = new JDialog(principal, "Lista de Pessoas", true);
        dialog.setSize(750, 650);
        dialog.setLayout(new BorderLayout());

        dialog.add(new JLabel("Lista de Pessoas", SwingConstants.CENTER), BorderLayout.NORTH);
        dialog.add(new JTextArea("Exemplo de lista de pessoas..."), BorderLayout.CENTER);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> dialog.setVisible(false));
        dialog.add(btnFechar, BorderLayout.SOUTH);

        dialog.setLocationRelativeTo(principal);
        dialog.setVisible(true);
    }

    // Implementando os métodos da interface Pessoa

    @Override
    public String getNome() {
        return "Nome Padrão";  // Retorna um nome fictício
    }

    @Override
    public int getIdade() {
        return 30;  // Retorna uma idade fictícia
    }

    @Override
    public void exibirInfo() {
        // Exibe as informações da pessoa
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade());
    }
}
