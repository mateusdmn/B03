import javax.swing.*;
import java.awt.*;

public class BotoesCadastro {
    private final JDialog dialog;

    public BotoesCadastro(JDialog dialog) {
        this.dialog = dialog;
    }

    public JPanel criar() {
        JPanel painelBotoes = new JPanel(new FlowLayout());
        String[] labels = {"Incluir", "Alterar", "Excluir", "Consultar", "Cancelar", "Sair"};
        for (String label : labels) {
            JButton button = new JButton(label);
            if ("Sair".equals(label)) {
                button.addActionListener(e -> dialog.setVisible(false));
            } else {
                button.addActionListener(e -> JOptionPane.showMessageDialog(dialog, "Botão " + label + " clicado!"));
            }
            painelBotoes.add(button);
        }
        return painelBotoes;
    }
}

public interface Pessoa {
    String getNome();
    int getIdade();
    void exibirInfo();
}

public abstract class PessoaAbstrata implements Pessoa {
    protected String nome;
    protected int idade;

    public PessoaAbstrata(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }
}

public class PessoaFisica extends PessoaAbstrata {

    public PessoaFisica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void exibirInfo() {
        // Exibir as informações de uma pessoa física
        JOptionPane.showMessageDialog(null, "Nome: " + getNome() + "\nIdade: " + getIdade());
    }
}
