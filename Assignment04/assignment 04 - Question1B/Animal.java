public abstract class Animal{
    private String name;
    public Animal(String name){
        this.name=name;
    }
    public abstract void greets();
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}