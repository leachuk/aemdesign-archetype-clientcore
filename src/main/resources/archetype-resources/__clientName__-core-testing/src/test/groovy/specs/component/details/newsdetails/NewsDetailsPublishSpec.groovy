#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package specs.component.details.newsdetails

import spock.lang.Stepwise
import spock.lang.Unroll
import support.ComponentSpec

import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Stepwise
class NewsDetailsPublishSpec extends ComponentSpec {

    String pathPage = "component/details/news-details"
    String pathSite = "content/${clientName}-core-showcase"
    String language = "en"
    String componentPath = "jcr:content/article/par/news-details"

    @Unroll("Functionality of News Details Component default in ${symbol_pound}viewport.label")
    def "Functionality of News Details Component default"() {

        given: '>the page hierarchy is created as "Components" > "Details" > "News Details"'
        and: '>I am in the component showcase page'
        and: '>the component is on the showcase page'
        def selector = "${symbol_pound}news_details_O6GDPCTVP"

        when: "I am on the component showcase page"
        setWindowSize(viewport)
        waitForAuthorPreviewPage()

        then: "The component should be on the page"
        def component = waitForComponent(selector)

        and: "The component should have the date in EEEE DD MMMM YYYY format"
        def dateString =  ${symbol_dollar}("${symbol_dollar}{selector} > div.container > header > div.published > time").text()
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy", Locale.ENGLISH)
        assert LocalDate.parse(dateString, format)

        and: "The component should display tags"
        assert ${symbol_dollar}("${symbol_dollar}{selector} > div.container > header > div.tags > span" , 0).text().contains("News Page") &&
                ${symbol_dollar}("${symbol_dollar}{selector} > div.container > header > div.tags > span" , 1).text().contains("Event")

        and: "The component should have a title"
        assert  ${symbol_dollar}("${symbol_dollar}{selector} > div.container > header > h1").text().contains("News Details Demo Title")

        and: "The component should have a thumbnail image"
        assert ${symbol_dollar}("${symbol_dollar}{selector} > div.container > div > img").attr("src").contains("city2.jpg")

        and: "The component should have a breadcrumb"
        // this is only to check if the breadcrumb exists. The bread crumb component has its own separate tests.
        assert ${symbol_dollar}("${symbol_dollar}{selector} > div.container > div > nav").attr("class").contains("breadcrumb")

        and: "The component has a text box"
        assert ${symbol_dollar}("${symbol_dollar}{selector} > div.container > div > div").attr("class").contains("description")

        where:
        viewport << getViewPorts()
    }

    def setupSpec() {
        loginAsAdmin()
    }

}
