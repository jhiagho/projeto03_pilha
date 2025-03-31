package pilha.no;

public class pilha {

    private No refNoEntrada;

    public pilha() {
        this.refNoEntrada = null;
    }

    public No top(){
        return refNoEntrada;
    }

    public void push(No novoNo){
        No refAux = refNoEntrada;
        refNoEntrada = novoNo;
        refNoEntrada.setReNo(refAux);
    }

    public No pop(){
        if(!isEmpty()){
            No noPoped = refNoEntrada;
            refNoEntrada = refNoEntrada.getReNo();
            return noPoped;
        }
        return null;
    }

    public boolean isEmpty(){
//
//        if(this.refNoEntrada == null){
//            return true;
//        }
//        return false;
        return refNoEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "--------------\n";
        stringRetorno += "   Pilha";
        stringRetorno += "--------------\n";

        No noAux = refNoEntrada;

        while (true){
            if(noAux != null){
                stringRetorno += "[No{dado=" + noAux.getDado() + "}]\n";
                noAux = noAux.getReNo();
            } else {
                break;
            }
        }
        stringRetorno += "=============\n";
        return stringRetorno;
    }
}
