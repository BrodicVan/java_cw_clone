/**
 * Sets the value stored in this Map Entry.
 * <p/>
 * This Map Entry is not connected to a Map, so only the local data is changed.
 *
 * @param value the new value
 * @return the previous value
 */
public V setValue(V value){
    V answer = this.value;
    this.value = value;
    return answer;
}