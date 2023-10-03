package net.ublik.image.processor;

import java.io.IOException;

public interface ImageProcessor {

	byte[] addTextWatermark(String url, String text, String type, int fontSize,  int positionX, int positionY, String color, float alpha) throws IOException;
}
