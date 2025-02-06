package build_
import _root_.{build_ => $file}
import build_.{package_ => build}
import _root_.mill.runner.MillBuildRootModule
@_root_.scala.annotation.nowarn
object MillMiscInfo extends mill.main.RootModule.Info(
  Vector("C:\\Users\\nogga\\IdeaProjects\\LSP\\out\\mill-launcher\\0.12.5.jar"),
  "C:\\Users\\nogga\\IdeaProjects\\LSP",
  "C:\\Users\\nogga\\IdeaProjects\\LSP\\out",
  "C:\\Users\\nogga\\IdeaProjects\\LSP"
)
import MillMiscInfo._

object package_ extends package_{
  
  override lazy val millDiscover: _root_.mill.define.Discover = _root_.mill.define.Discover[this.type]

}
abstract class package_ extends _root_.mill.main.RootModule()  {
//MILL_ORIGINAL_FILE_PATH=C:\Users\nogga\IdeaProjects\LSP\build.sc
//MILL_USER_CODE_START_MARKER
import mill._, scalalib._

object LSP extends ScalaModule {
  def scalaVersion = "2.13.16"

  override def resources = Task.Sources {
    Seq(PathRef(millSourcePath / "resources"))
  }

  override def ivyDeps = Agg(
    ivy"org.json4s::json4s-native:4.1.0-M8",
    ivy"org.eclipse.lsp4j:org.eclipse.lsp4j:0.23.1",
    ivy"io.circe::circe-core:0.15.0-M1",
    ivy"io.circe::circe-generic:0.15.0-M1",
    ivy"io.circe::circe-parser:0.15.0-M1"
  )

  override def scalacOptions = T {
    Seq("-Xmixin-force-forwarders:false")
  }
}

}