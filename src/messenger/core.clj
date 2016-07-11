(ns messenger.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [messenger.routes.home :refer [home-routes]]
            [messenger.routes.webhook :refer [webhook-routes]]))

(defroutes app-routes
  home-routes
  webhook-routes
  (route/not-found "Not Found"))
