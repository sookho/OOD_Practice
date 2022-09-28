package enums;

public enum TeacherEnum {

    ONE("One"),
    TWO("Two");

    private String name;

    TeacherEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
