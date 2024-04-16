package Assignment6;

import java.util.Iterator;

public interface IterableByUser<T> {
    Iterator<T> iterator(User userToSearchWith);
}
