#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package specs.component.content.text

import support.page.ui.touch.TouchUIEditor
import spock.lang.Stepwise
import support.ComponentSpec

@Stepwise
class TextAuthorSpec extends ComponentSpec {

    String pathPage = "component/content/text"
    String pathSite = "content/${clientName}-core-showcase"
    String language = "en"
    String componentPath = "jcr:content/article/par/contentblock1/par/text"

    def setupSpec() {
        loginAsAdmin()
    }

    def cleanupSpec() {
        analyzeLog()
    }

    def "Authoring of Component"() {

        given: "Component has already been added to component showcase page"
        def selector = "${symbol_pound}text1"

        when: "I am on the Component showcase page"
        TouchUIEditor page = waitForTouchUIPage(language)

        then: "The component should be on the showcase page"
        waitFor { withFrame(TouchUIEditor.PAGE_FRAME_CONTENT) { ${symbol_dollar}(selector) } }

        and: "All dialogs are closed"
        page.Editor.isDialogOpen(compileComponentPath()) == false
        report("All dialogs are closed")

        and: "I open the dialog box"
        page.Editor.showDialog(compileComponentPath())

        then: "I should be able to see component author dialog"
        page.Editor.isDialogOpen(compileComponentPath()) == true
        report("I should be able to see component author dialog")

        when: "I close the dialog box"
        page.Editor.closeDialog(compileComponentPath())

        then: "I should be able to save and close component author dialog"
        page.Editor.isDialogOpen(compileComponentPath()) == false
        report("I should be able to save and close component author dialog")
    }

}