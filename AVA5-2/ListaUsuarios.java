import javax.swing.*;
import java.awt.*;

public class ListaUsuarios extends Lista implements Pessoa {

    public ListaUsuarios(JFrame principal) {
        super(principal);
    }

    @Override
    public void exibir() {
        JDialog dialog = new JDialog(principal, "Lista de Usuários", true);
        dialog.setSize(750, 650);
        dialog.setLayout(new BorderLayout());

        dialog.add(new JLabel("Lista de Usuários", SwingConstants.CENTER), BorderLayout.NORTH);
        dialog.add(new JTextArea("Exemplo de lista de usuários..."), BorderLayout.CENTER);

        JButton btnFechar = new JButton("Fechar");
        btnFechar.addActionListener(e -> dialog.setVisible(false));
        dialog.add(btnFechar, BorderLayout.SOUTH);

        dialog.setLocationRelativeTo(principal);
        dialog.setVisible(true);
    }

    // Implementando os métodos da interface Pessoa

    @Override
    public String getNome() {
        return "Usuário Padrão";  // Retorna um nome fictício para o usuário
    }

    @Override
    public int getIdade() {
        return 25;  // Retorna uma idade fictícia para o usuário
    }

    @Override
    public void exibirInfo() {
        // Exibe as informações do usuário no console
        System.out.println("Nome: " + getNome() + ", Idade: " + getIdade());
    }
}