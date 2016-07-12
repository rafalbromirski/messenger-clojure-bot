(ns messenger.handler
  (:require [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.middleware.json :refer [wrap-json-response wrap-json-body]]
            [messenger.routes :refer [app-routes]]))

(def app
  (-> app-routes
      (wrap-json-body)
      (wrap-json-response)
      (wrap-defaults site-defaults)))
