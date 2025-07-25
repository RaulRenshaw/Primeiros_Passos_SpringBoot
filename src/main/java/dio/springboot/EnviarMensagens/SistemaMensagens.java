package dio.springboot.EnviarMensagens;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagens implements CommandLineRunner {
    @Value("${nome:Noreply}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviado por: " + nome
        + "\nCom E-mail: " + email
        + "\nCom telefones para contato: " + telefones);

        System.out.println("Seu cadastro foi aprovado");
    }
}
