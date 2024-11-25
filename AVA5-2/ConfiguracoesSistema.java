import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConfiguracoesSistema implements Pessoa {
    public static final String VERSAO_SISTEMA = "12.1.2024";
    public static final String NOME_USUARIO = "denys.silva";
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yy HH:mm");
    public static final String DATA_ACESSO = DATE_FORMAT.format(new Date());

    // Implementando a interface Pessoa
    @Override
    public String getNome() {
        return NOME_USUARIO;
    }

    @Override
    public int getIdade() {
        // A idade pode ser calculada ou armazenada conforme necessário.
        // Aqui retornamos um valor fixo como exemplo.
        return 30; // Exemplo fictício de idade
    }

    @Override
    public void exibirInfo() {
        // Aqui poderia ser uma exibição em interface gráfica, mas usamos o console como exemplo
        System.out.println("Nome do usuário: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Versão do sistema: " + VERSAO_SISTEMA);
        System.out.println("Data de acesso: " + DATA_ACESSO);
    }

    public static void main(String[] args) {
        // Testando a classe e exibindo as informações
        ConfiguracoesSistema configuracao = new ConfiguracoesSistema();
        configuracao.exibirInfo();
    }
}
