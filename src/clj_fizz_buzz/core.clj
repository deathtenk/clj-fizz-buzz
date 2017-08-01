(ns clj-fizz-buzz.core)

(defn fizz-buzz [t]
  (loop [iterator t
         result []]
    (if (= iterator 0)
      result
      (let [mod-a (mod iterator 3)
            mod-b (mod iterator 5)]
      (cond 
        (and (= mod-a 0) (= mod-b 0))
        (recur (dec iterator) (conj result "fizzbuzz"))
        (= mod-a 0)
        (recur (dec iterator) (conj result "fizz"))
        (= mod-b 0)
        (recur (dec iterator) (conj result "buzz"))
        :else
        (recur (dec iterator) (conj result iterator)))))))
