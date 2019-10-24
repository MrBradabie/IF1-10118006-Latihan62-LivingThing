
package if1.pkg10118006.latihan62.livingthing;

/*
 * NAMA              : Alfarizi Rizki Pane
 * KELAS             : IF-01
 * NIM               : 10118006
 */
public abstract class LivingThing {
    
    public abstract void walk(String nama);
    
    public void breath(String nama){
        System.out.println(nama+" Bernafas");
    }
    
    public void eat(String nama){
        System.out.println(nama+" Makan");
    }
}
