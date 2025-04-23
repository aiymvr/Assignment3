import java.util.Random;

public class MyTestingClass {
    private int field1;
    private int field2;

    public MyTestingClass(int field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + field1;
        result = prime * result + field2;
        result = prime * result + (field1 ^ (field2 >>> 16));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyTestingClass other = (MyTestingClass) obj;
        return field1 == other.field1 && field2 == other.field2;
    }

    @Override
    public String toString() {
        return "(" + field1 + ", " + field2 + ")";
    }
}
