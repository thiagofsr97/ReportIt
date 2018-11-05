
public class IteratorUsersMap implements IteratorInterface {

    protected Map<String, User> usersMap;
    protected int count;

    protected IteratorUsersMap(Map<String, User> usersMap) {
        this.usersMap = usersMap;
        count = 0;
    }

    public void first() {
        count = 0;
    }

    public void next() {
        count++;
    }

    public boolean isDone() {
        return count == usersMap.size();
    }

    public User currentItem() {
        if (isDone()) {
            count = usersMap.size() - 1;
        } else if (count < 0) {
            count = 0;
        }
        return usersMap.get(count);
    }
}