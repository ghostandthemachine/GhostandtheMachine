(ns ghostandthemachine.com.handlers.api
  )

(defn get-time [req]
  {:time (System/currentTimeMillis)
   :req (merge req {:async-channel nil})})
