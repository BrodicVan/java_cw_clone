/**
 * 创建新的匹配结果对象
 * 
 * @param value 匹配结果字符串
 */
public MatchResultImpl(MappingNode mappingNode, String value){
    this.mappingNode = mappingNode;
    this.value = value;
}