(ns messenger.routes.webhook
  (:require [compojure.core :refer :all]
            [ring.util.response :refer [redirect]]))

(def ^:private fb-hub-token "MY_TOKEN")
(def ^:private fb-hub-mode "subscribe")

(defn- fb-hook [params]
  (if (and (= (params "hub.mode") fb-hub-mode)
           (= (params "hub.verify_token") fb-hub-token))
    (params "hub.challenge")
    (redirect "/")))

(defroutes webhook-routes
  (GET "/webhook" {params :query-params} (fb-hook params)))
