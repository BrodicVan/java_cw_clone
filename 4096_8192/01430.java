// 获取两个日期中的最小日期
public static Date min(Date beginDate, Date endDate){
    if (beginDate == null) {
        return endDate;
    }
    if (endDate == null) {
        return beginDate;
    }
    if (beginDate.after(endDate)) {
        return endDate;
    }
    return beginDate;
}