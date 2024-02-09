/**
 * @param featureName the name of the feature (i.e. SIFT, SURF, ...) which will be put in the generated Feature's name field
 * @param detectorType the keypoint detection algorithm to use, must be one of org.opencv.features2d.FeatureDetector constants 
 * @param descriptorType the type of descriptor to use, must be one of <a href=org.opencv.features2d.DescriptorExtractor constants
 * @see <a href="http://docs.opencv.org/java/index.html?org/opencv/features2d/FeatureDetector.html">OpenCV FeatureDetector</a>
 * @see <a href="http://docs.opencv.org/java/index.html?org/opencv/features2d/FeatureDetector.html">OpenCV DescriptorExtractor</a>
 */
public FeatureExtractionOp(String featureName, int detectorType, int descriptorType){
	this.featureName = featureName;
	this.detectorType = detectorType;
	this.descriptorType = descriptorType;
}