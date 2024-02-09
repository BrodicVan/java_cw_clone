//构造函数只有两个参数，左右节点是调用add方法时设置
public Entry(E elem, Entry<E> parent){
    this.elem = elem;
    this.parent = parent;
}