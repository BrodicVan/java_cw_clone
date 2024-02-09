/** 计算两点之间的距离 */
private float spacing(float x1, float y1, float x2, float y2){
    float x = x1 - x2;
    float y = y1 - y2;
    return (float) Math.sqrt(x * x + y * y);
}