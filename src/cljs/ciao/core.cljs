(ns ciao.core)

(defn foo [greeting]
  (if greeting 
    (str greeting "ClojureScript!")
    (str "Hello, ClojureScript!")))

(.write js/document (foo "Welcome, "))
