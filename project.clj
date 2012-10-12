(defproject cronj "0.3.4"
  :description "This is task-scheduling library inspired by the cron syntax."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [clj-time "0.4.4"]
                 [hara "0.3.2"]]               
  :profiles {:dev {:dependencies [[midje "1.4.0"]]}})
