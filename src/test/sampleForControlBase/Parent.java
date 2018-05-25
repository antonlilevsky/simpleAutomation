package sample;

public abstract class Parent {
    String value;

    @Override
    public String toString() {
        return this.getClass().getName() + "{" +
                "value='" + value + '\'' +
                '}';
    }

    static abstract class Builder<T extends Parent> {
        String val;

        abstract T getT();

        Builder setString(String s) {
            val = s;
            return this;
        }

        T build() {
            T ins = getT();
            ins.value = val;
            return ins;
        }
    }
}
