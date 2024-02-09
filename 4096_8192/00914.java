/**
 * Retrieves the filter text stored in {@link #setupFilterText(Intent)}.
 * This text originally came from a FILTER_CONTACTS_ACTION intent received
 * by this activity. The stored text will then be cleared after after this
 * method returns.
 *
 * @return The stored filter text
 */
public String getAndClearFilterText(){
    String filterText = mFilterText;
    mFilterText = null;
    return filterText;
}