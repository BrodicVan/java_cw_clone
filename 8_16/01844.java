/** 
 * Create new instance of UpdateStatusTask.
 * @param controller    Application controller
 * @param api           Twitter API wrapper
 * @param status        Your current status text
 */
public UpdateStatusTask(
        IdenticaController controller,
        IdenticaApi api,
        String status){
    this.controller = controller;
    this.api = api;
    this.status = status;
}