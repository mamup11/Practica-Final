/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkgfinal;

import javax.swing.JPanel;

/**
 *
 * @author mateo
 */
public class Arbol {
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
    public JPanel getDibujo() {
        return new ArbolExpresionGrafico(this);
    }
}
