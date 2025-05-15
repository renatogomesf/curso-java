package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domains;

public class Calculadora {

    // public: modificador de acesso. neste caso é publico. todos tem acesso.
    // void: não retorna nada para quem chamou esse métod0.
    // nome do métod0 sempre inicia com letra minúscula.
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }

    // parâmetros do métod0... diz o tipo e depois o nome.
    public void multiplicaDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }

}
