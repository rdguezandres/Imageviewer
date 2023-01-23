package architecture;

public interface Image {

    Object data();
    int width();
    Image prev();
    Image next();
}
