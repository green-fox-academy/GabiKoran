public class ListDoesNotExistException extends Exception {

    public ListDoesNotExistException() {
        System.err.println("List does not exist.");
    }
}