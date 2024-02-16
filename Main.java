package lab3;

import lab3.Enums.*;
import lab3.Objects.Charachters;
import lab3.Objects.Subjects;
import lab3.Objects.Things;
import lab3.Objects.Weather;

public class Main {
    public static void main(String[] args){
        Weather weather = new Weather("Дождь",WeatherCondition.NIGHT);
        Charachters marg = new Charachters("Маргарита", Gender.Female);
        Charachters natasha = new Charachters("Наташа", Gender.Female);
        Charachters gella = new Charachters("Гелла", Gender.Female);
        Charachters cat = new Charachters("Бегемот",Gender.Male);
        Charachters supernatural = new Charachters("Какая-то сила",Gender.Female);
        Charachters korovev = new Charachters("Коровьев",Gender.Male);

        Subjects pool = new Subjects("бассейн");
        Subjects bed = new Subjects("ложе");
        Subjects leaf = new Subjects("листьями");
        Subjects shoes = new Subjects("туфли");
        Subjects crown = new Subjects("венец");
        Subjects chain = new Subjects("цепь");
        Subjects picture = new Subjects("изображение");

        Things lips = new Things("губы", Condition.Normal);
        Things head = new Things("голова", Condition.Normal);
        Things neck = new Things("шея",Condition.Normal);

        weather.setTime(16);
        weather.setWeather();
        //1
        marg.doSomethingPerson(Action.See);
        pool.getBrigtness(75);
        pool.getDescription();
        System.out.println(".");

        //2
        marg.getProperty(Position.Bottom.getName());
        marg.doSomethingPerson(Action.Stand);
        System.out.println(".");

        //3
        gella.getProperty("красной жидкостью ");
        gella.doSomethingPerson(natasha,Action.Pour,marg);
        System.out.println(".");

        //4
        marg.doSomethingPerson(Action.Felt);
        lips.taste(Condition.Bitter);
        System.out.print(" и ");
        marg.doSomethingPerson(Action.Understand);
        System.out.print(", что её моют ");
        System.out.print(Fluids.Blood.getFluid());
        System.out.println(".");

        //5
        marg.doSomethingtoPerson(Action.Dizzy,head);
        head.getProperty("от розового");
        head.condition(Fluids.Oil);
        System.out.println(".");

        //6
        bed.getProperty("хрустальное ");
        marg.doSomethingto(Action.Throw,bed);
        leaf.getProperty("большими зелеными ");
        marg.doSomethingto(Action.Rub,leaf);
        System.out.println(".");

        //7
        cat.getSpeed(13);
        cat.doSomethingPerson(Action.Run);
        cat.getAdding("ступни");
        cat.doSomethingPerson(Action.Rub);
        System.out.println(".");

        //8
        cat.getProperty(Position.Squat.getName());
        cat.doSomethingPerson(Action.Sit);
        cat.doSomethingPerson(Action.Rub);
        cat.getProperty("как будто");
        cat.getAdding("сапоги на улице");
        cat.doSomethingPerson(Action.Clean);
        System.out.println(".");

        //9
        marg.getAdding(", кто сшил ");
        shoes.getAdding(" из лепестков бледной розы, ");
        marg.getPersonCondition(Action.NotRemeber,shoes);
        shoes.getAdding("золотыми пряжками");
        shoes.doThing(Action.Buttoned);
        System.out.println(".");

        //10
        supernatural.getProperty(" к " + Position.Mirror.getName());
        supernatural.doSomethingtoPerson(Action.Put,marg);
        crown.getProperty(", у "  +marg + " в волосах ");
        crown.getVision(19);

        //11
        chain.getWeight(4);
        korovev.getProperty(chain.getName());
        korovev.doSomethingtoPerson(Action.Hang,marg);
        System.out.println(".");
        //12
        marg.getStrenght(5,chain);
        System.out.println(".");
        //13
        chain.getProperty(" сейчас же");
        chain.doThing(Action.Chafe,neck);
        System.out.print(", ");
        picture.doThing(Action.Pull,marg);
        System.out.println(".");

        //14
        marg.getAdding("Кое-что ");
        marg.doReward();
        System.out.println(".");

        //15
        marg.getReward("почтительность",korovev,cat);
        System.out.println(".");

        //16
        korovev.said("Ничего не поделаешь, надо, надо ");
        korovev.getAdding("дверей");
        korovev.getPosition(pool);
        System.out.println(".");

        //17
        korovev.saidTo("Разрешите дать вам совет, ",marg);

        //18
        korovev.saidTo("Среди гостей будут различные",marg);


        korovev.equals(marg);
    }
}
