package xunit;

import java.util.*;

public class TestSuite implements Test {

    private String name;
    private Set<Test> tests;

    public TestSuite(String name) {
        this.name = name;
        this.tests = new HashSet<>();
    }

    public void add(Test t) { this.tests.add(t); }
    public void remove(Test t) { this.tests.remove(t); }


    @Override public void run() {
        System.out.println("  Running suite [ "+ name+" ]");
        this.tests.forEach(Test::run);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestSuite testSuite = (TestSuite) o;
        return Objects.equals(name, testSuite.name) &&
                Objects.equals(tests, testSuite.tests);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tests);
    }
}
