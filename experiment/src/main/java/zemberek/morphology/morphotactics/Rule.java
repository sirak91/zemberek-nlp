package zemberek.morphology.morphotactics;

import zemberek.morphology.analyzer.SearchPath;

public interface Rule {

  boolean check(SearchPath visitor);
}
