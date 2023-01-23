import architecture.ImageDisplay;
import architecture.ImageLoader;
import architecture.ImagePresenter;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        ImageLoader imageLoader = new FileImageLoader(new File("images"));
        MainFrame mainFrame = new MainFrame();
        ImageDisplay imageDisplay = mainFrame.imageDisplay();
        ImagePresenter.with(imageLoader.load(), imageDisplay);
        mainFrame.setVisible(true);
    }
}