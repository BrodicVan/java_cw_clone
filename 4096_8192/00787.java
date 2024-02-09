/**
 * 获取从文件中选择照片的Intent
 *
 * @return
 */
public static Intent getPickIntentWithDocuments(){
    Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
    intent.setType("image/*");
    return intent;
}