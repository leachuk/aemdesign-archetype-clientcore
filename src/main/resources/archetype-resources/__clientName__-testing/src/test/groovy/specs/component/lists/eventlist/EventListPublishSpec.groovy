#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package specs.component.lists.eventlist


import spock.lang.Stepwise
import spock.lang.Unroll
import support.ComponentSpec

@Stepwise
class EventListPublishSpec extends ComponentSpec {

    String pathPage = "component/lists/event-list"
    String pathSite = "content/swinburne-showcase"
    String language = "en"
    String componentPath = "jcr:content/article/par/contentblock1/par/eventlist"

    def setupSpec() {
        loginAsAdmin()
    }

    @Unroll("Event List: Default variant using Badge: Default in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Default"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist1"
        def selectorContainer = "${symbol_pound}contentblock1 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }

    @Unroll("Event List: Default variant using Badge: Icon in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Icon"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist2"
        def selectorContainer = "${symbol_pound}contentblock2 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }

    @Unroll("Event List: Default variant using Badge: Card with Icon in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Icon"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist3"
        def selectorContainer = "${symbol_pound}contentblock3 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }


    @Unroll("Event List: Default variant using Badge: Card with Icon, Title and Action in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Icon, Title and Action"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist4"
        def selectorContainer = "${symbol_pound}contentblock4 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }


    @Unroll("Event List: Default variant using Badge: Card with Icon, Title, Category, Description and Action in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Icon, Title, Category, Description and Action"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist5"
        def selectorContainer = "${symbol_pound}contentblock5 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }



    @Unroll("Event List: Default variant using Badge: Card with Icon, Title and Date in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Icon, Title and Date"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist6"
        def selectorContainer = "${symbol_pound}contentblock6 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }



    @Unroll("Event List: Default variant using Badge: Card with Icon, Title, Description and Action in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Icon, Title, Description and Action"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist7"
        def selectorContainer = "${symbol_pound}contentblock7 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }


    @Unroll("Event List: Default variant using Badge: Card with Icon, Title, Subtitle and Date in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Icon, Title, Subtitle and Date"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist8"
        def selectorContainer = "${symbol_pound}contentblock8 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }


    @Unroll("Event List: Default variant using Badge: Card with Icon, Title, Subtitle, Date, Description and Action in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Icon, Title, Subtitle, Date, Description and Action"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist9"
        def selectorContainer = "${symbol_pound}contentblock9 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }


    @Unroll("Event List: Default variant using Badge: Card with Icon, Title, Subtitle, Description and Action in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Icon, Title, Subtitle, Description and Action"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist10"
        def selectorContainer = "${symbol_pound}contentblock10 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }

    @Unroll("Event List: Default variant using Badge: Card with Image, Title and Action in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Image, Title and Action"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist11"
        def selectorContainer = "${symbol_pound}contentblock11 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }

    @Unroll("Event List: Default variant using Badge: Card with Image, Title, Category, Description and Action in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Image, Title, Category, Description and Action"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist12"
        def selectorContainer = "${symbol_pound}contentblock12 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }



    @Unroll("Event List: Default variant using Badge: Card with Image, Title, Description and Action in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Image, Title, Description and Action"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist13"
        def selectorContainer = "${symbol_pound}contentblock13 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }

    @Unroll("Event List: Default variant using Badge: Card with Image, Title, Subtitle, Description and Action in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Image, Title, Subtitle, Description and Action"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist14"
        def selectorContainer = "${symbol_pound}contentblock14 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }


    @Unroll("Event List: Default variant using Badge: Card with Title, Description and Action in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Title, Description and Action"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist15"
        def selectorContainer = "${symbol_pound}contentblock15 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }

    @Unroll("Event List: Default variant using Badge: Clickable Card with Icon, Title, Category and Description in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Clickable Card with Icon, Title, Category and Description"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist16"
        def selectorContainer = "${symbol_pound}contentblock16 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }

    @Unroll("Event List: Default variant using Badge: Clickable Card with Image and Title in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Clickable Card with Image and Title"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist17"
        def selectorContainer = "${symbol_pound}contentblock17 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }

    @Unroll("Event List: Default variant using Badge: Clickable Card with Image, Title, Category and Description in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Clickable Card with Image, Title, Category and Description"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist18"
        def selectorContainer = "${symbol_pound}contentblock18 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }

    @Unroll("Event List: Default variant using Badge: Horizontal Card with Icon, Title, Category and Description in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Horizontal Card with Icon, Title, Category and Description"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist19"
        def selectorContainer = "${symbol_pound}contentblock19 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }


    @Unroll("Event List: Default variant using Badge: Card with Icon, Title, Subtitle, Date, Description and Action with Styles in ${symbol_pound}viewport.label")
    def "Event List: Default variant using Badge: Card with Icon, Title, Subtitle, Date, Description and Action with Styles"() {

        given: '>the page hierarchy is created as "Components" > "Lists" > "Event List"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}eventlist20"
        def selectorContainer = "${symbol_pound}contentblock20 .contents"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
        takeScreenshot(${symbol_dollar}(selectorContainer).firstElement(), "The component should be on the page")

        and: "Has five list items"
        assert ${symbol_dollar}("${symbol_dollar}{selector} li").size() == 5

        where:
        viewport << getViewPorts()
    }





}
