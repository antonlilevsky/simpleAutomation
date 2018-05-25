package sample;

public class ChildOne extends Parent {
    static Builder getBuilder() {
        return new Builder();
    }

    static class Builder extends Parent.Builder<ChildOne> {
        ChildOne getT() {
            return new ChildOne();
        }


    }
}
