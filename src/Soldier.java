public abstract class Soldier {
  String name;
  String nickName;
  String rank;
  String serialNumber;
  String weapon;
  int hitPoints;

  public Soldier (String name, String nickName, String rank, String serialNumber) {
    this.hitPoints = 10;
    this.name = name;
    this.nickName = nickName;
    this.rank = rank;
    this.serialNumber = serialNumber;
  }

  public String battleCry() {
    return "get some!";
  }

  public String ackowledge() {
    return "copy";
  }

  public String sing() {
    return "I don't know what i've been told... !";
  }

  public abstract String speak();
}
