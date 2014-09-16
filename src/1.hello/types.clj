; literal
(println (type 1 ))                            ; java.lang.long
(println (type 1.0))                           ; java.lang.double
(println (type \a))                            ; java.lang.character
(println (type "a"))                           ; java.lang.string
(println (type true))                          ; java.lang.boolean
(println (type 1N ))                           ; clojure.lang.bigint
(println (type :cat))                          ; clojure.lang.keyword
(println (type [1,2,3,4]))                     ; clojure.lang.persistentvector
(println (type {:key "name" :value "alan"}))   ; clojure.lang.PersistentArrayMap

; get var by type
(println (type (int 0)))                       ; java.lang.integer
(println (type (short 0)))                     ; java.lang.short
(println (type (byte 0)))                      ; java.lang.byte
(println (type (float 1.23)))                  ; java.lang.float
(println (type (double 1.23)))                 ; java.lang.double
(println (type (boolean false)))               ; java.lang.boolean
(println (type (class 'str)))                  ; java.lang.class
(println (type (str "hello")))                 ; java.lang.string
(println (type (list 1 2 3)))                  ; clojure.lang.persistentlist
(println (type (vector 1 2 3)))                ; clojure.lang.persistentvector
