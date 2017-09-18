public class Rifleman extends Soldier implements Ranged{

  private double accuracy;
  private int shotsFired;
  private int hits;

  public Rifleman (String name, String nickName, String rank, String serialNumber) {
    super(name, nickName, rank, serialNumber);
    this.weapon = "rifle";
    this.shotsFired = 0;
    this.hits = 0;
  }

  public String speak() {
    return "Ready for orders.";
  }

  public String fireGun() {
    return "BANG!";
  }

  public String fireRocket() {
    return "FA-SHOOOM!";
  }

  public String launchGrenade() {
    return "THUNK!";
  }

  public String defend() {
    return "Take cover!";
  }

  public String retreat() {
    return "YOU'LL NEVER TAKE ME ALIVE!!!";
  }
}
