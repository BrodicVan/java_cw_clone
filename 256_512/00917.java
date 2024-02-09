/**
 * 签名字符串
 * @param text 需要签名的字符串
 * @param key 密钥
 * @param input_charset 编码格式
 * @return 签名结果
 */
public static String sign(String text, String key, String input_charset){
	text = text + key;
    return DigestUtils.md5Hex(getContentBytes(text, input_charset));
}