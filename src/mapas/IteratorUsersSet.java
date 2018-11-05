
public class IteratorUsersSet implements IteratorInterface {

    protected Set<User> usersSet;
    protected int count;

    protected IteratorUsersSet(Set<User> usersSet) {
        this.usersSet = usersSet;
        count = 0;
    }

    public void first() {
        count = 0;
    }

    public void next() {
        count++;
    }

    public boolean isDone() {
        return count == usersSet.size();
    }

    public User currentItem() {
        if (isDone()) {
            count = usersSet.size() - 1;
        } else if (count < 0) {
            count = 0;
        }
        return usersSet.get(count);
    }
}