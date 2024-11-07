import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

// Classe que representa o sistema, contendo o método principal para rodar a aplicação
public class SistemaPessoa {
    public static void main(String[] args) {
        // Dados constantes
        final String versaoSistema = "12.1.2024";
        String nomeUsuario = "denys.silva";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm");
        String dataAcesso = dateFormat.format(new Date());

        // Criação da janela principal
        JanelaPrincipal janela = new JanelaPrincipal(versaoSistema, nomeUsuario, dataAcesso);
        janela.mostrarJanela();
    }
}

// Classe que representa a Janela Principal do Sistema
class JanelaPrincipal {
    private String versaoSistema;
    private String nomeUsuario;
    private String dataAcesso;
    private JFrame principal;

    public JanelaPrincipal(String versaoSistema, String nomeUsuario, String dataAcesso) {
        this.versaoSistema = versaoSistema;
        this.nomeUsuario = nomeUsuario;
        this.dataAcesso = dataAcesso;

        this.principal = new JFrame("Sistema Pessoa");
        this.principal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.principal.setSize(800, 800);
    }

    public void mostrarJanela() {
        // Adiciona componentes na janela principal
        principal.getContentPane().add(BorderLayout.NORTH, new MenuPrincipal());
        principal.getContentPane().add(BorderLayout.CENTER, new JTextArea());
        principal.getContentPane().add(BorderLayout.SOUTH, new Rodape(versaoSistema, nomeUsuario, dataAcesso));

        principal.setLocationRelativeTo(null); // Centraliza a janela
        principal.setVisible(true); // Torna a janela visível
    }
}

// Classe responsável pela criação do menu principal
class MenuPrincipal extends JMenuBar {
    public MenuPrincipal() {
        // Criação do menu principal
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuVisualizacao = new JMenu("Visualização");
        JMenu menuSair = new JMenu("Sair");

        // Opções do menu Sair
        menuSair.addMenuListener(new javax.swing.event.MenuListener() {
            @Override
            public void menuSelected(javax.swing.event.MenuEvent e) {
                System.exit(0); // Fecha o sistema
            }

            @Override
            public void menuDeselected(javax.swing.event.MenuEvent e) { }

            @Override
            public void menuCanceled(javax.swing.event.MenuEvent e) { }
        });

        // Adiciona os menus à barra de menu
        add(menuCadastro);
        add(menuVisualizacao);
        add(menuSair);

        // Itens do menuCadastro
        JMenuItem itemMenuCadastroUsuarios = new JMenuItem("Usuários");
        JMenuItem itemMenuCadastroPessoas = new JMenuItem("Pessoas");
        menuCadastro.add(itemMenuCadastroUsuarios);
        menuCadastro.add(itemMenuCadastroPessoas);

        // Itens do menuVisualizacao
        JMenuItem itemMenuVisualizacaoListaUsuarios = new JMenuItem("Lista de usuários");
        JMenuItem itemMenuVisualizacaoListaPessoas = new JMenuItem("Lista de pessoas");
        menuVisualizacao.add(itemMenuVisualizacaoListaUsuarios);
        menuVisualizacao.add(itemMenuVisualizacaoListaPessoas);
    }
}

// Classe responsável pela criação do rodapé da janela
class Rodape extends JPanel {
    public Rodape(String versaoSistema, String nomeUsuario, String dataAcesso) {
        // Criação do rodapé
        JLabel labelRodape = new JLabel("Versão: " + versaoSistema + "               Usuário: " + nomeUsuario + "               Data de acesso: " + dataAcesso);
        this.add(labelRodape); // Adiciona o label no painel
    }
}