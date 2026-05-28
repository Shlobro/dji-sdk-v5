/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.utils.inner;

import dji.v5.network.security.WhiteBoxAES;
import dji.v5.utils.common.BytesUtil;
import dji.v5.utils.common.LogPath;
import dji.v5.utils.common.LogUtils;
import dji.v5.utils.inner.ConstantsUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class HttpsUtils {
    private static final boolean sInit;
    private static final Map<String, String> CERTIFICATES;
    private static final Map<String, String> REVOKED_CERTIFICATES;
    private static final List<String> CERTIFICATES_ENC_HASH;
    private static final List<String> CERTIFICATES_HASH_C;
    private static final List<byte[]> CERTIFICATES_HASH;
    private static final List<X509Certificate> sRootCerts;
    private static final List<X509Certificate> sRevokedCerts;
    private static KeyStore sKeyStore;

    public static List<X509Certificate> getRootCerts() {
        return null;
    }

    public static SSLSocketFactory getDJISSLSocketFactoryForJavax() {
        return null;
    }

    private static void checkCondition() {
    }

    private static byte[] sha256(String string2) {
        return null;
    }

    public static DJIX509TrustManager getTrustManager() {
        return null;
    }

    private HttpsUtils() {
    }

    static /* synthetic */ List access$000() {
        return null;
    }

    static {
        CERTIFICATES = ConstantsUtils.getRootCACerts();
        REVOKED_CERTIFICATES = ConstantsUtils.getRevokedCerts();
        CERTIFICATES_ENC_HASH = ConstantsUtils.getCertificatesEncHash();
        CERTIFICATES_HASH_C = ConstantsUtils.getCertificatesHash();
        CERTIFICATES_HASH = new ArrayList<byte[]>();
        sRootCerts = new ArrayList<X509Certificate>();
        sRevokedCerts = new ArrayList<X509Certificate>();
        try {
            CertificateFactory certificateFactory;
            ByteArrayInputStream certStream;
            sKeyStore = KeyStore.getInstance("AndroidKeyStore");
            sKeyStore.load(null);
            for (Map.Entry<String, String> entry : CERTIFICATES.entrySet()) {
                certStream = new ByteArrayInputStream(entry.getValue().getBytes());
                certificateFactory = CertificateFactory.getInstance("X.509");
                X509Certificate rootCert = (X509Certificate)certificateFactory.generateCertificate(certStream);
                sRootCerts.add(rootCert);
                sKeyStore.setCertificateEntry(entry.getKey(), rootCert);
            }
            for (Map.Entry<String, String> entry : REVOKED_CERTIFICATES.entrySet()) {
                certStream = new ByteArrayInputStream(entry.getValue().getBytes());
                certificateFactory = CertificateFactory.getInstance("X.509");
                X509Certificate revokedCert = (X509Certificate)certificateFactory.generateCertificate(certStream);
                sRevokedCerts.add(revokedCert);
            }
        }
        catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
            LogUtils.e(LogPath.COMMON, e2.getMessage());
        }
        sInit = true;
        for (String certEncHash : CERTIFICATES_ENC_HASH) {
            byte[] certHash = WhiteBoxAES.decryptFromWhiteBox(WhiteBoxAES.hex2byte(certEncHash));
            CERTIFICATES_HASH.add(certHash);
        }
        for (String certHash : CERTIFICATES_HASH_C) {
            CERTIFICATES_HASH.add(BytesUtil.hex2byte(certHash));
        }
        for (Map.Entry<String, String> entry : CERTIFICATES.entrySet()) {
            boolean valid = false;
            String certString = entry.getValue();
            byte[] certSha256 = HttpsUtils.sha256(certString);
            for (byte[] certificateSha256 : CERTIFICATES_HASH) {
                if (!Arrays.equals(certificateSha256, certSha256)) continue;
                valid = true;
                break;
            }
            if (valid) continue;
            throw new IllegalStateException("Invalid certificate in trust anchors.");
        }
    }

    private static final class DJISSLSocketFactoryJavaX
    extends SSLSocketFactory {
        final SSLSocketFactory delegate;

        public DJISSLSocketFactoryJavaX(SSLSocketFactory sSLSocketFactory) {
        }

        @Override
        public String[] getDefaultCipherSuites() {
            return null;
        }

        @Override
        public String[] getSupportedCipherSuites() {
            return null;
        }

        @Override
        public Socket createSocket(Socket socket, String string2, int n, boolean bl) throws IOException {
            return null;
        }

        @Override
        public Socket createSocket(String string2, int n) throws IOException {
            return null;
        }

        @Override
        public Socket createSocket(String string2, int n, InetAddress inetAddress, int n2) throws IOException {
            return null;
        }

        @Override
        public Socket createSocket(InetAddress inetAddress, int n) throws IOException {
            return null;
        }

        @Override
        public Socket createSocket(InetAddress inetAddress, int n, InetAddress inetAddress2, int n2) throws IOException {
            return null;
        }

        private Socket patch(Socket socket) {
            return null;
        }
    }

    public static final class DJIX509TrustManager
    implements X509TrustManager {
        private X509TrustManager defaultTM;

        public DJIX509TrustManager(KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        }

        private X509TrustManager findTrustManager(TrustManager[] trustManagerArray) {
            return null;
        }

        @Override
        public void checkClientTrusted(X509Certificate[] x509CertificateArray, String string2) throws CertificateException {
        }

        private boolean searchRootCert(X509Certificate x509Certificate) {
            return false;
        }

        private void searchCertificateRevocationList(X509Certificate[] x509CertificateArray) throws CertificateNotYetValidException {
        }

        @Override
        public void checkServerTrusted(X509Certificate[] x509CertificateArray, String string2) throws CertificateException {
        }

        private void doCheckServerTrusted(X509Certificate[] x509CertificateArray) throws CertificateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, NoSuchProviderException {
        }

        @Override
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }
}

