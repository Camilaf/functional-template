(ns exercise8)

(defn fderive
  "Approximates the derivative of the function at a point.."
  [function h]
  (fn [x] (/ (- (function (+ x h)) (function (- x h))) (* 2 h)))
)
