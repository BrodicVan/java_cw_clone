/**
 * Util method to write an attribute without the ns prefix
 */
private void writeQNameAttribute(java.lang.String namespace,
    java.lang.String attName, javax.xml.namespace.QName qname,
    javax.xml.stream.XMLStreamWriter xmlWriter)
    throws javax.xml.stream.XMLStreamException{
    java.lang.String attributeNamespace = qname.getNamespaceURI();
    java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

    if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
    }

    java.lang.String attributeValue;

    if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
    } else {
        attributeValue = qname.getLocalPart();
    }

    if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
    } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(namespace, attName, attributeValue);
    }
}