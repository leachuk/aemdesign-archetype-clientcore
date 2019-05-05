
#AEMDesign Archetype Client Core Project
Maven archetype generator for client `core` projects which use the AEMDesign framework

##To Install
To install the archetype into your local .m2 directory so it can be used.
```bash
mvn clean install
```

You can quickly check the generated project structure after running `mvn clean install` by browsing to `/target/test-classes/projects/basic/project/basic`

##To Run
Run the archetype to generate a new core project.

Custom properties
 * clientName = Provides the string used throughout the project to set folder and path names specific to the clients project
 
```bash
mvn archetype:generate \
  -DarchetypeGroupId=aemdesign.archetype \
  -DarchetypeArtifactId=client.core \
  -DarchetypeVersion=0.1-SNAPSHOT \
  -DgroupId=foobar.core \
  -DartifactId=platform-foo \
  -DclientName=foobar
```