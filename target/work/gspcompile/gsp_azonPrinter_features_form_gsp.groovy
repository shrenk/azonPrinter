import com.azonPrinter.Features
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_azonPrinter_features_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/features/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('hiddenField','g',3,['name':("modelOfPrinter.id"),'value':(featuresInstance?.modelOfPrinter?.id)],-1)
printHtmlPart(1)
expressionOut.print(hasErrors(bean: featuresInstance, field: 'title', 'error'))
printHtmlPart(2)
invokeTag('message','g',7,['code':("features.title.label"),'default':("Title")],-1)
printHtmlPart(3)
invokeTag('textField','g',10,['name':("title"),'required':(""),'value':(featuresInstance?.title)],-1)
printHtmlPart(4)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1408801479874L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
