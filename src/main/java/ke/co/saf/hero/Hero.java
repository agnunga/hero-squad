package ke.co.saf.hero;

public class Hero {

    private String name;
    private int age;


    private String specialPower;
    private String weakness;
    private String squad;

    /*
   private Power specialPower;
    private Weakness weakness;
    private Squad squad;
    */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(String specialPower) {
        this.specialPower = specialPower;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    /*
    public Power getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(Power specialPower) {
        this.specialPower = specialPower;
    }

    public Weakness getWeakness() {
        return weakness;
    }

    public void setWeakness(Weakness weakness) {
        this.weakness = weakness;
    }

    public Squad getSquad() {
        return squad;
    }

    public void setSquad(Squad squad) {
        this.squad = squad;
    }
    */

}

/*
enum Power{
    FLIGHT,
    STRENGTH,
    INVINCIBILITY,
    PERSUASION,
    OBSERVATION,
    TENACITY
}
enum Weakness{
    FIRE,
    LACK_OF_WATER,
    LOUD_SOUND,
    ANGER,
    FORGETFULNESS
}
*/
