/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.xslt.springboot;

import javax.annotation.Generated;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Transforms the message using a XSLT template.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.xslt")
public class XsltComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * To use a custom implementation of
     * org.apache.camel.converter.jaxp.XmlConverter
     */
    private XmlConverterNestedConfiguration xmlConverter;
    /**
     * To use a custom UriResolver which depends on a dynamic endpoint resource
     * URI. Should not be used together with the option 'uriResolver'. The
     * option is a org.apache.camel.component.xslt.XsltUriResolverFactory type.
     */
    private String uriResolverFactory;
    /**
     * To use a custom UriResolver. Should not be used together with the option
     * 'uriResolverFactory'. The option is a javax.xml.transform.URIResolver
     * type.
     */
    private String uriResolver;
    /**
     * Cache for the resource content (the stylesheet file) when it is loaded.
     * If set to false Camel will reload the stylesheet file on each message
     * processing. This is good for development. A cached stylesheet can be
     * forced to reload at runtime via JMX using the clearCachedStylesheet
     * operation.
     */
    private Boolean contentCache = true;
    /**
     * Whether to use Saxon as the transformerFactoryClass. If enabled then the
     * class net.sf.saxon.TransformerFactoryImpl. You would need to add Saxon to
     * the classpath.
     */
    private Boolean saxon = false;
    /**
     * Allows you to use a custom net.sf.saxon.lib.ExtensionFunctionDefinition.
     * You would need to add camel-saxon to the classpath. The function is
     * looked up in the registry, where you can comma to separate multiple
     * values to lookup.
     */
    private String saxonExtensionFunctions;
    /**
     * To use a custom Saxon configuration. The option is a java.lang.Object
     * type.
     */
    private String saxonConfiguration;
    /**
     * To set custom Saxon configuration properties. The option is a
     * java.util.Map<java.lang.String,java.lang.Object> type.
     */
    private String saxonConfigurationProperties;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public XmlConverterNestedConfiguration getXmlConverter() {
        return xmlConverter;
    }

    public void setXmlConverter(XmlConverterNestedConfiguration xmlConverter) {
        this.xmlConverter = xmlConverter;
    }

    public String getUriResolverFactory() {
        return uriResolverFactory;
    }

    public void setUriResolverFactory(String uriResolverFactory) {
        this.uriResolverFactory = uriResolverFactory;
    }

    public String getUriResolver() {
        return uriResolver;
    }

    public void setUriResolver(String uriResolver) {
        this.uriResolver = uriResolver;
    }

    public Boolean getContentCache() {
        return contentCache;
    }

    public void setContentCache(Boolean contentCache) {
        this.contentCache = contentCache;
    }

    public Boolean getSaxon() {
        return saxon;
    }

    public void setSaxon(Boolean saxon) {
        this.saxon = saxon;
    }

    public String getSaxonExtensionFunctions() {
        return saxonExtensionFunctions;
    }

    public void setSaxonExtensionFunctions(String saxonExtensionFunctions) {
        this.saxonExtensionFunctions = saxonExtensionFunctions;
    }

    public String getSaxonConfiguration() {
        return saxonConfiguration;
    }

    public void setSaxonConfiguration(String saxonConfiguration) {
        this.saxonConfiguration = saxonConfiguration;
    }

    public String getSaxonConfigurationProperties() {
        return saxonConfigurationProperties;
    }

    public void setSaxonConfigurationProperties(
            String saxonConfigurationProperties) {
        this.saxonConfigurationProperties = saxonConfigurationProperties;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class XmlConverterNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.converter.jaxp.XmlConverter.class;
        private DocumentBuilderFactory documentBuilderFactory;
        private TransformerFactory transformerFactory;

        public DocumentBuilderFactory getDocumentBuilderFactory() {
            return documentBuilderFactory;
        }

        public void setDocumentBuilderFactory(
                DocumentBuilderFactory documentBuilderFactory) {
            this.documentBuilderFactory = documentBuilderFactory;
        }

        public TransformerFactory getTransformerFactory() {
            return transformerFactory;
        }

        public void setTransformerFactory(TransformerFactory transformerFactory) {
            this.transformerFactory = transformerFactory;
        }
    }
}