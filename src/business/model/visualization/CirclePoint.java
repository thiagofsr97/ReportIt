public class CirclePoint {

    private double saturation;

    public CirclePoint(double saturation, ) {
        this.saturation = saturation;
    }

    public void drawImage(Point point) {
        System.out.println("circulo desenhado no ponto: ( " + this.point.x
                            + ", " + this.point.y + ") com saturação de : " + this.saturation +"%");
    }
}