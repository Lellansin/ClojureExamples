; (def the-digits
;     (map #(Integer. (str %)) 
;         (filter #(Character/isDigit %) (seq big-num-str))))