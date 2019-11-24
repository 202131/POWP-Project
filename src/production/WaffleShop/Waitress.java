package production.WaffleShop;

public class Waitress {
    Command command;

    public Waitress() {
    }

    public void takeOrder(Command c) {
        this.command = c;
        this.command.orderUp();
    }
}
