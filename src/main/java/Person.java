import java.awt.dnd.InvalidDnDOperationException;
import java.security.InvalidKeyException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Сущность Человек
 */
public class Person {
    int id;
    String name;
    public enum Gender{Male, Female}
    Gender gender;
    Date birthDate;
    Division division;
    int salary;

    /**
     * Конструктор Person
     * @param ID id
     * @param name имя
     * @param gender строка преобразуется в элемент перечисляемого типа Gender
     * @param birthDate строка преобразуется в тип Date
     * @param division объект Division
     * @param salary зарплата
     */
    public Person(int ID, String name, String gender, String birthDate, Division division, int salary) {
        this.id = ID;
        this.name = name;

        if(gender.equals("Male"))
            this.gender = Gender.Male;
        else if(gender.equals("Female"))
            this.gender = Gender.Female;
        else
            throw new IllegalArgumentException("Unexpected gender '" + gender + "'");


        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            this.birthDate = format.parse(birthDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.division = division;
        this.salary = salary;
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return gender
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * @return division
     */
    public Division getDivision() {
        return division;
    }

    /**
     * @return salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @return birthdate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Переопределение toString()
     * @return строка с данными
     */
    @Override
    public String toString(){
        return getId() + "; " + getName() + "; " + getGender() + "; " + getBirthDate() + "; "
                + getDivision().getId() + "; " + getDivision().getName() +  "; " + getSalary();
    }

}
