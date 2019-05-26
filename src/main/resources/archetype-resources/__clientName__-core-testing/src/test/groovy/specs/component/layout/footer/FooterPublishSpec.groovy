#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package specs.component.layout.footer

import spock.lang.Stepwise
import spock.lang.Unroll
import support.ComponentSpec

@Stepwise
class FooterPublishSpec extends ComponentSpec {

    String pathPage = "component/layout/footer"
    String pathSite = "content/${clientName}-core-showcase"
    String language = "en"
    String componentPath = "jcr:content/article/par"

    def setupSpec() {
        loginAsAdmin()
    }

    @Unroll("Functionality of ${clientName}-core Global in ${symbol_pound}viewport.label")
    def "Functionality of ${clientName}-core Global"() {

        given: '>the page hierarchy is created as "Components" > "Layout" > "Footer"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}${clientName}-core_global_footer_inherit"
        def selectorContainer = "${symbol_pound}${clientName}-core_global_footer"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        waitForComponent(selector)

        and: "Should have rich text"
        assert ${symbol_dollar}(selector + " ${symbol_pound}text_AYS4ZU6BL").eq(0).text().trim() == "Connect with ${clientName}-core University"

        and: "Should have ${clientName}-core brand logo"
        assert ${symbol_dollar}(selector + " ${symbol_pound}embedsource_AP3MMJNLO > img").attr("src").contains("${clientName}-core-logo.svg")
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "Should have ${clientName}-core Global")

        where:
        viewport << getViewPorts()
    }
}
