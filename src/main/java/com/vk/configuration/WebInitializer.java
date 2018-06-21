package com.vk.configuration;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by User on 2017-05-22.
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    private final static String OPTIONS_REQUEST = "true";

    private final static boolean ASYNC_SUPPORTED = true;

    private final static String SERVLET_MAPPINGS = "/";

    private static final String ENCODING = "UTF-8";

    private static final boolean FORCE_ENCODING = true;

    private static final boolean MAPPING_FOR_URL_IS_MATH_AFTER = true;

    private static final String MAPPING_FOR_URL_PATTERNS = "/*";

    private static final boolean THROW_EXCEPTION_IF_NO_HANDLER_FOUND = true;


    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setInitParameter("dispatchOptionsRequest", OPTIONS_REQUEST);
        registration.setAsyncSupported(ASYNC_SUPPORTED);
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class,
                WebSoketConfig.class,
                RootConfig.class,
                ModbusSerialFirstConfig.class,
                ModbusSerialSecondConfig.class,
                ModbusSerialThirdConfig.class,
                DatabaseFirstConfig.class
        };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
//                WebConfig.class,
//                WebSoketConfig.class,
//                RootConfig.class,
//                ModbusSerialFirstConfig.class,
//                ModbusSerialSecondConfig.class,
//                ModbusSerialThirdConfig.class,
//                DatabaseFirstConfig.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{SERVLET_MAPPINGS};
    }

    @Override
    public void onStartup(final ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        final FilterRegistration.Dynamic filter = servletContext
                .addFilter("encodingFilter", new CharacterEncodingFilter());
        filter.setInitParameter("encoding", ENCODING);
        filter.setInitParameter("forceEncoding", Boolean.toString(FORCE_ENCODING));
        filter.addMappingForUrlPatterns(
                null,
                MAPPING_FOR_URL_IS_MATH_AFTER,
                MAPPING_FOR_URL_PATTERNS
        );
    }

    @Override
    protected DispatcherServlet createDispatcherServlet(
            final WebApplicationContext webApplicationContext
    ) {
        final DispatcherServlet dispatcherServlet =
                (DispatcherServlet) super.createDispatcherServlet(webApplicationContext);
        dispatcherServlet.setThrowExceptionIfNoHandlerFound(THROW_EXCEPTION_IF_NO_HANDLER_FOUND);
        return dispatcherServlet;
    }
}