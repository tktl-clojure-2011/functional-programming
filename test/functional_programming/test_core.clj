(ns functional-programming.test-core
  (:use functional-programming.core
        midje.sweet))

(facts "concat-all"
       (concat-all []) => []
       (concat-all [[1 2] [3 4] [5 6]]) => [1 2 3 4 5 6])
