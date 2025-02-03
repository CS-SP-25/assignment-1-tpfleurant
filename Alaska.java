public class Alaska extends State {

    public Alaska() {
        super();
        this.setName("Alaska");
        NoTax nt = new NoTax();
        this.setBehavior((nt));
    }

}