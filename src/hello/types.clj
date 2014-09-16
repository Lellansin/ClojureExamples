; literal
(println (type 1 ))                            ; java.lang.Long
(println (type 1.0))                           ; java.lang.Double
(println (type \a))                            ; java.lang.Character
(println (type "a"))                           ; java.lang.String
(println (type true))                          ; java.lang.Boolean
(println (type 1N ))                           ; clojure.lang.BigInt
(println (type :cat))                          ; clojure.lang.Keyword
(println (type [1,2,3,4]))                     ; clojure.lang.PersistentVector
(println (type {:key "name" :value "alan"}))   ; clojure.lang.PersistentArrayMap

; get var by type
(println (type (int 0)))                       ; java.lang.Integer
(println (type (short 0)))                     ; java.lang.Short
(println (type (byte 0)))                      ; java.lang.Byte
(println (type (float 1.23)))                  ; java.lang.Float
(println (type (double 1.23)))                 ; java.lang.Double
(println (type (boolean false)))               ; java.lang.Boolean
(println (type (class 'str)))                  ; java.lang.Class
(println (type (str "hello")))                 ; java.lang.String
(println (type (range 1 11)))                  ; clojure.lang.LazySeq
(println (type (list 1 2 3)))                  ; clojure.lang.PersistentList
(println (type (vector 1 2 3)))                ; clojure.lang.PersistentVector
