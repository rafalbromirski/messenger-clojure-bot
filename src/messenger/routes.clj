(ns messenger.routes
  (:require [compojure.core :refer :all]
            [compojure.route :refer [not-found]]
            [messenger.routes.home :refer [home-routes]]
            [messenger.routes.webhook :refer [webhook-routes]]))

(defroutes app-routes
  home-routes
  webhook-routes
  (not-found "Not Found"))
