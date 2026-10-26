import java.util.Scanner;

class Vehicle{
    public String number;
    public String name;
    public int charge;

    public Vehicle(String number,String name,int charge){
        this.number=number;
        this.name=name;
        this.charge=charge;
    }

    public void display(){
        System.out.println("\n----------Vehicle Details----------");
        System.out.println("Vehicle Nubmer:    "+number);
        System.out.println("Brand Name:        "+name);
        System.out.println("Rental Charge:     "+charge);
    }

    public int rentalCharge(int days){
        return charge*days;
    }
}

class Car extends Vehicle{
    public int seat;
    public String type;

    public Car(String number,String name,int charge,int seat,String type){
        super(number,name,charge);
        this.seat=seat;
        this.type=type;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Number of Seats: "+seat);
        System.out.println("Vehicle Type: "+type);
    }

    @Override
    public int rentalCharge(int days){
        return charge*days;
    }
}

class Bike extends Vehicle{
    public int capacity;
    public String helmet;

    public Bike(String number,String name,int charge,int capacity,String helmet){
        super(number,name,charge);
        this.capacity=capacity;
        this.helmet=helmet;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Engine Capacity: "+capacity);
        System.out.println("Vehicle Type: "+helmet);
    }

    @Override
    public int rentalCharge(int days){
        return charge*days;
    }
}

class ElectricVehicle extends Vehicle{
    public int bcapacity;
    public String ctype;

    public ElectricVehicle(String number,String name,int charge,int bcapacity,String ctype){
        super(number,name,charge);
        this.bcapacity=bcapacity;
        this.ctype=ctype;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Battery Capacity: "+bcapacity);
        System.out.println("Charging Type: "+ctype);
    }

    @Override
    public int rentalCharge(int days){
        return charge*days;
    }
}

public class Inheritance{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice;

        do{
            System.out.println("\nRental Management System");
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Electric Vehicle");
            System.out.println("4. Exit");

            System.out.print("Enter the Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if(choice>=1 && choice<=3){
                System.out.print("Enter the Vehicle Number: ");
                String number=sc.nextLine();
    
                System.out.print("Enter the Brand: ");
                String name=sc.nextLine();
    
                System.out.print("Enter the Rental Charge: ");
                int charge=sc.nextInt();
                sc.nextLine();

                Vehicle v = null;

            switch(choice){
                case 1:
                    System.out.print("Enter the Number of Seats: ");
                    int seat=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter the Fuel Type: ");
                    String type=sc.nextLine();

                    v=new Car(number,name,charge,seat,type);
                    break;

                case 2:
                    System.out.print("Enter the Engine Capacity: ");
                    int capacity=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Helmet Provided(Yes/No): ");
                    String helmet=sc.nextLine();

                    v=new Bike(number,name,charge,capacity,helmet);
                    break;

                case 3:
                    System.out.print("Enter the Battery Capacity: ");
                    int bcapacity=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter the Charging Type: ");
                    String ctype=sc.nextLine();

                    v=new ElectricVehicle(number,name,charge,bcapacity,ctype);
                    break;
            }

            System.out.print("Enter the Number of Days: ");
            int day=sc.nextInt();
            sc.nextLine();

            v.display();
            System.out.println("Total Rental Charge: "+v.rentalCharge(day));
            }else if(choice==4){
                System.out.println("Exiting...");
            }else{
                System.out.println("Invalid Chocie");
            }
        } while(choice!=4);

        sc.close();
    }
}