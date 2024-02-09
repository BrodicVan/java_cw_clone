/**
 * 
 * @param message
 * @param faultInfo
 * @param cause
 */
public HandlingReportErrors_Exception(String message, HandlingReportErrors faultInfo, Throwable cause){
    super(message, cause);
    this.faultInfo = faultInfo;
}