/**
 * Put or replace a double value. If the index is greater than the length of
 *  the JSONArray, then null elements will be added as necessary to pad
 *  it out.
 * @param index The subscript.
 * @param value A double value.
 * @return this.
 * @throws JSONException If the index is negative or if the value is
 * not finite.
 */
public JSONArray put(int index, double value) throws JSONException{
    put(index, new Double(value));
    return this;
}