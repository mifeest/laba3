package lab3.Enums;

public enum Gender {
    Male(" "),
    Female("а "),
    Plural("и ");
    private String name;
    Gender(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }




}
