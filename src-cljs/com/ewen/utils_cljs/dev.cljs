(ns com.ewen.utils-cljs.dev
  (:require [clojure.browser.repl]))

(def connect-repl
  "Connects to the browser connected REPL"
  #(clojure.browser.repl/connect "http://localhost:9000/repl"))


