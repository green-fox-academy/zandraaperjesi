public class Aircraft {
  private int maxAmmo;
  private int baseDamage;
  private int ammo;

  public Aircraft(int maxAmmo, int baseDamage) {
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
    this.ammo = 0;
  }

  public int fight() {
    return this.ammo * this.baseDamage;
  }
}
