package play;

public class Toto {
  public static void main(String[] args) {
    System.out.println("checking " + C.US);
    switchc(C.US);
    System.out.println("checking " + C.CA);
    switchc(C.CA);
    System.out.println("checking " + C.AU);
    switchc(C.AU);
  }

  private static void switchc(C c1) {
    switch (c1) {
      case CA:
        System.out.println("CAA");
        break;
      default:
        System.out.println("DEFAULT " + c1);
      case US:
        System.out.println("UUSSS");
    }
  }

  enum C {
    US, CA, AU
  }
}
