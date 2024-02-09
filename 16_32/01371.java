/**
 * Constructor for a filter which scales the input image to the given width and height using bicubic interpolation.
 * Unfortunately, it appears that bicubic actually looks worse than bilinear interpolation on most Java implementations,
 * but you can be the judge.
     * @param width the width of the output image
     * @param height the height of the output image
 */
public BicubicScaleFilter( int width, int height ){
	this.width = width;
	this.height = height;
}