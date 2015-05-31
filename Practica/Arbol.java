public class Arbol
{
    private Arbol izq;
    private Arbol der;
    private String n;
    
    public Arbol(Arbol izq, String a, Arbol der)
    {
        n=a;
        this.izq=izq;
        this.der=der;
    }
    
    public Arbol getIzq()
    {
        return izq;        
    }
    public Arbol getDer()
    {
        return der;        
    }
    public String getName()
    {
        return n;        
    }
    
    
}
