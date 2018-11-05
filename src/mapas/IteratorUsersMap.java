
public class IteratorUsersMap implements IteratorInterface {

    protected Iterator<Map.Entry<Integer, User>> it;
    protected User currentUser;

    protected IteratorUsersMap(Map<String, User> usersMap) {
        this.it = usersMap.entrySet().iterator();
    }

    public void next() {
        if (isDone())
            currentUser = it.next().getValue();
    }

    public boolean isDone() {
        return it.hasNext();
    }

    public User currentItem() {
        return currentUser;
    }
}