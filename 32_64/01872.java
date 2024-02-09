/**
 * 
 * @param message
 * @param faultInfo
 */
public HandlingReportErrors_Exception(String message, HandlingReportErrors faultInfo){
    super(message);
    this.faultInfo = faultInfo;
}