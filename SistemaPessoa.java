import javax.swing.*;
import java.awt.*;

public class SistemaPessoa {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Sistema de Pessoa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuVisualizacao = new JMenu("Visualização");
        JMenu menuSair = new JMenu("Sair");
        menuBar.add(menuCadastro);
        menuBar.add(menuVisualizacao);
        menuBar.add(menuSair);
        frame.setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panel.add(new JLabel("Nome:"));
        JTextField nomeField = new JTextField();
        panel.add(nomeField);

        panel.add(new JLabel("Endereço:"));
        JTextField enderecoField = new JTextField();
        panel.add(enderecoField);

        panel.add(new JLabel("Cidade:"));
        JTextField cidadeField = new JTextField();
        panel.add(cidadeField);

        panel.add(new JLabel("UF:"));
        JTextField ufField = new JTextField();
        panel.add(ufField);

        panel.add(new JLabel("Email:"));
        JTextField emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Telefone:"));
        JTextField telefoneField = new JTextField();
        panel.add(telefoneField);

        panel.add(new JLabel("Sexo:"));
        String[] opcoesSexo = {"Masculino", "Feminino", "Outro"};
        JComboBox<String> sexoComboBox = new JComboBox<>(opcoesSexo);
        panel.add(sexoComboBox);

        frame.add(panel, BorderLayout.CENTER);

        JPanel rodape = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel rodapeLabel = new JLabel("Versão: 07.07.2024    Usuário: Matheus Ribeiro    Data de acesso: 23/10/2024 10:38");
        rodape.add(rodapeLabel);
        frame.add(rodape, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}