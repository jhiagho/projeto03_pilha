package pilha.no;

public class main {

    public static void main(String[] args){

        pilha minhaPilha = new pilha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));
        minhaPilha.push(new No(7));

        System.out.println(minhaPilha.toString());

        No top = minhaPilha.top();
        System.out.println("No do top: " + top.getDado() + "\n");

        No pop = minhaPilha.pop();
        System.out.println("No removido: " + top.getDado() + "\n");

        System.out.println(minhaPilha.toString());
    }
}
