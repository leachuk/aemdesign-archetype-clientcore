#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package specs.component.content.table

import spock.lang.Stepwise
import spock.lang.Unroll
import support.ComponentSpec

@Stepwise
class TableScreenshotSpec extends ComponentSpec {

    String pathPage = "component/content/table"
    String pathSite = "content/swinburne-showcase"
    String language = "en"
    String componentPath = "jcr:content/article/par/contentblock1/par/table"

    def setupSpec() {
        loginAsAdmin()
    }

    @Unroll("Appearance of Component Variant: Default in ${symbol_pound}viewport.label")
    def "Appearance of Component Variant: Default"() {

        given: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}table1"

        when: 'I am in the component showcase page'
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: 'The component should appear on the page'
        def component = waitForComponent(selector)

        then: 'It should match the small viewport reference image.'
        designRef(selector)

        where:
        viewport << getViewPorts()

    }


}
