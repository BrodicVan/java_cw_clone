/**
 * Register a namespace prefix
 */
private java.lang.String registerPrefix(
    javax.xml.stream.XMLStreamWriter xmlWriter,
    java.lang.String namespace)
    throws javax.xml.stream.XMLStreamException{
    java.lang.String prefix = xmlWriter.getPrefix(namespace);

    if (prefix == null) {
        prefix = generatePrefix(namespace);

        while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
            prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
    }

    return prefix;
}