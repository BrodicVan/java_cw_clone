/**
 * Constructor that takes a tag and a object with the packet specific 
 * information.
 * @param tag - the tag that identifies the packet
 * @param packetInfo - 
 * */
public OpenPGPPacket(byte tag, PacketSpecificInterface packetInfo){
   this.tag = tag;
   this.packetInfo = packetInfo;
}