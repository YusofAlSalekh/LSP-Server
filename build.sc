import mill._, scalalib._

object LSP extends ScalaModule {
  def scalaVersion = "2.13.16"

  override def resources = Task.Sources {
    Seq(PathRef(millSourcePath / "resources"))
  }

  override def ivyDeps = Agg(
    ivy"org.eclipse.lsp4j:org.eclipse.lsp4j:0.23.1",
    ivy"io.circe::circe-core:0.15.0-M1",
    ivy"io.circe::circe-generic:0.15.0-M1",
    ivy"io.circe::circe-parser:0.15.0-M1"
  )

  override def scalacOptions = T {
    Seq("-Xmixin-force-forwarders:false")
  }
}
