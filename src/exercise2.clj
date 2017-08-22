(ns exercise2)

(defn only-greater-than-five
  "Obtains a new list with the elements greater than five of the given list."
  [list]
  (filter (fn [element] (> element 5)) list)
)
