/*
     	* Converts a byte to hex digit and writes to the supplied buffer
     	*/
private void byteToHex(byte b, StringBuffer buf){
        	char[] hexChars = { '0', '1', '2', '3', '4', '5', '6', '7', '8',
                	'9', 'A', 'B', 'C', 'D', 'E', 'F' };
        	int high = ((b & 0xf0) >> 4);
        	int low = (b & 0x0f);
        	buf.append(hexChars[high]);
       	 	buf.append(hexChars[low]);
}