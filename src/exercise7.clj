(ns exercise7)

(defmulti fmap (fn [function collection] (type collection)))

(defmethod fmap clojure.lang.PersistentList [function collection]
  (map function collection)
)

(defmethod fmap clojure.lang.PersistentVector [function collection] 
  (into [] (map function collection))
)

(defmethod fmap clojure.lang.PersistentArrayMap [function collection] 
  (into {} (for [[key value] collection] [key (function value)]))
)
