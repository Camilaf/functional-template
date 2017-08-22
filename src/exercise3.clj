(ns exercise3)

(defn fibonacci
  "Obtains the fibonacci number corresponding to the index 'n'."
  [n]
  (if (< n 2) 
  	n
  	(+ (fibonacci (- n 1)) (fibonacci (- n 2)))
  )
)
