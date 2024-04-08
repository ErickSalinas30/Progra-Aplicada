/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fernandezj_salinase_listasgenericas;

/**
 *
 * @author usuario
 */
public class Generica {

    Object LlenarLista;
    Object Mezclar;

    public Generica() {
    }
    
    public Generica(Object LlenarLista, Object Mezclar) {
        this.LlenarLista = LlenarLista;
        this.Mezclar = Mezclar;
    }

    public Object getLlenarLista() {
        return LlenarLista;
    }

    public void setLlenarLista(Object LlenarLista) {
        this.LlenarLista = LlenarLista;
    }

    public Object getMezclar() {
        return Mezclar;
    }

    public void setMezclar(Object Mezclar) {
        this.Mezclar = Mezclar;
    }
    
    public static void llenarLista (<? extends T>)
    {
        
        
    }
    public static <T> void mezclar ()
    {
        
    }
}
