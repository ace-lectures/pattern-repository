package xunit;

import java.util.Objects;

public class Assertion implements Test {

    private String contents;

    public Assertion(String contents) { this.contents = contents; }

    @Override public void run() { System.out.println("  -->> Asserting " + contents); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Assertion assertion = (Assertion) o;
        return Objects.equals(contents, assertion.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contents);
    }
}
