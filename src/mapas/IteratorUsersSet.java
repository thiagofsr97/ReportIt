
public class IteratorUsersSet implements IteratorInterface {

    protected Iterator<User> it;
    protected User currentUser;

    protected IteratorUsersSet(Set<User> usersSet) {
        this.it = usersSet.iterator();
    }

    public void next() {
        if (isDone())
            currentUser = it.next();
    }

    public boolean isDone() {
        return it.hasNext();
    }

    public User currentItem() {
        return currentUser;
    }
}