/* This is a subclass of Basechar */
public class Mage extends Basechar {
    private int Mana = 0;
    
    public int getMana() {
        return Mana;
    }
    /*
    Works if using public methods to set name, cannot directly set name equal to anymore.
    public Mage(String n) {
        setName(n);
    }
    */
    
    /*
    Works
    public Mage() {
        setName("MAGEY");
    */
    
    /*
    Works
    public Mage(String n, int m) {
        setName(n);
        Mana = m;
    */
    }
}
