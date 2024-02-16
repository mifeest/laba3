package lab3.Enums;

public enum Condition {
    Bitter("горький"),
    Sweet("сладкий"),
    Salty("соленый"),
    Normal("обычный");
    private String name;
    Condition(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
