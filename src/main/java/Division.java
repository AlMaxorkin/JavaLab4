/**
 * Сущность Подразделение
 */
public class Division {
    int id;
    String name;

    /**
     * Конструктор Division
     * @param ID id
     * @param name name
     */
    public Division(int ID, String name) {
        this.id = ID;
        this.name = name;
    }

    /**
     * Getter
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Getter
     * @return name
     */
    public String getName() {
        return name;
    }
}
