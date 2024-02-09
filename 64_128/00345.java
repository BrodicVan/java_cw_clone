/**
 * Appends an internal name, a type descriptor or a type signature to
 * {@link #buf buf}.
 * 
 * @param type indicates if desc is an internal name, a field descriptor, a
 *        method descriptor, a class signature, ...
 * @param desc an internal name, type descriptor, or type signature. May be
 *        <tt>null</tt>.
 */
protected void appendDescriptor(final int type, final String desc){
    if (type == CLASS_SIGNATURE || type == FIELD_SIGNATURE
            || type == METHOD_SIGNATURE)
    {
        if (desc != null) {
            buf.append("// signature ").append(desc).append('\n');
        }
    } else {
        buf.append(desc);
    }
}