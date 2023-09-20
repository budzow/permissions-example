package sonar.source.support;


public interface A {

  static boolean foo(A a) {
    Boolean b = a.getBoolean();
    return java.util.Objects.nonNull(b) && b;
  }

  static boolean bar(A a) {
    Boolean b = a.getBoolean();
    return b != null && b;
  }

  Boolean getBoolean();
}