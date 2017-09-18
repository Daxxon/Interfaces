public class FrogMan extends Soldier{

  private double stealth;
  private int numOfDetections;
  private int numOfAmbushes;

  public FrogMan(String name, String nickName, String rank, String serialNumber) {
      super(name, nickName, rank, serialNumber);
      this.weapon = "knife";
      this.numOfDetections = 0;
      this.numOfAmbushes = 0;
  }

  public String speak() {
    return "...";
  }

  public String karateChop() {
    return "hi-YAH!";
  }

  public String kick() {
    return "olé!";
  }

  public String grapple() {
    return "Get over here!";
  }

  public String defend() {
    return "unf!";
  }
}
