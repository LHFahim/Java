package com.fahim.hw.hw5.two;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Garden");
        House house = new House("Leaf");
        Apartment apartment = new Apartment("Sunshine");
        HotelApartment hotelApartment = new HotelApartment("Tree");

        displayName(building);
        displayName(house);
        displayName(apartment);
        displayName(hotelApartment);


//        System.out.println(building.toString());
    }

    public static void displayName(Building building){
//        System.out.println(building.getClass().getSimpleName()+": "+ building.getName());
//        System.out.println("\n\n");
//        System.out.println(building.toString());

        System.out.println(building.toString());
    }
}
