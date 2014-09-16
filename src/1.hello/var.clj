; literal
(println (type 1 ))                            ; java.lang.Long
(println (type 1N ))                           ; clojure.lang.BigInt
(println (type 1.0))                           ; java.lang.Double
(println (type \a))                            ; java.lang.Character
(println (type "a"))                           ; java.lang.String
(println (type [1,2,3,4]))                     ; clojure.lang.PersistentVector
(println (type {:key "name" :value "Alan"}))   ; clojure.lang.PersistentArrayMap

; Get var by type
(println (type (int 0)))                       ; java.lang.Integer
(println (type (short 0)))                     ; java.lang.Short
(println (type (byte 0)))                      ; java.lang.Byte
(println (type (float 1.23)))                  ; java.lang.Float
(println (type (double 1.23)))                 ; java.lang.double