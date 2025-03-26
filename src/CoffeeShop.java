import component.Beverage;
import component.concrete.Espresso;
import component.concrete.HouseBlend;
import decorator.concrete.Mocha;
import decorator.concrete.Whip;

public class CoffeeShop {
    public static void main(String[] args) {
        // Order an Espresso with Mocha and Whip
        Beverage beverage = new Espresso();
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.println(beverage.getDescription() + " $" + beverage.cost());


        // Order an HouseBlend with double Mocha
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Mocha(houseBlend);

        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
      }
    }
