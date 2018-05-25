package sample;

public class ChildTwo extends Parent {
    static Builder getBuilder() {
        return new Builder();
    }

    static class Builder extends Parent.Builder<ChildTwo> {
        ChildTwo getT() {
            return new ChildTwo();
        }
    }
}
