#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package specs.component.layout.footer

import spock.lang.Stepwise
import spock.lang.Unroll
import support.ComponentSpec

@Stepwise
class FooterInheritPublishSpec extends ComponentSpec {
    String pathPage = "component/layout/footer/footerinherit"
    String pathSite = "content/swinburne-showcase"
    String language = "en"
    String componentPath = "jcr:content/article/par/contentblock1/par/footer"

    def setupSpec() {
        loginAsAdmin()
    }

    @Unroll("Functionality of Component in ${symbol_pound}viewport.label")
    def "Functionality of Component"() {

        given: '>the page hierarchy is created as "Components" > "Layout" > "Footer" > "Footer Inherit"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}footer1"
        def selectorContainer = "${symbol_pound}contentblock1"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        and: 'Should have sample rich text'
        assert ${symbol_dollar}(selector + " .text[component]").text().trim() == "Footer Content"
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "Should have sample rich text")

        where:
        viewport << getViewPorts()
    }

    @Unroll("Functionality of Component with Background in ${symbol_pound}viewport.label")
    def "Functionality of Component with Background"() {

        given: '>the page hierarchy is created as "Components" > "Layout" > "Footer" > "Footer Inherit"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}footer2"
        def selectorContainer = "${symbol_pound}contentblock2"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        and: 'Should have sample rich text'
        assert ${symbol_dollar}(selector + " .text[component]").text().trim() == "Footer Content with Background"

        and: 'Section should have a background image'
        assert ${symbol_dollar}(selector).css("background-image").contains("/component/layout/footer/_jcr_content")
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "Should have sample rich text")

        where:
        viewport << getViewPorts()
    }

    @Unroll("Functionality of Component with Style in ${symbol_pound}viewport.label")
    def "Functionality of Component with Style"() {

        given: '>the page hierarchy is created as "Components" > "Layout" > "Footer"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}footer3"
        def selectorContainer = "${symbol_pound}contentblock3"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "Should have sample rich text")

//        and: 'Should have class modifier assigned'
//        assert ${symbol_dollar}(selector).attr("class").contains("bg-c8")

        where:
        viewport << getViewPorts()
    }

    @Unroll("Functionality of Swinburne Global in ${symbol_pound}viewport.label")
    def "Functionality of Swinburne Global"() {

        given: '>the page hierarchy is created as "Components" > "Layout" > "Footer"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}footer_swinburne_global"
        def selectorContainer = "${symbol_pound}contentblock4"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        and: "Should have rich text"
        assert ${symbol_dollar}(selector + " ${symbol_pound}text_AYS4ZU6BL").eq(0).text().trim() == "Connect with Swinburne University"

        and: "Should have Swinburne brand logo"
        assert ${symbol_dollar}(selector + " ${symbol_pound}embedsource_AP3MMJNLO > img").attr("src").contains("/etc/clientlibs/swinburne/sut/images/swinburne-logo.svg")
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "Should have Swinburne Global")

        where:
        viewport << getViewPorts()
    }
}
