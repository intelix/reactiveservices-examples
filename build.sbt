Build.settings("reactiveservices-examples")

lazy val counterWeb = Project(id = "counter-web", base = file("counter/web")).enablePlugins(PlayScala, SbtWeb)
lazy val counterService = Project(id = "counter-service", base = file("counter/service")).enablePlugins(JavaAppPackaging)
lazy val counterWebsocket = Project(id = "counter-websocket", base = file("counter/websocket")).enablePlugins(JavaAppPackaging)

lazy val stocksWeb = Project(id = "stocks-web", base = file("stocks/web")).enablePlugins(PlayScala, SbtWeb)
lazy val stocksEngine = Project(id = "stocks-engine", base = file("stocks/engine")).enablePlugins(JavaAppPackaging)
lazy val stocksPricesource = Project(id = "stocks-pricesource", base = file("stocks/pricesource")).enablePlugins(JavaAppPackaging)
lazy val stocksWebsocket = Project(id = "stocks-websocket", base = file("stocks/websocket")).enablePlugins(JavaAppPackaging)

