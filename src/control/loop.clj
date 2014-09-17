(println (loop [result [] x 10] 
    (if (zero? x)
        result
        (recur (conj result x) (dec x)))))

(loop [result [] x 5] 
    (if (> x 0)
        (recur (println "x:" x) (dec x))))