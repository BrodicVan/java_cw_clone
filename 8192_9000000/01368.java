// Build 2D matrix of QR Code from "dataBits" with "ecLevel", "version" and "getMaskPattern". On
// success, store the result in "matrix" and return true.
public static void buildMatrix(BitArray dataBits, ErrorCorrectionLevel ecLevel, int version,
    int maskPattern, ByteMatrix matrix) throws WriterException{
  clearMatrix(matrix);
  embedBasicPatterns(version, matrix);
  // Type information appear with any version.
  embedTypeInfo(ecLevel, maskPattern, matrix);
  // Version info appear if version >= 7.
  maybeEmbedVersionInfo(version, matrix);
  // Data should be embedded at end.
  embedDataBits(dataBits, maskPattern, matrix);
}