package se.alipsa.rideutils;

import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.renjin.sexp.SEXP;

public interface GuiInteraction {

  /**
   * display an image in the Plot tab
   */
  void display(Node node, String... title);

  /**
   * display an image in the Plot tab
   */
  void display(Image img, String... title);

  /**
   * display an image in the Plot tab
   */
  void display(String fileName, String... title);

  /**
   * display data in the Viewer tab
   */
  void View(SEXP sexp, String... title);

  /**
   * display html in the Viewer tab
   */
  void viewHtml(SEXP sexp, String... title);

  /**
   * display html in the Viewer tab
   */
  void viewer(SEXP sexp, String... title);

  /** Return the current active script file or null if is has not been saved yet */
  String scriptFile();

  /** Allows Dialogs and similar in eternal packages to interact with Ride **/
  Stage getStage();
}
