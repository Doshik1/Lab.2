public class Client extends AbstractPerson{
    String service = "manicure";
    float price = 1500;
    public Client(String name) {
        super(name);
        this.service = service;
        this.price = price;
    }
    String getService(){
        return service;
    }
    float getPrice() {
        return price;
    }

    @Override
    public String think() {
        return "I am a client. I want " + service + " for " + price;
    }
}
