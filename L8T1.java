abstract class Package {
    String senderAddress, senderName, recepientAddress, recepientName;
    double weight;
    double costPerOunce;

    public Package() {
    }

    public Package(String senderAddress, String senderName, String recepientAddress, String recepientName,
            double weight, double costPerOunce) {

        this.senderAddress = senderAddress;
        this.senderName = senderName;
        this.recepientAddress = recepientAddress;
        this.recepientName = recepientName;

        if (weight > 0 && costPerOunce > 0) {
            this.weight = weight;
            this.costPerOunce = costPerOunce;
        } else
            System.out.println("Negative values not allowed. Setting to 0");

    }

    public String getSenderAddress() {
        return this.senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public String getSenderName() {
        return this.senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getRecepientAddress() {
        return this.recepientAddress;
    }

    public void setRecepientAddress(String recAddress) {
        this.recepientAddress = recAddress;
    }

    public String getRecepientName() {
        return this.recepientName;
    }

    public void setRecepientName(String recepientName) {
        this.recepientName = recepientName;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else
            System.out.println("Negative values not allowed. Value not changed");
    }

    public double getCostPerOunce() {
        return this.costPerOunce;
    }

    public void setCostPerOunce(double costPerOunce) {
        if (costPerOunce > 0) {
            this.costPerOunce = costPerOunce;
        } else
            System.out.println("Negative values not allowed. Value not changed");

    }

    public double calculateCost() {
        return costPerOunce * weight;
    }

    @Override
    public String toString() {
        return "Sender: " + getSenderName() + " (" + getSenderAddress() + ")\n" +
                "Recipient: " + getRecepientName() + " (" + getRecepientAddress() + ")\n" +
                "Weight: " + getWeight() +
                "Cost: " + getCostPerOunce();
    }

}

class OvernightPackage extends Package {
    double additionalFee;

    public OvernightPackage() {
        super();
    }

    public OvernightPackage(String senderAddress, String senderName, String recAddress, String recName, double weight,
            double costPerOunce, double additionalFee) {

        super(senderAddress, senderName, recAddress, recName, weight, costPerOunce);
        this.additionalFee = additionalFee;
    }

    public double calculateCost() {
        return (additionalFee + super.calculateCost());
    }

}

class TwoDayPackage extends Package {
    double flatFee;

    public TwoDayPackage() {
        super();
    }

    public TwoDayPackage(String senderAddress, String senderName, String recAddress, String recName, double weight,
            double costPerOunce, double flatFee) {

        super(senderAddress, senderName, recAddress, recName, weight, costPerOunce);
        this.flatFee = flatFee;
    }

    public double calculateCost() {
        return (flatFee + super.calculateCost());
    }
}

public class L8T1 {
    public static void main(String[] args) {

        Package p1 = new OvernightPackage("Mexico", "Pablo", "New Mexico", "Walter White", 2500, 500, 10.50);
        Package p2 = new TwoDayPackage("Colombia", "Pablo", "Mexico", "Jimmy", 1000, 500, 10);

        System.out.println("---------------");
        System.out.println(p1.toString());
        System.out.println(p1.calculateCost());
        System.out.println("---------------");
        System.out.println(p2.toString());
        System.out.println(p2.calculateCost());
        System.out.println("Who will be the next CGC?");
        System.out.println("Qahraman!?");
        System.out.println("---------------");
    }
}
