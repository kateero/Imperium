package mephi.b22901.saver.imperium.Model;

import com.github.javafaker.Faker;

public class DataGenerator {
  
    private Faker faker = new Faker();

    public Eretic generateHeretic() {
        Eretic heretic = new Eretic();
        heretic.setName(faker.name().fullName());
        heretic.setCrimes(faker.lorem().sentence());
        heretic.setLocation(faker.address().city());
        heretic.setUniqueID(faker.idNumber().hashCode());
        heretic.setthreatLevel(faker.options().option("Низкий", "Средний", "Высокий", "Критический"));
        return heretic;
    }
}
