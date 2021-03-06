#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package specs.component.widgets.onlinemedia

import spock.lang.Stepwise
import spock.lang.Unroll
import support.ComponentSpec

@Stepwise
class OnlineMediaScreenshotSpec extends ComponentSpec {

    String pathPage = "component/widgets/online-media"
    String pathSite = "content/${clientName}-core-showcase"
    String language = "en"
    String componentPath = "jcr:content/article/par/contentblock/par/onlinemedia"

    def setupSpec() {
        loginAsAdmin()
    }

    @Unroll("Online Media: Appearance of Component Variant: Default in ${symbol_pound}viewport.label")
    def "Appearance of Component Variant: Default"() {

        given: '>the page hierarchy is created as "Components" > "Widgets" > "OnlineMedia"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}onlinemedia1"
        def selectorContainer = "${symbol_pound}contentblock1 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        then: 'It should match the small viewport reference image.'
        designRef(selectorContainer)

        where: "Browser size width: ${symbol_pound}viewport.width and height: ${symbol_pound}viewport.height"
        viewport << getViewPorts()
    }

    @Unroll("Online Media: Appearance of Component Variant: Default with YouTube in ${symbol_pound}viewport.label")
    def "Appearance of Component Variant: Default with YouTube"() {

        given: '>the page hierarchy is created as "Components" > "Widgets" > "OnlineMedia"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}onlinemedia2"
        def selectorContainer = "${symbol_pound}contentblock2 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        then: 'It should match the small viewport reference image.'
        designRef(selectorContainer)

        where: "Browser size width: ${symbol_pound}viewport.width and height: ${symbol_pound}viewport.height"
        viewport << getViewPorts()
    }

    @Unroll("Online Media: Appearance of Component Variant: Default with Kaltura in ${symbol_pound}viewport.label")
    def "Appearance of Component Variant: Default with Kaltura"() {

        given: '>the page hierarchy is created as "Components" > "Widgets" > "OnlineMedia"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}onlinemedia3"
        def selectorContainer = "${symbol_pound}contentblock3 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        then: 'It should match the small viewport reference image.'
        designRef(selectorContainer)

        where: "Browser size width: ${symbol_pound}viewport.width and height: ${symbol_pound}viewport.height"
        viewport << getViewPorts()
    }

    @Unroll("Online Media: Appearance of Component Variant: IFrame with Youtube Video in ${symbol_pound}viewport.label")
    def "Appearance of Component Variant: IFrame with Youtube Video"() {

        given: '>the page hierarchy is created as "Components" > "Widgets" > "OnlineMedia"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}onlinemedia4"
        def selectorContainer = "${symbol_pound}contentblock4 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        then: 'It should match the small viewport reference image.'
        designRef(selectorContainer)

        where: "Browser size width: ${symbol_pound}viewport.width and height: ${symbol_pound}viewport.height"
        viewport << getViewPorts()
    }

    @Unroll("Online Media: Appearance of Component Variant: IFrame with Vimeo Video in ${symbol_pound}viewport.label")
    def "Appearance of Component Variant: IFrame with Vimeo Video"() {

        given: '>the page hierarchy is created as "Components" > "Widgets" > "OnlineMedia"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}onlinemedia5"
        def selectorContainer = "${symbol_pound}contentblock5 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        then: 'It should match the small viewport reference image.'
        designRef(selectorContainer)

        where: "Browser size width: ${symbol_pound}viewport.width and height: ${symbol_pound}viewport.height"
        viewport << getViewPorts()
    }


}
