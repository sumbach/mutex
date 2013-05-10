(ns mutex.mutex-test
  (:use clojure.test)
  (:import (mutex Mutex)))

(deftest mutex-test
  (let [lock (Mutex.)]
    (.lock lock)
    (try
      ;; do stuff
      (finally
       (.unlock lock)))))
