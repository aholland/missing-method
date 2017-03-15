# missing-method
Minimal case demonstrating linking problem for case class under certain conditions with Scala.js 2.12.1

EXAMPLE UNDER 2.12.1 (change build.sbt scalaVersion to 2.11.8 and it succeeds)
```
C:\Workspace\IdeaProjects\Bugs\MissingMethod>sbt clean compile
[info] Loading project definition from C:\Workspace\IdeaProjects\Bugs\MissingMethod\project
[info] Updating {file:/C:/Workspace/IdeaProjects/Bugs/MissingMethod/project/}missingmethod-build...
[info] Resolving org.fusesource.jansi#jansi;1.4 ...
[info] Done updating.
[info] Set current project to missingmethod (in build file:/C:/Workspace/IdeaProjects/Bugs/MissingMethod/)
[success] Total time: 0 s, completed 15-Mar-2017 03:39:50
[info] Updating {file:/C:/Workspace/IdeaProjects/Bugs/MissingMethod/}missingmethod...
[info] Resolving org.eclipse.jetty#jetty-continuation;8.1.16.v20140903 ...
[info] Done updating.
[INFO] [03/15/2017 03:39:51.068] [Workbench-System-akka.actor.default-dispatcher-3] [akka://Workbench-System/user/IO-HTTP/listener-0] Bound to localhost/127.0.0.1:12345
[info] Compiling 1 Scala source to C:\Workspace\IdeaProjects\Bugs\MissingMethod\target\scala-2.12\classes...
[success] Total time: 5 s, completed 15-Mar-2017 03:39:55

C:\Workspace\IdeaProjects\Bugs\MissingMethod>sbt ~fastOptJS
[info] Loading project definition from C:\Workspace\IdeaProjects\Bugs\MissingMethod\project
[info] Set current project to missingmethod (in build file:/C:/Workspace/IdeaProjects/Bugs/MissingMethod/)
[INFO] [03/15/2017 03:40:03.184] [Workbench-System-akka.actor.default-dispatcher-5] [akka://Workbench-System/user/IO-HTTP/listener-0] Bound to localhost/127.0.0.1:12345
[info] Fast optimizing C:\Workspace\IdeaProjects\Bugs\MissingMethod\target\scala-2.12\missingmethod-fastopt.js
[error] Referring to non-existent method missingmethod.Main$Case$4$.apply(java.lang.Object)java.lang.Object
[error]   called from scala.collection.immutable.Range.foreach(scala.Function1)scala.Unit
[error]   called from java.lang.Long$.StringRadixInfos$lzycompute()scala.scalajs.js.Array
[error]   called from java.lang.Long$.StringRadixInfos()scala.scalajs.js.Array
```
