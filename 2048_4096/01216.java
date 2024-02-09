/**
 * 从配置的名字获取父类mapper接口的名字
 * 如果没有特定配置，默认应该是BaseMapper
 * @param superMapperName  父mapper类名称
 * @return
 */
private Class getSuperMapperByName(String superMapperName){
    Class clazz = null;
    try {
        clazz = Class.forName(superMapperName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    return clazz;
}