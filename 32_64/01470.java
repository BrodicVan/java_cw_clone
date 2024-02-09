/**
 * Util method to write an attribute with the ns prefix
 */
private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                             java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
     if (xmlWriter.getPrefix(namespace) == null) {
              xmlWriter.writeNamespace(prefix, namespace);
              xmlWriter.setPrefix(prefix, namespace);

     }

     xmlWriter.writeAttribute(namespace,attName,attValue);

}