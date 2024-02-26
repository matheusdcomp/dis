package factorym.pizza;

public class PizzaStore {
  Pizza orderPizza(String type) {

    Pizza pizza = PizzaFactory.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }
}
