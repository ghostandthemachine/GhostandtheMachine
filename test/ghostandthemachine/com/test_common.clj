(ns ghostandthemachine.com.test-common
  (:use [ghostandthemachine.com.routes :only [app]]
        [clojure.data.json :only [read-str]]))

(def test-app (app))

(defn read-json [str] (read-str str :key-fn keyword))
