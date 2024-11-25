import javax.swing.*;
import java.awt.*;

public class CadastroUsuarios extends Cadastro implements Pessoa {
    private String nome;
    private int idade;

    // Construtor para inicializar a classe com nome e idade (podem ser definidos dinamicamente)
    public CadastroUsuarios(JFrame principal, String nome, int idade) {
        super(principal);
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void exibirInfo() {
        // Exibe as informações do usuário
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\nIdade: " + getIdade());
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void exibir() {
        // Lógica original de exibição do cadastro de usuário
        JDialog dialog = new JDialog(principal, "Cadastro de Usuários", true);
        dialog.setSize(600, 300);
        dialog.setLayout(new BorderLayout());

        JLabel titulo = new JLabel("Cadastro de Usuários", SwingConstants.CENTER);
        dialog.add(titulo, BorderLayout.NORTH);

        JPanel painelCampos = new JPanel(new GridLayout(4, 2, 5, 5));
        painelCampos.add(new JLabel("Usuário:"));
        painelCampos.add(new JTextField(25));
        painelCampos.add(new JLabel("Senha:"));
        painelCampos.add(new JPasswordField(15));
        painelCampos.add(new JLabel("Email:"));
        painelCampos.add(new JTextField(30));
        painelCampos.add(new JLabel("Ativo:"));
        painelCampos.add(new JRadioButton());

        dialog.add(painelCampos, BorderLayout.CENTER);
        dialog.add(new BotoesCadastro(dialog).criar(), BorderLayout.SOUTH);

        dialog.setLocationRelativeTo(principal);
        dialog.setVisible(true);
    }
}