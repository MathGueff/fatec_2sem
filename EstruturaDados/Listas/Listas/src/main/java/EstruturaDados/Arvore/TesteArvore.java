package EstruturaDados.Arvore;

/**
 *
 * @author MathGueff
 */
public class TesteArvore {
    public static void main(String[] args) {
        Arvore a = new Arvore();
        int valor;
        int valores[] = {63,15,85,1,18,28,70,20,5,86};
        
        System.out.println("Inserindo os seguintes valores:");
        for(int x = 1; x<= 10; x++){
            valor = valores[x-1];
            System.out.println(valor + " ");
            a.inserirNo(valor);
        }
        System.out.println("\n\nPercurso na pré-ordem");
        a.preordemPercurso();
        System.out.println("\n----");
        System.out.println("\nPercurso na ordem");
        a.emordemPercurso();
        System.out.println("\n----");
        System.out.println("\nPercurso na pós-ordem");
        a.posordemPercurso();
    }
}
