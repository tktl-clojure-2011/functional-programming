(ns functional-programming.test-core
  (:use functional-programming.core
        midje.sweet))

(facts "concat-all"
       (concat-all []) => []
       (concat-all [[1 2] [3 4] [5 6]]) => [1 2 3 4 5 6])

(facts "string-cat"
       (string-cat ["I" "am" "Legend"])   => "I am Legend"
       (string-cat ["Scanner" "Darkly"])  => "Scanner Darkly"
       (string-cat ["More  " "  Space "]) => "More     Space ")
