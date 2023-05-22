package listasdobles;


public interface ILista {
    public void insertBegin(int element);
    public void insertFinal(int element);
    public void insertInIndex(int element, int index);
    public NodoDoble deleteFinal();
    public NodoDoble deleteBegin();
    public NodoDoble deleteInIndex(int index);
    public void printList();
    public boolean isEmpty();
}
