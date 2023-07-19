package sintaxe.heranca;

public class main {
    public static void main(String[] args) {

        A a = new A("Carolina", 2, 72.5);
        B b = new B("José", 3, 77.9, 1);
        A e = new B("Emily", 4, 81.0, 3);

        // Upcasting (transformar classe filha na classe mãe)
        A c = b; // Não tem problema.

        // Downcasting (transformar classe mãe na classe filha)
        // B d = a; // Tem problema, já que a não foi instanciada como B
        B d = (B) e; // Não tem problema, já que e foi instanciada como B (ainda tem de usar casting)

        // O metodo instanceof serve para verificar se um objeto é de uma certa classe
        System.out.println(a instanceof A);
        System.out.println(b instanceof A); // Como b é subclasse de a retorna true
        System.out.println(a instanceof B);

        a.metodo();
        b.metodo();
    }
}
