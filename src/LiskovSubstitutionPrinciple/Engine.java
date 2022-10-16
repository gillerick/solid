package LiskovSubstitutionPrinciple;

public abstract class Engine {
  private static Boolean state = false;

  public void on() {
    state = true;
    System.out.println("Engine is turned on!");
  }

  public void off() {
    state = false;
    System.out.println("Engine is turned off!");
  }

  public void powerOn() {
    System.out.println("Engine is powering on!");
  }
}
