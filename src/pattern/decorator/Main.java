package pattern.decorator;

import pattern.decorator.coffee.Beverage;
import pattern.decorator.coffee.DarkRoast;
import pattern.decorator.coffee.Espresso;
import pattern.decorator.component.Mocha;
import pattern.decorator.component.Whip;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDesc()+" $"+beverage.cost());

        Beverage b2 = new DarkRoast();
        b2 = new Mocha(b2);
        b2 = new Whip(b2);
        System.out.println(b2.getDesc()+" $"+b2.cost());
    }
}
