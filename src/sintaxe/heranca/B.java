package sintaxe.heranca;

public class B extends A{
    // Colocar final antes de class pra evitar subclases de b
    // Mesmo serve para metodos para que eles não tenham override
    Integer genero;

    public B(String nome, Integer cpf, Double peso, Integer genero) {
        super(nome, cpf, peso);
        this.genero = genero;
    }

    public B() {
        super();
    }

    public Integer getGenero() {
        return genero;
    }

    public void setGenero(Integer genero) {
        this.genero = genero;
    }

    @Override
    public void metodo(){
        System.out.println("Nuts");
    }

}
