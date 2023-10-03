
package net.ublik.image.processor;

public final class ImageProcessorFactory {

    private ImageProcessorFactory() {
    }

    public static ImageProcessor createInstance() {
        return new ImageProcessorImpl();
    }
}
