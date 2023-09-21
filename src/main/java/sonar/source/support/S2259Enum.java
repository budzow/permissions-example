package sonar.source.support;

public enum S2259Enum {
    ENUM_A,
    ENUM_B;

    public void reproducer(S2259Enum select) {
      for (S2259Enum typ : S2259Enum.values()) {
        if (select == typ || select == null) {
          typ.name(); // Compliant
        } else {
          typ.toString();
        }
      }
    }
  }