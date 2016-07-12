(ns messenger.core
  (:require [ring.adapter.jetty :as ring]
            [compojure.core :refer :all]
            [compojure.route :refer [not-found]]
            [messenger.handler :refer [app]]
            [messenger.routes :refer [app-routes]]))

(defn start [port]
  (ring/run-jetty app {:port port
                       :join? false}))

(defn -main []
  (let [port (Integer. (or (System/getenv "PORT") "3000"))]
    (start port)))
