/*
 * Automatically generated by jrpcgen 1.0.7+ on 1/8/15 2:35 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 *
 * This version of jrpcgen adopted by dCache project
 * See http://www.dCache.ORG for details
 */
package org.dcache.nfs.v4.ff;
import org.dcache.xdr.*;
import java.io.IOException;
import org.dcache.nfs.v4.xdr.deviceid4;

public class device_error4 implements XdrAble, java.io.Serializable {
    public deviceid4 de_deviceid;
    public int de_status;
    public int de_opnum;

    private static final long serialVersionUID = 6728143735304786797L;

    public device_error4() {
    }

    public device_error4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        de_deviceid.xdrEncode(xdr);
        xdr.xdrEncodeInt(de_status);
        xdr.xdrEncodeInt(de_opnum);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        de_deviceid = new deviceid4(xdr);
        de_status = xdr.xdrDecodeInt();
        de_opnum = xdr.xdrDecodeInt();
    }

}
// End of device_error4.java
