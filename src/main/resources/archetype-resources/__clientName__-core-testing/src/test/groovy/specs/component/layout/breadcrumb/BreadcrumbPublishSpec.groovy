#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package specs.component.layout.breadcrumb

import spock.lang.Stepwise
import spock.lang.Unroll
import support.ComponentSpec

@Stepwise
class BreadcrumbPublishSpec extends ComponentSpec {

    String pathPage = "component/layout/breadcrumb"
    String pathSite = "content/${clientName}-core-showcase"
    String language = "en"
    String componentPath = "jcr:content/article/par/contentblock1/par/breadcrumb"

    def setupSpec() {
        loginAsAdmin()
    }

    @Unroll("Functionality of Component in ${symbol_pound}viewport.label")
    def "Functionality of Component"() {

        given: '>the page hierarchy is created as "Components" > "Layout" > "Breadcrumb"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}breadcrumb1"
        def selectorContainer = "${symbol_pound}contentblock1"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selector).firstElement(), "The component should be on the page")

        and: 'There should be a HREF value associated with Components link'
        ${symbol_dollar}(selector + " a[href='/content/${clientName}-core-showcase/en/component.html']", text: "Components")

        and: 'There should be a HREF value associated with Layout link'
        ${symbol_dollar}(selector + " a[href='/content/${clientName}-core-showcase/en/component/layout.html']", text: "Layout")

        and: 'There should be a HREF value associated with Breadcrumb link'
        ${symbol_dollar}(selector + " li.active a[href='/content/${clientName}-core-showcase/en/component/layout/breadcrumb.html']", text: "Breadcrumb")

        where:
        viewport << getViewPorts()
    }

    @Unroll("Functionality of Component with Changed Start Level in ${symbol_pound}viewport.label")
    def "Functionality of Component with Changed Start Level"() {

        given: '>the page hierarchy is created as "${clientName}-coreShowcase" > "Components" > "Layout"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}breadcrumb2"
        def selectorContainer = "${symbol_pound}contentblock2"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selector).firstElement(), "The component should be on the page")

        and: 'First link should be Layout'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(1)").text().trim() == "Layout"

        and: 'Last link should be Breadcrumb'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(2)").text().trim() == "Breadcrumb"

        where:
        viewport << getViewPorts()
    }

    @Unroll("Functionality of Component with Changed Start Level and End Level in ${symbol_pound}viewport.label")
    def "Functionality of Component with Changed Start Level and End Level"() {

        given: '>the page hierarchy is created as "Components" > "Layout" > "Breadcrumb"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}breadcrumb3"
        def selectorContainer = "${symbol_pound}contentblock3"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selector).firstElement(), "The component should be on the page")

        and: 'First link should be Components'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(1)").text().trim() == "Components"

        and: 'Last link should be Layout'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(2)").text().trim() == "Layout"

        where:
        viewport << getViewPorts()
    }


    @Unroll("Functionality of Breadcrumb with light style in ${symbol_pound}viewport.label")
    def "Functionality of Breadcrumb with light style"() {

        given: '>the page hierarchy is created as "${clientName}-core Showcase" > "Components" > "Layout"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}breadcrumb4"
        def selectorContainer = "${symbol_pound}contentblock4"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selector).firstElement(), "The component should be on the page")

        and: 'First link should be English'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(1)").text().trim() == "${clientName}-core Showcase"

        and: 'Last link should be Layout'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(2)").text().trim() == "Components"

        where:
        viewport << getViewPorts()
    }

    @Unroll("Functionality of Breadcrumb with dark style in ${symbol_pound}viewport.label")
    def "Functionality of Breadcrumb with dark style"() {

        given: '>the page hierarchy is created as "${clientName}-core Showcase" > "Components" > "Layout"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}breadcrumb5"
        def selectorContainer = "${symbol_pound}contentblock5"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selector).firstElement(), "The component should be on the page")

        and: 'First link should be English'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(1)").text().trim() == "${clientName}-core Showcase"

        and: 'Last link should be Layout'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(2)").text().trim() == "Components"

        where:
        viewport << getViewPorts()
    }

}
