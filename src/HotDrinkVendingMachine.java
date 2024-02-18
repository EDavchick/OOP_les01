/* Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
 и реализовать перегруженный метод getProduct(int name, int volume, int temperature)
  выдающий продукт соответствующий имени, объему и температуре */

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine{
    List<Product> listHotDrinks = new ArrayList<>();

    @Override
    public void addProduct(Product product) {
        listHotDrinks.add(product);
    }

    @Override
    public Product getProduct(String name) {
        for(Product product : listHotDrinks){
            if (product.getName().equals(name)) {
                return  product;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(double cost) {
        for(Product product : listHotDrinks){
            if (product.getCost() == cost) {
                return  product;
            }
        }
        return null;
    }

    public Product getHotProduct(String name, double volume, int temperature){

        for(Product hotDrink : listHotDrinks){
            if (hotDrink.getName().equals(name)
                    & ((HotDrink)hotDrink).getTemperature() == temperature
                    & ((HotDrink) hotDrink).getVolume() == volume) {
                return hotDrink;
            }
        }
        return null;
    }
}
