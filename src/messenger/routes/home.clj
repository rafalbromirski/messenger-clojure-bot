(ns messenger.routes.home
  (:require [compojure.core :refer :all]))

(defroutes home-routes
  (GET "/" [] "beep"))
