package lesson8.equalsTest;

public class Person {

    private String name;
    private String surname;
    private String personalCode;

    public Person(String name, String surname, String personalCode) {
        this.name = name;
        this.surname = surname;
        this.personalCode = personalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return personalCode != null
                ? personalCode.equals(person.personalCode)
                : person.personalCode == null;
    }

    @Override
    public int hashCode() {
        return personalCode != null ? personalCode.hashCode() : 0;
    }
}
