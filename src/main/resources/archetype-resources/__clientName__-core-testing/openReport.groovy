#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
try {
    String reportDir = System.properties.getProperty("project.buildDirectory","target")
    File file = new File("./${symbol_dollar}reportDir/generated-docs/summary.html")

    System.println("Opening report: "+file.getPath())

    if(!file.isFile()) {
        //System.err.println("Could not find report file: "+file)
        //return true
    } else {
        def url = "file://${symbol_dollar}{new File("./${symbol_dollar}reportDir/generated-docs/summary.html").canonicalPath}"
        System.println("Opening report : "+url)
        if (!System.properties.containsKey("skipOpenReport")) {
            java.awt.Desktop.desktop.browse url.toURI()
        }
    }




} catch(Throwable t) {
    t.printStackTrace()
    return false
}

return true;
