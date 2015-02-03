package ftp.rsommerard;

import java.net.InetAddress;

/**
 * Created by Romain on 27/01/15.
 */
public class Constants {
    public static final String MSG_202 = "202 Command not implemented, superfluous at this site.\n";
    public static final String MSG_215 = "215 NAME system type.\n";
    public static final String MSG_220 = "220 Service ready for new user.\n";
    public static final String MSG_230 = "230 User logged in, proceed.\n";
    public static final String MSG_257 = "257 \"DIRECTORY\"\n";

    public static final String MSG_331 = "331 User name okay, need password.\n";

    public static final String MSG_502 = "502 Command not implemented.\n";

    public static final String USER_TYPE_USER = "USER";
    public static final String PASS_TYPE_REQUEST = "PASS";
    public static final String SYST_TYPE_REQUEST = "SYST";
    public static final String FEAT_TYPE_REQUEST = "FEAT";
    public static final String PWD_TYPE_REQUEST = "PWD";
    public static final String UNKNOWN_TYPE_REQUEST = "UNKNOWN";

    public static final String NONE = "NONE";

    public static final String ANONYMOUS_USER = "anonymous";

    public static final String DEMO_USER = "demo";
    public static final String DEMO_PASS = "demo";

}
