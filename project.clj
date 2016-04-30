(defproject global-growth "0.1.0-SNAPSHOT"
  :description "Demonstrates the use of the World Bank API"
  :url "https://github.com/clojurebridge/global-growth"
  :license {:name "Creative Commons Attribution License"
            :url "http://creativecommons.org/licenses/by/3.0/"}
  :plugins [[lein-ring "0.9.7"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "3.0.1"]
                 [cheshire "5.6.1"]
                 [ring "1.4.0"]
                 [compojure "1.5.0"]
                 [hiccup "1.0.5"]]
  :main ^:skip-aot global-growth.core
  :ring {:handler global-growth.web/handler}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
