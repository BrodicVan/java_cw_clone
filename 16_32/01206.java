/**
 * Injects the objects.
 * 
 * @param matcher The matcher
 * @param rythmChecker The rythmChecker
 * @param postClassifier The postClassifier
 * @param beatAnalyzer The beatAnalyzer
 */
public void setObjects(Matcher matcher, RythmChecker rythmChecker, 
		PostClassifier postClassifier, BeatAnalyzer beatAnalyzer){
	this.matcher = matcher ;
	this.rythmChecker = rythmChecker ;
	this.postClassifier = postClassifier ;
	this.beatAnalyzer = beatAnalyzer ;
	}