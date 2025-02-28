package mephi.b22901.saver.imperium.Model;

import com.github.javafaker.Faker;

public class DataGenerator {
  
    private Faker faker = new Faker();

    public Eretic generateHeretic() {
        Eretic eretic = new Eretic();
        eretic.setName(faker.name().fullName());
        eretic.setCrimes(faker.lorem().sentence());
        eretic.setLocation(faker.address().city());
        eretic.setUniqueID(faker.idNumber().hashCode());
        eretic.setThreatLevel(faker.options().option("Low", "Medium", "High", "Critical"));
        return eretic;
    }
}
