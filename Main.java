class Main {
  public static void main(String[] args) {
    //add test cases 
    TenToAny t = new TenToAny();
    t.setBase10(234);
    t.setNewBase(9);
    System.out.println(t);
    t.setBase10(100);
    t.setNewBase(2);
    System.out.println(t);
    t.setBase10(10);
    t.setNewBase(2);
    System.out.println(t);
    t.setBase10(15);
    t.setNewBase(2);
    System.out.println(t);
    t.setBase10(256);
    t.setNewBase(2);
    System.out.println(t);
    t.setBase10(100);
    t.setNewBase(8);
    System.out.println(t);
    t.setBase10(250);
    t.setNewBase(16);
    System.out.println(t);
    t.setBase10(56);
    t.setNewBase(11);
    System.out.println(t);
    t.setBase10(89);
    t.setNewBase(5);
    System.out.println(t);
    t.setBase10(23);
    t.setNewBase(3);
    System.out.println(t);
    t.setBase10(50);
    t.setNewBase(4);
    System.out.println(t);
    System.out.println("\nThe following cases were listed in the sample data but not the sample output in the README file:\n");
    t.setBase10(50);
    t.setNewBase(5);
    System.out.println(t);
    t.setBase10(55);
    t.setNewBase(6);
    System.out.println(t);
    t.setBase10(2500);
    t.setNewBase(6);
    System.out.println(t);
  }
}
