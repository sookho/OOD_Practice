package enums;

public enum CourseEnum {

    MATH("Math", "2021-08-16"),
    COMPUTER("Computer", "2021-08-16");

    private String name;
    private String date;

    CourseEnum(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
}
