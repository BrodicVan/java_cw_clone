// 获取两个日期中的最大日期
public static Date max(Date beginDate, Date endDate){
    if (beginDate == null) {
        return endDate;
    }
    if (endDate == null) {
        return beginDate;
    }
    if (beginDate.after(endDate)) {
        return beginDate;
    }
    return endDate;
}