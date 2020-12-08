package step3.domain;

public class Car {

  private String name;
  private static final int INIT_POSITION = 1;
  private int distance;

  public Car() {
    this.distance = INIT_POSITION;
  }

  public Car(String name) {
    valid(name);
    this.distance = INIT_POSITION;
    this.name = name;
  }

  public void move() {
    this.distance++;
  }

  public int getDistance() {
    return this.distance;
  }

  public String getName() {
    return this.name;
  }

  private static void valid(String input) {
    if (input == null || input.equals("") || input.length() > 5) {
      throw new IllegalArgumentException();
    }
  }
}
