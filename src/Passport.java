import java.util.HashSet;
import java.util.Set;

public class Passport {
    private Set<Passport> numberPassport = new HashSet<Passport>();
    private String number;
    private String password;
    private String surname;
    private String name;
    private String patronymic;
    private String year;

    public Passport(String number, String password, String surname, String name, String patronymic, String year) {
        this.number = number;
        this.password = password;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.year = year;
    }

    public String getPassword() {
        return password;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getYear() {
        return year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void addPassport(Set<Passport> passport){
        Passport passport1 = get(passport);
        if (passport != null){
            numberPassport.remove(passport);
            numberPassport.add((Passport) passport);

        }
    }


    public Passport get(Set<Passport> passports){
        for (Passport passport:passports) {
            if (passport.getNumber().equals(passport)){
                return passport;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "password='" + password + '\'' +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
