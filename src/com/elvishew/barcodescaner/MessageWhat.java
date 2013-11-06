
package com.elvishew.barcodescaner;

public class MessageWhat {
    public static final int AUTO_FOCUS = 1;
    public static final int DECODE = AUTO_FOCUS + 1;
    public static final int DECODE_FAILED = DECODE + 1;
    public static final int DECODE_SUCCEEDED = DECODE_FAILED + 1;
    public static final int ENCODE_FAILED = DECODE_SUCCEEDED + 1;
    public static final int ENCODE_SUCCEEDED = ENCODE_FAILED + 1;
    public static final int LAUNCH_PRODUCT_QUERY = ENCODE_SUCCEEDED + 1;
    public static final int PREVIEW_VIEW = LAUNCH_PRODUCT_QUERY + 1;
    public static final int QUIT = PREVIEW_VIEW + 1;
    public static final int RESTART_PREVIEW = QUIT + 1;
    public static final int RETURN_SCAN_RESULT = RESTART_PREVIEW + 1;
}
