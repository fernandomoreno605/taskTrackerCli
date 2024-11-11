package src.shared.domain;

public abstract class Identifier {
    final protected Number value;

    protected Identifier(Number value) {
        isValidValue(value);
        this.value = value;
    }

    private void isValidValue(Number value) throws IllegalArgumentException {
        if (value.equals(0)) throw new IllegalArgumentException("Invalid id value");
    }

    public Number value(){
        return this.value;
    }
}