package academy.devdojo.maratonajava.javacore.Oexception.exception.domains;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Funcionario extends Pessoa {

    // nessa sobrescrita de metodo, o metodo declarado na classe pessoa lança dois erros. mas não é obrigado a lançar esses mesmos erros na hora da sobrescrita.
    // mas, caso eu deseje, posso lançar o erro aqui na hora da sobrescrita. "throws LoginInvalidoException". mas não é pode lançar erro mais genéricos (super classe) como o IOException que é pai dos erros que lancei.
    public void salvar() throws LoginInvalidoException {
        System.out.println("salvando funcionário");
    }
}
