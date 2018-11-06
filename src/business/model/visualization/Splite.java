public class Sprite extends SpriteFlyweight {
    protected CirclePoint circlePoint;

    public Sprite(double saturation) {
        this.circlePoint = new CirclePoint(saturation);
    }

    @Override
    public void drawImage(Point point) {
        circlePoint.drawImage(point);
    }
}