import java.util.LinkedList;

class Main {
  public static void main(String[] args) {
    LinkedList<String> languages = new LinkedList<>();

    // add elements in LinkedList
    languages.add("Java");
    languages.add("Python");
    languages.add("Swift");
    System.out.println("LinkedList: " + languages);

    // remove all the elements
    languages.clear();
    System.out.println("LinkedList after clear(): " + languages);
  }
}