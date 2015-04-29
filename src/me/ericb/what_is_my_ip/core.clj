(ns me.ericb.what-is-my-ip.core
  (:require [clojure.pprint :refer [pprint]]
            [compojure.core :refer [defroutes GET]]
            [environ.core :refer [env]]
            [org.httpkit.server :refer [run-server]]))

(defroutes app
  (GET "/" {{x-real-ip "x-real-ip"} :headers}
    {:status  200
     :headers {"Content-Type" "text/plain"}
     :body    x-real-ip}))

(defn -main [& args]
  (->> (or (some-> (env :port) (Integer/parseInt)) 5000)
       (hash-map :port)
       (run-server app)))
