package lab3.Objects;

import lab3.Enums.* ;
import lab3.interfaces.Adding;
import lab3.interfaces.Properties;

public class Charachters extends Object implements Properties, Adding {
    private final String ending;
    private String name;
    final private Gender gender;
    private String property;
    private String add;


    public Charachters(String name, Gender gender){
        super(name);
        this.name = name;
        this.gender = gender;
        this.ending = gender.getName();
    }
    @Override
    public void getProperty(String word) {
        this.property = word;
    }

    @Override
    public void getAdding(String add){
        this.add = add;
    }
    public void getSpeed(int speed){
        if (speed > 15){
            this.name = "Влетел " + this.name;
        }
        else if(speed > 10){
            this.name = "Ворвался " + this.name;
        }
        else {
            this.name = "Вошёл " + this.name;
        }
    }
    public void doSomethingPerson(Action act){
        if(act == Action.See){
            System.out.print(this.name + " видел" + ending);
        }
        if(act == Action.Stand){
            System.out.print(this.name + " встал" + ending + this.property );
        }
        if(act == Action.Pour){
            System.out.print(this.name + " окатил" + Gender.Plural.getName() + this.property);
        }
        if(act == Action.Felt){
            System.out.print(this.name + " почувствовал" + ending);
        }
        if(act == Action.Understand){
            System.out.print(this.name + " понял" + ending);
        }
        if(act == Action.Run){
            System.out.print(this.name);
        }
        if(act == Action.Rub){
            System.out.print(" и растирал" + ending + this.add);
        }
        if(act == Action.Sit){
            System.out.print(super.name + " сел" + ending + this.property);
        }
        if(act == Action.Clean){
            System.out.print(this.property + " чистил" + ending + this.add);
        }
    }
    public void doSomethingPerson(Object o1,Action act, Object o){
        System.out.print(o1 + " и ");
        doSomethingPerson(act);
        System.out.print(o);
    }
    public void doSomethingtoPerson(Action act,Things o){
        if(act == Action.Dizzy){
            System.out.print("У " + this.name + " закружилась " + o.name);
        }
    }
    public void doSomethingtoPerson(Action act, Object o){
        if(act == Action.Hang){
            System.out.print(this.name + " повесил" + ending + this.property  + " на " + o.name);
        }
        if(act == Action.Put){
            System.out.print(this.name + " поставил" + ending + o.name + this.property);
        }
    }
    public void getPersonCondition(Action act,Subjects o) {
        if (act == Action.Remember) {
                System.out.print(this.name + " помнит " + this.add + o.getName() + o.add);
        }
        if (act == Action.NotRemeber) {
                System.out.print(this.name + " не помнит " + this.add + o.getName() + o.add);
        }
    }
    public void doSomethingto(Action act,Subjects o){
        if(act == Action.Throw){
            System.out.print(this.name + " бросили на " + o.property + o.getName());
        }
        if(act == Action.Rub){
            System.out.print(" и" + " растирал" + Gender.Plural.getName() +o.property + o.getName());
        }
    }
    public void getStrenght(int strenght,Subjects o){
        if(strenght < 3) {
            System.out.print(o.getName() + " не обременило " + this.name);
        }
        else{
                System.out.print(o.getName() + " обременило " + this.name);
            }
        }

    public void doReward(){
        System.out.print(this.add + "вознаградило " + this.name);
    }
    public void getReward(String reward,Object o1,Object o2){
        System.out.print(this.name + " получила " + reward + " от " +  o1.name +" и "+ o2.name);
    }
    public void said(String sentence){
        System.out.print(sentence + " - сказал " + this.name);
    }
    public void getPosition(Subjects o){
        System.out.print(" стоя у " + this.add +" "+ o.getName());
    }
    public void saidTo(String sentence,Object o){
        System.out.print(sentence + o.name + " - сказал " + this.name);
    }


    @Override
    public String toString() {
        return name;
    }
}