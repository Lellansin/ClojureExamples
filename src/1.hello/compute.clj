(println "-------- arithmetic --------")
(println (+ 7 3))  ; 10
(println (- 8 5))  ; 3
(println (* 4 3))  ; 12
(println (/ 3 2))  ; 3/2
(println (= 9 9))  ; true
(println (inc 9))  ; 10
(println (dec 9))  ; 8

(println "---------- logic -----------")
(println (and true false true)) ; false
(println (and true true true))  ; true
(println (and 1 2))             ; 2
(println (and 1 2 3))           ; 3
(println (or false 2 3))        ; 2
(println (or false nil))        ; nil
(println (not 2))               ; false
(println (not nil))             ; true