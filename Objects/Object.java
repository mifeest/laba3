package lab3.Objects;


import java.util.Objects;

public abstract class Object {
    protected String add;
    String name;

    public Object(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (getClass() != other.getClass()) {
            return false;
        }
        Object that = other;

        return (getName() == that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(add, name);
    }

    @Override
    public String toString() {
        return "Object{" +
                "add='" + add + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
