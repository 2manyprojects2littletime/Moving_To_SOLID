import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "Moving_To_SOLID"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    
    
	/*
	 *  The following two lines are added to fix a regression in testing in play 2.1.x
	 */
	"play" %% "play-test" % play.core.PlayVersion.current % "test" exclude("com.novocode", "junit-interface"),
	"com.novocode" % "junit-interface" % "0.9" % "test",
	"org.seleniumhq.selenium" % "selenium-java" % "2.35.0" % "test"
	/*
	 * The above two lines shouldn't be required one play is upgraded to v 2.2
	 */
    
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here      
  )

}
