package sintaxe.heranca;

public class A extends C{
    private String nome;
    private Integer cpf;
    private Double peso;

    public A(String nome, Integer cpf, Double peso) {
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
    }

    public A() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void metodo(){
        System.out.println("Balls");
    }
}
