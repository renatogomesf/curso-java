package academy.devdojo.maratonajava.javacore.Kenum.domains;

public enum TipoPagamento {
    //enuns podem conter metodos também. e sorescrever metodos da própria classe como no exemplo abaixo. mas precisa existir um metodo fora dos enuns para ser chamado em outras classes.
    DEBITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    // como esse metodo não é usasdo, passamos ele para abstrato e não pode ter um corpo. quando transformamos em abstrato, estamos dizendo que esse metodo foi criado para ser sobrescrito. esse metodo em si não existe.
    public abstract double calcularDesconto(double valor);
}