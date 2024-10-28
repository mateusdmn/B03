import java.awt.*;
import javax.swing.*;

public class SistemaPessoa {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SistemaPessoa::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        // Criação da janela principal
        JFrame mainWindow = new JFrame("Sistema de Pessoas");
        mainWindow.setSize(600, 400);
        mainWindow.setLocationRelativeTo(null); // Centraliza a janela
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLayout(new BorderLayout());

        // Painel de rodapé
        JPanel footerPanel = new JPanel();
        footerPanel.add(new JLabel("Data de acesso: 20/09/2024 10:58"));
        mainWindow.add(footerPanel, BorderLayout.SOUTH);

        // Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenuItem itemUsuarios = new JMenuItem("Cadastro de Usuários");
        JMenuItem itemPessoas = new JMenuItem("Cadastro de Pessoas");
        menuCadastro.add(itemUsuarios);
        menuCadastro.add(itemPessoas);

        JMenu menuVisualizacao = new JMenu("Visualização");
        JMenuItem itemListaUsuarios = new JMenuItem("Lista de usuários");
        JMenuItem itemListaPessoas = new JMenuItem("Lista de pessoas");
        menuVisualizacao.add(itemListaUsuarios);
        menuVisualizacao.add(itemListaPessoas);

        JMenuItem itemSair = new JMenuItem("Sair");
        itemSair.addActionListener(e -> System.exit(0));

        menuBar.add(menuCadastro);
        menuBar.add(menuVisualizacao);
        menuBar.add(itemSair);
        mainWindow.setJMenuBar(menuBar);

        // Ação para cadastro de usuários
        itemUsuarios.addActionListener(e -> openUserRegistrationWindow());

        // Tornar a janela principal visível
        mainWindow.setVisible(true);
    }

    // Método para abrir a janela de cadastro de usuários
    private static void openUserRegistrationWindow() {
        JFrame userWindow = new JFrame("Cadastro de Usuários");
        userWindow.setSize(400, 300);
        userWindow.setLocationRelativeTo(null); // Centraliza a janela de cadastro
        userWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Criar um painel para o formulário de cadastro
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Criar componentes do formulário
        formPanel.add(new JLabel("Usuário:"));
        formPanel.add(new JTextField());
        formPanel.add(new JLabel("Senha:"));
        formPanel.add(new JPasswordField());
        formPanel.add(new JLabel("Email:"));
        formPanel.add(new JTextField());
        formPanel.add(new JLabel("Ativo:"));
        formPanel.add(new JCheckBox());

        // Criar painel de botões
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        String[] buttons = {"Incluir", "Alterar", "Excluir", "Consultar", "Cancelar", "Sair"};
        for (String buttonName : buttons) {
            JButton button = new JButton(buttonName);
            buttonPanel.add(button);
            button.addActionListener(e -> handleButtonClick(buttonName, userWindow));
        }

        // Adicionar o painel do formulário e o painel de botões à janela de cadastro
        userWindow.add(formPanel, BorderLayout.CENTER);
        userWindow.add(buttonPanel, BorderLayout.SOUTH);

        // Tornar a janela de cadastro visível
        userWindow.setVisible(true);
    }

    // Método para tratar cliques nos botões da janela de cadastro
    private static void handleButtonClick(String buttonName, JFrame userWindow) {
        if ("Sair".equals(buttonName)) {
            userWindow.dispose(); // Fecha a janela de cadastro
        } else {
            JOptionPane.showMessageDialog(userWindow,
                    "Botão clicado! - " + buttonName,
                    "Informação",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}