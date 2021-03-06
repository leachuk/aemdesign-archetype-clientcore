#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package specs.component.content.pagetags

import spock.lang.Stepwise
import spock.lang.Unroll
import support.ComponentSpec

@Stepwise
class PageTagsPublishSpec extends ComponentSpec {

    String pathPage = "component/content/pagetags"
    String pathSite = "content/${clientName}-core-showcase"
    String language = "en"
    String componentPath = "jcr:content/article/par/contentblock1/par/pagetags"


    def setupSpec() {
        loginAsAdmin()
    }

    @Unroll("Functionality of Component Variant: Default in ${symbol_pound}viewport.label")
    def "Functionality of Component Variant: Default"() {

        given: '>the page hierarchy is created as "Components" > "Content" > "Text"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}pagetags1"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        and: "Should have sample tags"
        assert ${symbol_dollar}(selector).${symbol_dollar}("li")*.text() == ["Contact Page","Location Page","News Page"]

        where:
        viewport << getViewPorts()
    }

}
