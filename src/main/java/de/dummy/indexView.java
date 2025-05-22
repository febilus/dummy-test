package de.dummy;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class indexView {

    public String getDummyMessage() {
        return "dummy";
    }

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Ford"));
        cars.add(new Car("Opel"));
        cars.add(new Car("Seat"));
        cars.add(new Car("VW"));

        return cars;
    }

    public static class Car {

        private String manufacturer;

        public Car(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

    }
}
