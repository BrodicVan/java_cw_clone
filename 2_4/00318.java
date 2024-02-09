/**
 * Return if the given field is allowed for binding.
 * Invoked for each passed-in property value.
 * <p>The default implementation checks for "xxx*", "*xxx" and "*xxx*" matches,
 * as well as direct equality, in the specified lists of allowed fields and
 * disallowed fields. A field matching a disallowed pattern will not be accepted
 * even if it also happens to match a pattern in the allowed list.
 * <p>Can be overridden in subclasses.
 * @param field the field to check
 * @return if the field is allowed
 * @see #setAllowedFields
 * @see #setDisallowedFields
 * @see org.springframework.util.PatternMatchUtils#simpleMatch(String, String)
 */
protected boolean isAllowed(String field){
	String[] allowed = getAllowedFields();
	String[] disallowed = getDisallowedFields();
	return ((ObjectUtils.isEmpty(allowed) || PatternMatchUtils.simpleMatch(allowed, field)) &&
			(ObjectUtils.isEmpty(disallowed) || !PatternMatchUtils.simpleMatch(disallowed, field)));
}