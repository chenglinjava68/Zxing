package com.nepxion.zxing.constant;

/**
 * <p>Title: Nepxion Zxing</p>
 * <p>Description: Nepxion Zxing QR Code</p>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @email 1394997@qq.com
 * @version 1.0
 */

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class ZxingConstants {
    public static final String DEFAULT_FORMAT = "jpg";
    public static final String DEFAULT_ENCODING = "UTF-8";
    public static final ErrorCorrectionLevel DEFAULT_CORRECTION_LEVEL = ErrorCorrectionLevel.H;
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 300;
    public static final int DEFAULT_MARGIN = 1;
    public static final int DEFAULT_FOREGROUND_COLOR = 0xFF000000;
    public static final int DEFAULT_BACKGROUND_COLOR = 0xFFFFFFFF;
    public static final boolean DEFAULT_DELETE_WHITE_BORDER = false;
    public static final int DEFAULT_LOGO_SHRINK_RATIO = 5;
}