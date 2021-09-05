public class compObj {
    // constructor
    String name;
    public compObj(String nameString) {
        this.name = nameString;
    }
    // method to compare two objects
    public boolean equals(compObj obj) {
        if (obj instanceof compObj) {
            return this.name.equals(obj.name);
        }
        return false;
    }
    public static void main(String[] args) {
        compObj obj1 = new compObj("obj1");
        compObj obj2 = new compObj("obj2");
        System.out.println(obj1.equals(obj2));
    }
}
