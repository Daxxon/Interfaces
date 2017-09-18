public class Main {
  public static void main(String[] args) {

    FrogMan john = new FrogMan("john", "johnny bullet-seed", "brigadier general", "007");
    //this is where john does stuff
    System.out.println(john.speak());
    System.out.println(john.battleCry());
    System.out.println(john.ackowledge());
    System.out.println(john.sing());
    System.out.println(john.kick());
    System.out.println(john.karateChop());
    System.out.println(john.grapple());
    System.out.println(john.defend());

    Rifleman joe = new Rifleman("joe", "joker", "grunt", "23147102398471023");
    System.out.println(joe.speak());
    System.out.println(joe.battleCry());
    System.out.println(joe.ackowledge());
    System.out.println(joe.sing());
    System.out.println(joe.fireGun());
    System.out.println(joe.fireRocket());
    System.out.println(joe.launchGrenade());
    System.out.println(joe.defend());
    System.out.println(joe.retreat());
  }
}
