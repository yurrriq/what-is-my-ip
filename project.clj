(defproject me.ericb.what-is-my-ip "1.0.0-SNAPSHOT"
  :description "IP echo service."
  :url "https://github.com/yurrriq/what-is-my-ip"
  :license {:name "WTFPL"
            :url "http://www.wtfpl.net"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [environ "1.0.0"]
                 [http-kit "2.1.19"]
                 [ring/ring-defaults "0.1.4"]]

  :main ^:skip-aot me.ericb.what-is-my-ip.core)
