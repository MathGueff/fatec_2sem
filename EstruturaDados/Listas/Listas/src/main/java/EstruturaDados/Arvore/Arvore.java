package EstruturaDados.Arvore;

/**
 *
 * @author MathGueff
 */
public class Arvore {
    private No raiz;
    public Arvore(){
        this.raiz = null;
    }
    
    public void inserirNo(int valor){
        if(raiz == null){
            raiz = new No(valor);
        }
        else{
            raiz.inserir(valor);
        }
    }
    
    public void preordemPercurso(){
        preordemNavegador(raiz);
    }
    
    private void preordemNavegador(No no){
        if(no == null){
            return;
        }
        System.out.printf("%d ", no.valor);
        preordemNavegador(no.esquerdo);
        preordemNavegador(no.direito);
    }
    
    public void emordemPercurso(){
        emordemNavegador(raiz);
    }
    
    private void emordemNavegador(No no){
        if(no == null){
            return;
        }
        emordemNavegador(no.esquerdo);
        System.out.printf("%d ", no.valor);
        emordemNavegador(no.direito);
    }
    
    public void posordemPercurso(){
        posordemNavegador(raiz);
    }
    
    private void posordemNavegador(No no){
        if(no == null){
            return;
        }
        posordemNavegador(no.esquerdo);
        posordemNavegador(no.direito);
        System.out.printf("%d ", no.valor);
    }
    
    private void desenhoArvore(No no){
        if(no == null){
            return;
        }
        System.out.println(no.valor);
        if(no.esquerdo != null){
            System.out.println(no.esquerdo.valor);
        }
        if(no.direito != null){
            System.out.println(no.direito.valor);
        }
        desenhoArvore(no.esquerdo);
        desenhoArvore(no.direito);
    }
    
    public void desenharArvore(){
        desenhoArvore(raiz);
    }
}
