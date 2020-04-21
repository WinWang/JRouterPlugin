package com.hjds.plugin;

import com.android.build.gradle.BaseExtension;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * 插件所做工作：将注解生成器生成的初始化类汇总到ServiceLoaderInit，运行时直接调用ServiceLoaderInit
 */
public class RouterPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        WMRouterExtension extension = project.getExtensions()
                .create(Const.NAME, WMRouterExtension.class);
        WMRouterLogger.info("register transform");
        project.getExtensions().findByType(BaseExtension.class)
                .registerTransform(new WMRouterTransform());
//        WMRouterLogger.setConfig(extension);
        project.afterEvaluate(p -> WMRouterLogger.setConfig(extension));
    }
}
