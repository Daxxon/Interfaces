public interface Ranged extends Combat{

  public String fireGun();

  public String fireRocket();

  public String launchGrenade();

  public String defend();

  default public String retreat() {
    return "RUN!";
  }
}
