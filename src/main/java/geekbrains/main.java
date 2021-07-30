package geekbrains;

import java.util.Arrays;

public class main {

    public static void main(String[] args) {

        Person[] personArray = new Person[5];
        personArray[0] = new Person("Nikolay Stepanovich", "Product Manager", "nikolay@person.ru", 89003453234L, 35000,35);
        personArray[1] = new Person("Stepan Alexeevich", "HR", "stepan@person.ru", 89182344545L, 40000, 27);
        personArray[2] = new Person("Alexei Mihailovich", "Analitik", "alexei@person.ru", 89543534565L, 45000, 29);
        personArray[3] = new Person("Vasiliy Ivanovich", "CEO", "vasiliy@person.ru", 89674599090L, 65000, 45);
        personArray[4] = new Person("Andrei Andreevich", "Driver", "andrei@person.ru", 89450098978L, 25000, 38);

        Person person1 = personArray[0];
        Person person2 = personArray[1];
        Person person3 = personArray[2];
        Person person4 = personArray[3];
        Person person5 = personArray[4];

        person1.getPersonInfo();
        person2.getPersonInfo();
        person3.getPersonInfo();
        person4.getPersonInfo();
        person5.getPersonInfo();

        System.out.println("-----------------------");
        System.out.println("Persons over 40 years old\n");

        for (int i = 0; i < personArray.length; i++) {
            if (personArray[i].getAge() > 40) {
                personArray[i].getPersonInfo();
            }
        }

    }

}
