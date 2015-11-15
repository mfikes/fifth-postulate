(defproject fifth-postulate "0.1.0-SNAPSHOT"
  :description "Test ClojureScript parallel compilation speedup"
  :url "https://github.com/mfikes/fifth-postulate"
  :license {:name "Eclipse Public License"
            :url "https://github.com/mfikes/fifth-postulate/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.178"]]
  :plugins [[lein-cljsbuild "1.1.1"]]
  :cljsbuild {
    :builds [{
        :source-paths ["src"]
        :compiler {
          :parallel-build false}}]})
