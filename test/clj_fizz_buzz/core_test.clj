(ns clj-fizz-buzz.core-test
  (:require [clojure.test :refer :all]
            [clj-fizz-buzz.core :refer :all]))

(deftest fizz-buzz-test
  (is (= (fizz-buzz 15) ["fizzbuzz" 14 13 "fizz" 11 "buzz" "fizz" 8 7 "fizz" "buzz" 4 "fizz" 2 1])))
