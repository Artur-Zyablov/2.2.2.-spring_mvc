package web.service;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    List<Car> listCar = new ArrayList<>();

    {
        listCar.add(new Car("BMW", "Black", "Andre"));
        listCar.add(new Car("Nissan", "Orange", "Blackwood"));
        listCar.add(new Car("Suzuki", "Green", "Stark"));
        listCar.add(new Car("Opel", "Blue", "Тони"));
        listCar.add(new Car("Жигуль", "White", "Белый"));
    }

    public CarServiceImpl() {
    }

    @Override
    public List<Car> readCar(int n) {
		if (n == 0) return listCar;
		return listCar.stream().limit(n).collect(Collectors.toList());
		
//        List<Car> newListCar = new ArrayList<>();
//        try{
//        for (int i = 0; i < n; i++) {
//            newListCar.add(listCar.get(i));}
//            }catch(Exception e){
//            return newListCar;
//            }
    }
}
