package org.example;

public class Bus {
    private String number;
    private String model;
    private double mileage;

    public Bus(BusBuilder busBuilder) {
        number = busBuilder.number;
        this.model = busBuilder.model;
        this.mileage = busBuilder.mileage;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getMileage() {
        return mileage;
    }

    public static class BusBuilder {
        private String number;
        private String model;
        private double mileage;

        public BusBuilder(String number, String model) {
            this.number = number;
            this.model = model;
        }

        public BusBuilder setMileage(double mileage) {
            this.mileage = mileage;
            return this;
        }

        public Bus build() {
            return new Bus(this);
        }
    }

    @Override
    public String toString() {
        return "Bus{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}

class TestBusBuilder {
    public static void main(String[] args) {
        Bus bus = new Bus.BusBuilder("B111US777", "Liaz-677M").setMileage(1000).build();
        System.out.println(bus.toString());
    }
}
