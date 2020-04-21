package com.hjds.plugin;

import java.io.File;

public class Const {
    public static final String NAME = "JRouterPlugin";
    static String Const_path = "com.hjds.routerlibs";
    /**
     * ServiceLoader初始化
     */
    public static final String SERVICE_LOADER_INIT = Const_path + ".JdsRouterUtil";
    public static final String INIT_METHOD = "init";


    public static final String INIT_SERVICE_DIR = Const_path.replace('.', File.separatorChar);

}
