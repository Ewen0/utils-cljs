(ns com.ewen.utils-cljs.utils
  "Utilities functions"
  (:require [clojure.string :refer [replace]]))


;; ## Utilities functions

(defn log 
  "Log an expression into the browser javascript console"
  [in] (.log js/console in))


(defn space-to-dash 
  "Replace all the spaces in the provided string by dashes

Ex. (replace \"er  ee ee \" \" \" \"-\")
-> \"er--ee-ee-\"
"
  [s]
  (replace s " " "-"))


(defn get-load-fn []
(if (== (goog/typeOf (.-onload js/window)) "function")
  (.-onload js/window)
  #()))


(defn add-load-event 
"Add a function to the javascript `window.onload` property."
[func]
  (let [old-onload (get-load-fn)]
    (do (set! (.-onload js/window) #(do (old-onload) (func))))))






