package com.mert.MonolitSpotify.constants;

public class RestApi {
    private static final String VERSION = "/v1";
    private static final String DEV = "/dev";
    private static final String TEST = "/test";
    private static final String PROD = "/prod";

    private static final String ROOT = VERSION+DEV;

    public static final String USER = VERSION+DEV+"/userprofie";
    public static final String MUZIK = VERSION+DEV+"/muzik";


    public static final String SAVE= "/save";
    public static final String UPDATE= "/update";
    public static final String DELETE= "/delete";
    public static final String FINDALL= "/findall";
    public static final String FINDBYID= "/findbyid";


}
