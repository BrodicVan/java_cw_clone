/**
 * Beendet sich selbst, wenn die Socket geschlossen wird.
 * @param socket Socket, auf der gelauscht werden soll.
 * Muss bereit sein, um accept() auf zu rufen, also insbesondere bereits im Listening-Modus sein.
 * @param parent Main, zu der dieser ListeningThread geh&ouml;rt. 
 */
public ListeningThread(ServerSocket socket, Main parent){
	this.socket = socket;
	this.parent = parent;
}