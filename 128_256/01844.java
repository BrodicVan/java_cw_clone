/**
 * Specifies the speed factor of video's being written, default = 1. A speed of > 1 will increase the speed, < 1 will 
 * decrease the speed.
 * @param speed
 * @return
 */
public FramesToVideoOp speed(float speed){
	this.speed = speed;
	return this;
}