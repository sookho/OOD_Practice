package enums;

public enum StudentEnum {
    TOM("Tom"),
    JERRY("Jerry"),
    JACK("Jack"),
    ROSE("Rose"),
    BOB("Bob");

    private String name;

    StudentEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
