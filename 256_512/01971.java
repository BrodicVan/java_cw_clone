/**
 * 指定通过权限Id查询关联用户的时候,返回结果是否包含角色和用户的关联关系信息.
 * <p>默认为false</p>
 */
public PermissionQuery setIncludeRoleUser(Boolean includeRoleUser){
  this.includeRoleUser = includeRoleUser;
  return this;
}