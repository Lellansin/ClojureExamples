(println (range 1 10))         ; (1 2 3 4 5 6 7 8 9)
(println (range 1 (inc 10)))   ; (1 2 3 4 5 6 7 8 9 10)
(println (range 1 11))         ; (1 2 3 4 5 6 7 8 9 10)
(println (type (range 1 11)))  ; clojure.lang.LazySeq