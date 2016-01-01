import Build._

settings("stocks-websocket") ++ websocketServer ++ auth ++ launcher

