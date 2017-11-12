
package com.tensorflow.hackinfinity;

import com.tensorflow.hackinfinity.Classifier.Recognition;

import java.util.List;

public interface ResultsView {
  public void setResults(final List<Recognition> results);
}
