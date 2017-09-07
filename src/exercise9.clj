(ns exercise9)

(defmulti things (fn [thing] (type thing)))

(defmethod things java.lang.String [thing]
  "Soy un String"
)

(defmethod things clojure.lang.PersistentVector [thing]
  "Soy un Vector"
)

(defmethod things clojure.lang.PersistentArrayMap [thing] 
  "Soy un Map"
)

(defmethod things :default [thing] 
  "Soy un default"
)
