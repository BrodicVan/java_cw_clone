//    public static <T> T json2Bean(String jsonStr, Class<T> objClass) {
//        try {
//            return mapper.readValue(jsonStr, objClass);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
public static <T> T json2Bean(String jsonStr, TypeReference<T> typeReference){
        try {
            return mapper.readValue(jsonStr, typeReference);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }