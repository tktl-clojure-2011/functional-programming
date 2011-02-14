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

(facts "seq-length"
       (seq-length [1 2 3])        => 3
       (seq-length '(:a :b :c :D)) => 4
       (seq-length [])             => 0)

(facts "my-reverse"
       (my-reverse [1 2 3 4])               => [4 3 2 1]
       (my-reverse '(:cat :pony :seahorse)) => [:seahorse :pony :cat]
       (my-reverse [])                      => ())

(facts "insert"
       (insert [] 2)    => [2]
       (insert [1 3] 2) => [1 2 3])

(facts "insertion-sort"
       (insertion-sort [])            => ()
       (insertion-sort [5 2 3 1])     => [1 2 3 5]
       (insertion-sort [9 8 7 6 5 4]) => [4 5 6 7 8 9])

(facts "seq-min-max"
       (seq-min-max [2 7 3 15 4]) => [2 15]
       (seq-min-max [-2 -100 -7]) => [-100 -2]
       (seq-min-max [1])          => [1 1])
