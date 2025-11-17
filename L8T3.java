abstract class Convert {
    private double variable1;
    private double variable2;

    public Convert() {

    }

    public Convert(double variable1) {
        this.variable1 = variable1;
    }
    
    public double getVariable1() {
        return variable1;
    }
    public void setVariable1(double variable1) {
        this.variable1 = variable1;
    }
    public double getVariable2() {
        return variable2;
    }
    public void setVariable2(double variable2) {
        this.variable2 = variable2;
    }

    public abstract double compute();

    @Override
    public String toString() {
        return "Convert [variable1=" + variable1 + ", variable2=" + variable2 + "]";
    }
}

class l_to_g extends Convert{

    public l_to_g(double variable1) {
        super(variable1);
    }

    public double compute() {
        return 0.264172 * getVariable1();

    }
}

class f_to_m extends Convert{

    public f_to_m(double variable1) {
        super(variable1);
    }

    public double compute() {
        return 0.3048 * getVariable1();

    }
}

class f_to_c extends Convert{

    public f_to_c(double variable1) {
        super(variable1);
    }

    public double compute() {
        return (5.0/9.0 * (getVariable1() - 32));

    }
}

public class L8T3 {
    public static void main(String[] args) {

        System.out.println("---------------");
        Convert c1 = new l_to_g(5);
        c1.setVariable2(c1.compute());
        System.out.println(c1.toString());

        System.out.println("---------------");
        Convert c2 = new f_to_m(10);
        c2.setVariable2(c2.compute());
        System.out.println(c2.toString());    
            
        System.out.println("---------------");
        Convert c3 = new f_to_c(104);
        c3.setVariable2(c3.compute());
        System.out.println(c3.toString());
        System.out.println("---------------");
    }
}
