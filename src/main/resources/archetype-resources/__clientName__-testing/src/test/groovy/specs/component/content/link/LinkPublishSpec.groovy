#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package specs.component.content.link

import spock.lang.Stepwise
import spock.lang.Unroll
import support.ComponentSpec

@Stepwise
class LinkPublishSpec extends ComponentSpec {

    String pathPage = "component/content/link"
    String pathSite = "content/swinburne-showcase"
    String language = "en"
    String componentPath = "jcr:content/article/par/contentblock1/par/link"

    def setupSpec() {
        loginAsAdmin()
    }

    @Unroll("Functionality of Component Variant: Default in ${symbol_pound}viewport.label")
    def "Functionality of Component Variant: Default"() {

        given: 'Page hierarchy is created as "Components" > "Content" > "Link"'
        def selector = "${symbol_pound}link1"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
		waitFor(15,0.1,{
			${symbol_dollar}(selector).isDisplayed()
		})

        and: "Should have sample component link"
        assert ${symbol_dollar}(selector).text().trim() == "Link: Default"
        report("Should have sample component link")

        where:
        viewport << getViewPorts()
    }

    @Unroll("Functionality of Component Variant: Button in ${symbol_pound}viewport.label")
    def "Functionality of Component Variant: Button"() {

        given: 'Page hierarchy is created as "Components" > "Content" > "Link"'
        def selector = "${symbol_pound}link2"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
		waitFor(15,0.1,{
			${symbol_dollar}(selector).isDisplayed()
		})

        and: "Should have sample component link"
        assert ${symbol_dollar}(selector).text().trim() == "Button"
        report("Should have sample component link")

        where:
        viewport << getViewPorts()
    }

    @Unroll("Functionality of Component Variant: Default no Label in ${symbol_pound}viewport.label")
    def "Functionality of Component Variant: Default no Label"() {

        given: 'The page hierarchy is created as "Components" > "Content" > "Link"'
        def selector = "${symbol_pound}link3"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
		waitFor(15,0.1,{
			${symbol_dollar}(selector).isDisplayed()
		})

        and: "Should have sample component link"
        assert ${symbol_dollar}(selector).text().trim() == "Link"
        report("Should have sample component link")

        where:
        viewport << getViewPorts()
    }


    @Unroll("Functionality of Component Variant: Default with Analytics in ${symbol_pound}viewport.label")
    def "Functionality of Component Variant: Default with Analytics"() {

        given: 'The page hierarchy is created as "Components" > "Content" > "Link"'
        def selector = "${symbol_pound}link6"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
		waitFor(15,0.1,{
			${symbol_dollar}(selector).isDisplayed()
		})

        and: "Should have sample component text"
        assert ${symbol_dollar}(selector).text().trim() == "Link"
        report("Should have sample component text")

        and: "Should have analytics attribute: data-analytics-event"
        assert ${symbol_dollar}(selector).attr("data-analytics-event") == "site interaction"

        and: "Should have analytics attribute: data-layer-type"
        assert ${symbol_dollar}(selector).attr("data-layer-track") == "true"

        and: "Should have analytics attribute: data-layer-location"
        assert ${symbol_dollar}(selector).attr("data-layer-location") == "link6-location"

        and: "Should have analytics attribute: data-layer-label"
        assert ${symbol_dollar}(selector).attr("data-layer-label") == "link-label"


        where:
        viewport << getViewPorts()
    }


    @Unroll("Functionality of Component Variant: Button with Analytics in ${symbol_pound}viewport.label")
    def "Functionality of Component Variant: Button with Analytics"() {

        given: 'The page hierarchy is created as "Components" > "Content" > "Link"'
        def selector = "${symbol_pound}link7"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
		waitFor(15,0.1,{
			${symbol_dollar}(selector).isDisplayed()
		})

        and: "Should have sample component text"
        assert ${symbol_dollar}(selector).text().trim() == "Link"
        report("Should have sample component text")

        and: "Should have analytics attribute: data-analytics-event"
        assert ${symbol_dollar}(selector).attr("data-analytics-event") == "site interaction"

        and: "Should have analytics attribute: data-layer-type"
        assert ${symbol_dollar}(selector).attr("data-layer-track") == "true"

        and: "Should have analytics attribute: data-layer-location"
        assert ${symbol_dollar}(selector).attr("data-layer-location") == "link7-location"

        and: "Should have analytics attribute: data-layer-label"
        assert ${symbol_dollar}(selector).attr("data-layer-label") == "link-label"


        where:
        viewport << getViewPorts()
    }


    @Unroll("Functionality of Component Variant: Button with icon on left in ${symbol_pound}viewport.label")
    def "Functionality of Component Variant: Button with icon on left"() {

        given: 'The page hierarchy is created as "Components" > "Content" > "Link"'
        def selector = "${symbol_pound}link8"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
		waitFor(15,0.1,{
			${symbol_dollar}(selector).isDisplayed()
		})

        and: "Should have sample component text"
        assert ${symbol_dollar}(selector).text().trim() == "Link"
        report("Should have sample component text")

        and: "Should have class: link button"
        assert ${symbol_dollar}(selector).attr("class") == "link button"

        and: "Should have icon: fa fa-cog"
        assert ${symbol_dollar}(selector + " .icon").attr("class").endsWith("fa fa-cog")

        and: "The icon should be the first element"
        assert ${symbol_dollar}(selector + " :first-child").attr("class").startsWith("icon")

        where:
        viewport << getViewPorts()
    }


    @Unroll("Functionality of Component Variant: Button with icon on right in ${symbol_pound}viewport.label")
    def "Functionality of Component Variant: Button with icon on right"() {

        given: 'The page hierarchy is created as "Components" > "Content" > "Link"'
        def selector = "${symbol_pound}link9"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
		waitFor(15,0.1,{
			${symbol_dollar}(selector).isDisplayed()
		})

        and: "Should have sample component text"
        assert ${symbol_dollar}(selector).text().trim() == "Link"
        report("Should have sample component text")

        and: "Should have class: link button"
        assert ${symbol_dollar}(selector).attr("class") == "link button"

        and: "Should have icon: fa fa-cog"
        assert ${symbol_dollar}(selector + " .icon").attr("class").endsWith("fa fa-cog")

        and: "The icon should be the last element"
        assert ${symbol_dollar}(selector + " :last-child").attr("class").startsWith("icon")

        where:
        viewport << getViewPorts()
    }

    @Unroll("Functionality of Component Variant: Default without Analytics tracking false in ${symbol_pound}viewport.label")
    def "Functionality of Component Variant: Default without Analytics tracking false"() {

        given: 'The page hierarchy is created as "Components" > "Content" > "Link"'
        def selector = "${symbol_pound}link10"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)
		waitFor(15,0.1,{
			${symbol_dollar}(selector).isDisplayed()
		})

        and: "Should have sample component text"
        assert ${symbol_dollar}(selector).text().trim() == "Link"
        report("Should have sample component text")

        and: "Should have analytics attribute: data-layer-track as false"
        assert ${symbol_dollar}(selector).attr("data-layer-track") == "false"

        where:
        viewport << getViewPorts()
    }


}
