public class BaseChar implements Comparable {
    
    protected int health = 20;
    protected String name;

    public BaseChar(String n) {
	setName(n);
    }

    public BaseChar() {
	setName("Bob");
    }

    public String toString(){
	return getName();
    }

    public void setName(String l){
	name = l;
    }

    public String getName(){
	return name;
    }
    
    public int getHealth(){
	return health;
    }

    public int compareTo(Object other) {
	BaseChar o = (BaseChar)other;
	return name.compareTo(o.getName());
    }
}
