/**
 * 构造二元的条件语句单元。
 * 
 * @param expr - 条件表达式
 * @param unitIfTrue - <code>true</code> 的输出
 * @param unitIfFalse - <code>false</code> 的输出
 */
public ChoiceUnit(String expr, ExqlUnit unitIfTrue, ExqlUnit unitIfFalse){
    this.expr = expr;
    this.unitIfTrue = unitIfTrue;
    this.unitIfFalse = unitIfFalse;
}