package com.laughing.extend.namespaceHandler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by lucene on 2017/6/25.
 */
public class TestNameSpaceHandler extends NamespaceHandlerSupport {
    public void init() {
        registerBeanDefinitionParser("dateformat", new SimpleDateFormatBeanDefinitionParser());
    }
}
