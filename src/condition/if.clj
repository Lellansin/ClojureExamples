(def x 1)
(def y 2)

(if (> x y) 
    (println x " > " y)
    (println x " < " y))

(if (= x y) 
    (println x " = " y)
    (do 
        (println x " != " y)
        (println "do more")))