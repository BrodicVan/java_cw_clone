/**
  * Util method to write an attribute without the ns prefix
  */
private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                              java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
        if (namespace.equals(""))
      {
          xmlWriter.writeAttribute(attName,attValue);
      }
      else
      {
          registerPrefix(xmlWriter, namespace);
          xmlWriter.writeAttribute(namespace,attName,attValue);
      }
  }