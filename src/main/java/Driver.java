public class Driver {

    private final String name;
    private final Transport transport;


    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

    public Transport getTransport() {
        return transport;
    }

    public void startTheCar(){
        System.out.println(name + " сел в , " + transport);
        transport.start();
    }
}