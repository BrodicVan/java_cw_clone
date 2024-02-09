/**
 * convert data as memory
 * 
 * @param data
 * @return a string with correct format
 *
 * Reference:
 * http://stackoverflow.com/questions/3758606/how-to-convert-byte-size-into-human-readable-format-in-java
 */
@SuppressLint("DefaultLocale")
public static String convertToSize(long data, boolean si){
  int unit = si ? 1000 : 1024;
  if (data < unit)
    return data + " B";
  int exp = (int) (Math.log(data) / Math.log(unit));
  String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp - 1) + (si ? "" : "i");
  return String.format("%.1f %sB", data / Math.pow(unit, exp), pre);
}