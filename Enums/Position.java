package lab3.Enums;

public enum Position {
    Bed("на ложе"),
    Bottom("на дно"),
    Squat("на корточки"),
    Mirror("зеркало");


    private String name;
    Position(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
