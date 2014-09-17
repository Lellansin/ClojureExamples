(def x 1)
(def y 2)

(if (> x y) 
    (println x " > " y)  ; if true
    (println x " < " y)) ; if false

(if (= x y) 
    (println x " = " y)  ; if true
    (do                  ; if false
        (println x " != " y)
        (println "do more")))