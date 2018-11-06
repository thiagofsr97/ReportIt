public class FlyweightFactory {

    protected ArrayList<SpriteFlyweigth> flyweights;

    public enum Sprites {
        SATURACAO_50, SATURACAO_52, SATURACAO_54, SATURACAO_56, SATURACAO_58, SATURACAO_60
    }

    public FlyweightFactory() {
        flyweights = new ArrayList<SpriteFlyweight>();
        flyweights.add(new Splite(50));
        flyweights.add(new Splite(52));
        flyweights.add(new Splite(54));
        flyweights.add(new Splite(56));
        flyweights.add(new Splite(58));
        flyweights.add(new Splite(60));
    }

    public SpriteFlyweigth getFlyweight(Sprites circles) {
        switch (circles) {
            case SATURACAO_50:
                return flyweights.get(0);
            case SATURACAO_52:
                return flyweights.get(1);
            case SATURACAO_54:
                return flyweights.get(2);
            case SATURACAO_56:
                return flyweights.get(3);
            case SATURACAO_58:
                return flyweights.get(4);
            case SATURACAO_60:
                return flyweights.get(5);
            default:
        }
    }
}