package dio.springboot.EnviarMensagens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SistemaMensagens implements CommandLineRunner {
    @Autowired
    private Remetente remetente;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviado por: " + remetente.getNome()
        + "\nCom E-mail: " + remetente.getEmail()
        + "\nCom telefones para contato: " + remetente.getTelefones());

        System.out.println("Seu cadastro foi aprovado");
    }
}
