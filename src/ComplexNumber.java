public class ComplexNumber {
    double re;
    double im;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber other = (ComplexNumber) o;
        return Double.compare(re, other.re) == 0
                && Double.compare(im, other.im) == 0;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(re, im);
    }
}
