/**
 * x (t) = (t ^ 2) * a * 0.5 + v0 * t + x0
 */
public class GravityCalculator {

    public static final double GRAVITY_CONSTANT = 9.8;
    public static final double ANOTHER_CONSTANT = 0.5;

    int fallingTime = 0;
    double initialPosition = 0;
    double initialVelocity = 0;

    public GravityCalculator() {
    }

    public GravityCalculator(int fallingTime, double initialPosition, double initialVelocity) {
        this.fallingTime = fallingTime;
        this.initialPosition = initialPosition;
        this.initialVelocity = initialVelocity;
    }

    public void calculate() {
        double finalPosition = (fallingTime * fallingTime)
                * (GRAVITY_CONSTANT * ANOTHER_CONSTANT)
                + (initialVelocity * fallingTime)
                + initialPosition;

        System.out.println("Position in " + fallingTime + " seconds:" + finalPosition);
    }

    public static void main(String[] args) {
        GravityCalculator calculator = new GravityCalculator(10, 5, 23);

        calculator.calculate();
    }
}