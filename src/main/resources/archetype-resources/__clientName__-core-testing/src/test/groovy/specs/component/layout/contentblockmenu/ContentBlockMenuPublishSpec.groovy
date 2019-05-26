#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package specs.component.layout.contentblockmenu

import spock.lang.Stepwise
import spock.lang.Unroll
import support.ComponentSpec

@Stepwise
class ContentBlockMenuPublishSpec extends ComponentSpec {

    String pathPage = "component/layout/contentblockmenu"
    String pathSite = "content/${clientName}-core-showcase"
    String language = "en"
    String componentPath = "jcr:content/article/par/contentblockmenu1"

    def setupSpec() {
        loginAsAdmin()
    }

    @Unroll("Functionality of Component Menu Source: Page in ${symbol_pound}viewport.label")
    def "Functionality of Component Menu Source: Page"() {

        given: '>the page hierarchy is created as "Components" > "Layout" > "ContentBlockMenu"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}contentblockmenu1"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()
        report("I am on the component showcase page")

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        and: 'Should have first link with Section Locked'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(1)").text() == "Section Locked"

        and: 'Should have second link with Container Unlocked'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(2)").text() == "Container Unlocked"

        where:
        viewport << getViewPorts()
    }


    @Unroll("Functionality of Component Menu Source: Page in ${symbol_pound}viewport.label")
    def "Functionality of Component Menu Source: Page Path"() {

        given: '>the page hierarchy is created as "Components" > "Layout" > "ContentBlockMenu"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}contentblockmenu2"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()
        report("I am on the component showcase page")

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        and: 'Should have first link with Section Locked'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(1)").text() == "Section Locked Nested"

        and: 'Should have second link with Container Unlocked'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(2)").text() == "Container Unlocked Nested"

        where:
        viewport << getViewPorts()
    }


    @Unroll("Functionality of Content Block Menu in Content Block in ${symbol_pound}viewport.label")
    def "Functionality of Content Block Menu in Content Block"() {

        given: '>the page hierarchy is created as "Components" > "Layout" > "ContentBlockMenu"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}contentblockmenu13"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()
        report("I am on the component showcase page")

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        and: 'Should have sample text from the first content block title'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(1)").text() == "Content Block Test 1"

        and: 'Should have sample text from the second content block title'
        assert ${symbol_dollar}("${symbol_dollar}selector li:nth-child(2)").text() == "Content Block Test 2"

        where:
        viewport << getViewPorts()
    }


}
