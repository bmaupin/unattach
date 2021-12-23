package app.unattach.model;

import java.util.List;
import java.util.Set;

public interface Config {
  Set<String> getPropertyNames();
  int getEmailSize();
  String getDateFormat();
  boolean getRemoveOriginal();
  String getFilenameSchema();
  List<String> getLabelIds();
  String getDownloadedLabelId();
  boolean getProcessEmbedded();
  String getRemovedLabelId();
  boolean getResizeImages();
  String getSearchQuery();
  String getSelectedSearchTab();
  boolean getSignInAutomatically();
  boolean getSubscribeToUpdates();
  String getTargetDirectory();
  void saveDateFormat(String pattern);
  void saveRemoveOriginal(boolean removeOriginal);
  void saveDownloadedLabelId(String downloadedLabelId);
  void saveEmailSize(int emailSize);
  void saveFilenameSchema(String schema);
  void saveLabelIds(List<String> labelIds);
  void saveProcessEmbedded(boolean processEmbedded);
  void saveRemovedLabelId(String removedLabelId);
  void saveResizeImages(boolean resizeImages);
  void saveSearchQuery(String query);
  void saveSelectedSearchTab(String selectedSearchTab);
  void saveSignInAutomatically(boolean signInAutomatically);
  void saveSubscribeToUpdates(boolean subscribeToUpdates);
  void saveTargetDirectory(String path);
}
