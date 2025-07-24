package academy.devdojo.maratonajava.javacore.Gassociacao.domains;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this(nome);
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this(nome, especialidade);
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("---PROFESSOR---");
        System.out.println(this.nome);
        System.out.println(this.especialidade);

        if(this.seminarios == null) return;
        System.out.println("---SEMINÁRIOS---");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());

            if(seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("---ALUNOS---");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println(aluno.getNome());
                System.out.println(aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
