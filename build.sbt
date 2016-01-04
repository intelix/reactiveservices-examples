Build.settings("reactiveservices-examples")

lazy val counterWeb = Project(id = "counter-web", base = file("counter/web")).enablePlugins(PlayScala, SbtWeb)
lazy val counterService = Project(id = "counter-service", base = file("counter/service")).enablePlugins(JavaAppPackaging)
lazy val counterWebsocket = Project(id = "counter-websocket", base = file("counter/websocket")).enablePlugins(JavaAppPackaging)

lazy val stocksWeb = Project(id = "stocks-web", base = file("stocks/web")).enablePlugins(PlayScala, SbtWeb)
lazy val stocksEngine = Project(id = "stocks-engine", base = file("stocks/engine")).enablePlugins(JavaAppPackaging)
lazy val stocksPricesource = Project(id = "stocks-pricesource", base = file("stocks/pricesource")).enablePlugins(JavaAppPackaging)
lazy val stocksWebsocket = Project(id = "stocks-websocket", base = file("stocks/websocket")).enablePlugins(JavaAppPackaging)

lazy val reactiveFxWeb = Project(id = "reactivefx-web", base = file("reactivefx/web")).enablePlugins(PlayScala, SbtWeb)
lazy val reactiveFxLegacyServiceAPI = Project(id = "reactivefx-legacyservice-api", base = file("reactivefx/legacyservice-api"))
lazy val reactiveFxLegacyService = Project(id = "reactivefx-legacyservice", base = file("reactivefx/legacyservice")).dependsOn(reactiveFxLegacyServiceAPI).enablePlugins(JavaAppPackaging)
lazy val reactiveFxPricesource = Project(id = "reactivefx-priceservice", base = file("reactivefx/priceservice")).dependsOn(reactiveFxLegacyServiceAPI).enablePlugins(JavaAppPackaging)
lazy val reactiveFxWebsocket = Project(id = "reactivefx-websocket", base = file("reactivefx/websocket")).enablePlugins(JavaAppPackaging)

