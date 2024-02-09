/**
 * 指定通过权限Id查询关联用户的时候,返回结果是否包含权限和角色的关联关系信息.
 * <p>默认为false</p>
 */
public PermissionQuery setIncludePermRole(Boolean includePermRole){
  this.includePermRole = includePermRole;
  return this;
}