# graphQL-uing-Sangria
## Basic Requirements
1. Install [scala plugin](https://plugins.jetbrains.com/plugin/1347-scala) for IntelliJ
2. Install [sbt](https://www.scala-sbt.org/1.x/docs/Installing-sbt-on-Windows.html). 
3. Edit your environment variables, **PATH**, to include **bin** folder inside sbt folder (eg-C:\Users\Purva Singh\sbt\bin). 
4. Refresh your sbt project.

## Using Sangria in your scala project
### Include the following library dependency in your *build.sbt* file




	libraryDependencies += "org.sangria-graphql" %% "sangria" % "1.4.2"

