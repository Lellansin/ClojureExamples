(use 'clojure.set)
(def languages #{"java" "c" "d" "clojure"})
(def beverages #{"java" "chai" "pop"})

(println (union languages beverages))
(println (difference languages beverages))