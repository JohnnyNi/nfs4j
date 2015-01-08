/*
 * Automatically generated by jrpcgen 1.0.7+ on 1/8/15 10:21 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 *
 * This version of jrpcgen adopted by dCache project
 * See http://www.dCache.ORG for details
 */
package org.dcache.nfs.v4.ff;
import org.dcache.xdr.*;
import java.io.IOException;
import org.dcache.nfs.v4.xdr.uint32_t;

public class ff_device_versions4 implements XdrAble, java.io.Serializable {
    public uint32_t ffdv_version;
    public uint32_t ffdv_minorversion;
    public uint32_t ffdv_rsize;
    public uint32_t ffdv_wsize;
    public boolean ffdv_tightly_coupled;

    private static final long serialVersionUID = 8550127182986622481L;

    public ff_device_versions4() {
    }

    public ff_device_versions4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        ffdv_version.xdrEncode(xdr);
        ffdv_minorversion.xdrEncode(xdr);
        ffdv_rsize.xdrEncode(xdr);
        ffdv_wsize.xdrEncode(xdr);
        xdr.xdrEncodeBoolean(ffdv_tightly_coupled);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        ffdv_version = new uint32_t(xdr);
        ffdv_minorversion = new uint32_t(xdr);
        ffdv_rsize = new uint32_t(xdr);
        ffdv_wsize = new uint32_t(xdr);
        ffdv_tightly_coupled = xdr.xdrDecodeBoolean();
    }

}
// End of ff_device_versions4.java
