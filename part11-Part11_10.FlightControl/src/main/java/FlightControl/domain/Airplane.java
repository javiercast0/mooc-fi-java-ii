package FlightControl.domain;

public class Airplane {
    private final String id;
    private final int capacity;

    public Airplane(String id, int capacity) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID cannot be null or empty");
        }
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive");
        }
        this.id = id;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return String.format("%s (Capacity: %d passengers)", id, capacity);
    }
}