/**
 *  method to handle Qnames
 */
private void writeQName(javax.xml.namespace.QName qname,
    javax.xml.stream.XMLStreamWriter xmlWriter)
    throws javax.xml.stream.XMLStreamException{
    java.lang.String namespaceURI = qname.getNamespaceURI();

    if (namespaceURI != null) {
        java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

        if (prefix == null) {
            prefix = generatePrefix(namespaceURI);
            xmlWriter.writeNamespace(prefix, namespaceURI);
            xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
            xmlWriter.writeCharacters(prefix + ":" +
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        } else {
            // i.e this is the default namespace
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    } else {
        xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                qname));
    }
}