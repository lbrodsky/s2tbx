package org.esa.s2tbx.dataio.jp2.internal;

import java.io.File;

/**
 * Created by kraftek on 7/9/2015.
 */
public class JP2ProductReaderConstants {
    public static final Class[] INPUT_TYPES = new Class[] { String.class, File.class };
    public static final String[] FORMAT_NAMES = new String[] { "JPEG2000" };
    public static final String[] DEFAULT_EXTENSIONS = new String[] { ".jp2" };
    public static final String DESCRIPTION = "JPEG-2000 Files";
    public static final String JP2_INFO_FILE = "%s_dump.txt";
    public static final String TAG_RASTER_DIMENSIONS = "/featurecollection/featuremember/featurecollection/featuremember/rectifiedgridcoverage/rectifiedgriddomain/rectifiedgrid/limits/gridenvelope/@high";
    public static final String TAG_ORIGIN = "/featurecollection/featuremember/featurecollection/featuremember/rectifiedgridcoverage/rectifiedgriddomain/rectifiedgrid/origin/point/@pos";
    public static final String TAG_OFFSET_VECTOR = "/featurecollection/featuremember/featurecollection/featuremember/rectifiedgridcoverage/rectifiedgriddomain/rectifiedgrid/@offsetVector";
    public static final String TAG_CRS_NAME = "/featurecollection/featuremember/featurecollection/featuremember/rectifiedgridcoverage/rectifiedgriddomain/rectifiedgrid/origin/point/@srsname";
    public static final String TYPE = "JPEG-2000";
}