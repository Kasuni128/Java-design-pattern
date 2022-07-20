package momento;


import java.util.Stack;


public class WashingMachine {

    public static void main(String[] args) {

       

        Machine machine=new Machine("Washing Machine : ECONAVI | ");
        machine.save();
        machine.setMachineData("Washing Machine : ECONAVI | Load capacity : 8 Kg | ");
        machine.save();
        machine.setMachineData("Washing Machine : ECONAVI | Load capacity : 8 Kg | Body Colour : White ");

        machine.save();
        machine.undo();

        System.out.println("Machine Content: "+machine.getSpecification());


        machine.undo();

        System.out.println("Machine Content: "+machine.getSpecification());
    }

}

class Machine {

    private String Specifications;
    CareTaker careTaker=new CareTaker();

    public Machine(String Specifications) {

        this.Specifications = Specifications;
    }

    public void setMachineData(String Specifications) {
        this.Specifications = Specifications;
    }

    public String getSpecification() {
        return Specifications;
    }

    public void save() {
        System.out.println(Specifications);
        careTaker.addMemento(new Memento(Specifications));
    }

    public void undo() {

        this.Specifications=careTaker.getMemento().getSpecification();

    }

}

class Memento {


    private final String Specifications;

    public Memento(String Specifications) {

        this.Specifications = Specifications;
    }



    public String getSpecification() {
        return Specifications;
    }

}


class CareTaker {

    private final Stack<Memento> mementos = new Stack<>();


    public void addMemento(Memento memento) {

        mementos.add(memento);

    }

    public Memento getMemento() {


        return mementos.pop();
    }

}

