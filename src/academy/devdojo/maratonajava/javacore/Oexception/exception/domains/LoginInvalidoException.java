package academy.devdojo.maratonajava.javacore.Oexception.exception.domains;


// criando minha propria exception. preciso definir se será uma exceção checked ou unchecked... Exception ou RuntimeException (vai forçar o tratamento ou não?)
public class LoginInvalidoException extends Exception {

    // sobrecarga de construtores.

    // caso não seja passado mensagem, será usado esse constructor
    public LoginInvalidoException() {
        super("Login inválido");
    }

    // caso seja passado mensagem, será usado esse constructor
    public LoginInvalidoException(String message) {
        super(message);
    }
}
