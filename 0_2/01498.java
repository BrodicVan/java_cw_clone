/**
 * @param	sign		Signature of this method.
 * @param	ctnrType	The type of the class in which this
 * 						method is declared.
 * @param	ctnrMethod	The "immediate containing method" of this
 * 						method.
 * @param	lineNum		The first line number of this method's
 * 						declaration in its containing file.
 */
public Method(String sign, Type ctnrType, Method ctnrMethod,
		int lineNum){
	this.sign = sign;
	this.ctnrType = ctnrType;
	this.ctnrMethod = ctnrMethod;
	this.lineNum = lineNum;
}