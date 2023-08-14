package ke.co.saf.hero;

public class Hero {

    private String name;
    private int age;
    private Power specialPower;
    private Weakness weakness;
    private Squad squad;

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

}

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
