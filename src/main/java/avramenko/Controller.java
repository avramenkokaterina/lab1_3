package main.java.avramenko;

public class Controller {

    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        int state = 0;
        int choice;
        int length;
        String brand;
        String carModel;
        int year = 0;
        int price = 0;
        Car[] result;
        String identificationNumber;
        String carColor;
        String carNumber;

        while (true) {
            switch (state) {
                case 0:
                    view.menu();
                    choice = view.readNumber(1);
                    state = choice + 1;
                    break;
                case 1:
                    view.printMessage(1);
                    length = view.readNumber(2);
                    view.printCar(model.createCars(length));
                    state = 4;
                    break;
                case 2:
                    view.printMessage(1);
                    length = view.readNumber(2);
                    for (int i = 0; i < length; i++) {
                        view.printMessage(7);
                        identificationNumber = view.readString();
                        view.printMessage(8);
                        brand = view.readString();
                        view.printMessage(9);
                        carModel = view.readString();
                        view.printMessage(10);
                        do {
                            year = view.readNumber(4);
                        } while (year > 2019);
                        view.printMessage(11);
                        carColor = view.readString();
                        view.printMessage(12);
                        carNumber = view.readString();
                        view.printMessage(13);
                        do {
                            price = view.readNumber(5);
                        } while (price > 1000000001);
                        Car car = new Car(identificationNumber, brand, carModel, year, carColor, carNumber, price);
                        model.addCars(car);
                    }
                    view.printCar(model.getCars());
                    state = 4;
                    break;
                case 3:
                    System.exit(0);
                case 4:
                    view.subMenu();
                    choice = view.readNumber(3);
                    state = choice + 5;
                    break;
                case 5:
                    view.printMessage(2);
                    brand = view.readString();
                    view.printCar(model.getListOfCarsBrand(brand, view));
                    state = 4;
                    break;
                case 6:
                    view.printMessage(3);
                    carModel = view.readString();
                    view.printMessage(4);
                    do {
                        year = view.readNumber(4);
                    } while (year > 2019);
                    view.printCar(model.getListOfCarsYears(carModel, year, view));
                    state = 4;
                    break;
                case 7:
                    view.printMessage(4);
                    do {
                        year = view.readNumber(4);
                    } while (year > 2019);
                    view.printMessage(5);
                    do {
                        price = view.readNumber(5);
                    } while (price > 1000000001);
                    view.printCar(model.getListOfCarsPrice(year, price, view));
                    state = 4;
                    break;
                case 8:
                    state = 0;
                    break;
                case 9:
                    state = 3;
            }
        }
    }
}